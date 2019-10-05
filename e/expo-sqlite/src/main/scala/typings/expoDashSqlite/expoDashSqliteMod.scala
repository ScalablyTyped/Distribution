package typings.expoDashSqlite

import typings.expoDashSqlite.buildSQLiteDotTypesMod.WebSQLDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-sqlite", JSImport.Namespace)
@js.native
object expoDashSqliteMod extends js.Object {
  @js.native
  class SQLError ()
    extends typings.expoDashSqlite.buildSQLiteDotTypesMod.SQLError
  
  def openDatabase(name: String): WebSQLDatabase = js.native
  def openDatabase(name: String, version: String): WebSQLDatabase = js.native
  def openDatabase(name: String, version: String, description: String): WebSQLDatabase = js.native
  def openDatabase(name: String, version: String, description: String, size: Double): WebSQLDatabase = js.native
  def openDatabase(
    name: String,
    version: String,
    description: String,
    size: Double,
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = js.native
  /* static members */
  @js.native
  object SQLError extends js.Object {
    var CONSTRAINT_ERR: Double = js.native
    var DATABASE_ERR: Double = js.native
    var QUOTA_ERR: Double = js.native
    var SYNTAX_ERR: Double = js.native
    var TIMEOUT_ERR: Double = js.native
    var TOO_LARGE_ERR: Double = js.native
    var UNKNOWN_ERR: Double = js.native
    var VERSION_ERR: Double = js.native
  }
  
}

