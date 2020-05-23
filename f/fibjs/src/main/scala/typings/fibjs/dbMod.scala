package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
  * @brief 数据库访问模块
  * @detail 基础模块。可用于创建和操作数据库资源，引用方式：,```JavaScript,var db = require('db');,```
  */
@JSImport("db", JSImport.Namespace)
@js.native
object dbMod extends js.Object {
  def escape(str: String): String = js.native
  def escape(str: String, mysql: Boolean): String = js.native
  def format(sql: String, args: js.Any*): String = js.native
  def formatMSSQL(sql: String, args: js.Any*): String = js.native
  def formatMySQL(sql: String, args: js.Any*): String = js.native
  def open(connString: String): ClassObject = js.native
  def openLevelDB(connString: String): ClassLevelDB = js.native
  def openMSSQL(connString: String): ClassMSSQL = js.native
  def openMongoDB(connString: String): ClassMongoDB = js.native
  def openMySQL(connString: String): ClassMySQL = js.native
  def openRedis(connString: String): ClassRedis = js.native
  def openSQLite(connString: String): ClassSQLite = js.native
}

