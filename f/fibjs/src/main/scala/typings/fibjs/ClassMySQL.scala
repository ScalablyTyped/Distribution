package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassMySQL extends ClassDbConnection {
  /**
    * class prop 
    *
    * 
    * @brief 数据库连接接收缓存尺寸
    * 
    * 
    * @type Integer
    */
  var rxBufferSize: Double = js.native
  /**
    * class prop 
    *
    * 
    * @brief 数据库连接发送缓存尺寸
    * 
    * 
    * @type Integer
    */
  var txBufferSize: Double = js.native
  /**
    * 
    * @brief 选择当前数据库连接的缺省数据库
    * @param dbName 指定数据库名
    * 
    * 
    * @async
    */
  def use(dbName: String): Unit = js.native
}

