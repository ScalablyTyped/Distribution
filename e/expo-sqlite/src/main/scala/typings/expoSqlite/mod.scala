package typings.expoSqlite

import typings.expoSqlite.sqliteTypesMod.WebSQLDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-sqlite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SQLError ()
    extends typings.expoSqlite.sqliteTypesMod.SQLError
  
  def openDatabase(name: String): WebSQLDatabase = js.native
  def openDatabase(
    name: String,
    version: js.UndefOr[scala.Nothing],
    description: js.UndefOr[scala.Nothing],
    size: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = js.native
  def openDatabase(
    name: String,
    version: js.UndefOr[scala.Nothing],
    description: js.UndefOr[scala.Nothing],
    size: Double
  ): WebSQLDatabase = js.native
  def openDatabase(
    name: String,
    version: js.UndefOr[scala.Nothing],
    description: js.UndefOr[scala.Nothing],
    size: Double,
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = js.native
  def openDatabase(name: String, version: js.UndefOr[scala.Nothing], description: String): WebSQLDatabase = js.native
  def openDatabase(
    name: String,
    version: js.UndefOr[scala.Nothing],
    description: String,
    size: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = js.native
  def openDatabase(name: String, version: js.UndefOr[scala.Nothing], description: String, size: Double): WebSQLDatabase = js.native
  def openDatabase(
    name: String,
    version: js.UndefOr[scala.Nothing],
    description: String,
    size: Double,
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = js.native
  def openDatabase(name: String, version: String): WebSQLDatabase = js.native
  def openDatabase(
    name: String,
    version: String,
    description: js.UndefOr[scala.Nothing],
    size: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = js.native
  def openDatabase(name: String, version: String, description: js.UndefOr[scala.Nothing], size: Double): WebSQLDatabase = js.native
  def openDatabase(
    name: String,
    version: String,
    description: js.UndefOr[scala.Nothing],
    size: Double,
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = js.native
  def openDatabase(name: String, version: String, description: String): WebSQLDatabase = js.native
  def openDatabase(
    name: String,
    version: String,
    description: String,
    size: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = js.native
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

