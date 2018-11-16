package typings
package fibjsLib

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
  def escape(str: java.lang.String): java.lang.String = js.native
  def escape(str: java.lang.String, mysql: scala.Boolean): java.lang.String = js.native
  def format(sql: java.lang.String, args: js.Any*): java.lang.String = js.native
  def formatMSSQL(sql: java.lang.String, args: js.Any*): java.lang.String = js.native
  def formatMySQL(sql: java.lang.String, args: js.Any*): java.lang.String = js.native
  def open(connString: java.lang.String): fibjsLib.Class__object = js.native
  def openLevelDB(connString: java.lang.String): fibjsLib.Class_LevelDB = js.native
  def openMSSQL(connString: java.lang.String): fibjsLib.Class_MSSQL = js.native
  def openMongoDB(connString: java.lang.String): fibjsLib.Class_MongoDB = js.native
  def openMySQL(connString: java.lang.String): fibjsLib.Class_MySQL = js.native
  def openRedis(connString: java.lang.String): fibjsLib.Class_Redis = js.native
  def openSQLite(connString: java.lang.String): fibjsLib.Class_SQLite = js.native
}

