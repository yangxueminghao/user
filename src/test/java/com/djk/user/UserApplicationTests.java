package com.djk.user;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.djk.user.dao.studentdal;
import com.djk.user.model.student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserApplicationTests {
    @Autowired
    studentdal studal;
    @Test
    void contextLoads() {
        System.out.println(studal.selectPage(new Page<student>(1,5),null));
        System.out.println(studal.selectById(40));
    }

}
