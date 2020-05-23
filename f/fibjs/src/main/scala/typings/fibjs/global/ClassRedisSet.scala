package typings.fibjs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
  * @brief Redis 数据库客户端 Set 对象，此对象为包含指定 key 的客户端，只有调用其方法才会操作数据库
  * @detail 用以操作 Redis 的 Set 对象，创建方法：,```JavaScript,var db = require("db");,var rdb = new db.openRedis("redis-server");,var set = rdb.getSet("test");,```
  */
@JSGlobal("Class_RedisSet")
@js.native
class ClassRedisSet ()
  extends typings.fibjs.ClassRedisSet

