package typings.expo.globalsWebMod

import typings.expoSqlite.sqliteTypesMod.WebSQLDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/globals.web", "SQLite")
@js.native
object SQLite extends js.Object {
  @js.native
  class SQLError ()
    extends typings.expoSqlite.mod.SQLError
  
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

