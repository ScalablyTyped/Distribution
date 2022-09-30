package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 数据库访问模块
  * @detail 基础模块。可用于创建和操作数据库资源，引用方式：,```JavaScript,var db = require('db');,```
  */
object dbMod {
  
  @JSImport("db", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def escape(str: String, mysql: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any], mysql.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def format(sql: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(sql.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def formatMSSQL(sql: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMSSQL")(scala.List(sql.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def formatMySQL(sql: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMySQL")(scala.List(sql.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def open(connString: String): ClassObject = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassObject]
  
  inline def openLevelDB(connString: String): ClassLevelDB = ^.asInstanceOf[js.Dynamic].applyDynamic("openLevelDB")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassLevelDB]
  
  inline def openMSSQL(connString: String): ClassMSSQL = ^.asInstanceOf[js.Dynamic].applyDynamic("openMSSQL")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassMSSQL]
  
  inline def openMongoDB(connString: String): ClassMongoDB = ^.asInstanceOf[js.Dynamic].applyDynamic("openMongoDB")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassMongoDB]
  
  inline def openMySQL(connString: String): ClassMySQL = ^.asInstanceOf[js.Dynamic].applyDynamic("openMySQL")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassMySQL]
  
  inline def openRedis(connString: String): ClassRedis = ^.asInstanceOf[js.Dynamic].applyDynamic("openRedis")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassRedis]
  
  inline def openSQLite(connString: String): ClassSQLite = ^.asInstanceOf[js.Dynamic].applyDynamic("openSQLite")(connString.asInstanceOf[js.Any]).asInstanceOf[ClassSQLite]
}
