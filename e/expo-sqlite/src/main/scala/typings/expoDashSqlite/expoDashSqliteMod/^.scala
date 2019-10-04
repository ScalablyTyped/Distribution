package typings.expoDashSqlite.expoDashSqliteMod

import typings.expoDashSqlite.buildSQLiteDotTypesMod.WebSQLDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-sqlite", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
}

