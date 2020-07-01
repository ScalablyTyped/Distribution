package typings.expoSqlite

import typings.expoSqlite.sqliteTypesMod.Database
import typings.expoSqlite.sqliteTypesMod.DatabaseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-sqlite/build/SQLite.web", JSImport.Namespace)
@js.native
object sqliteWebMod extends js.Object {
  def openDatabase(name: String): Database = js.native
  def openDatabase(name: String, version: String): Database = js.native
  def openDatabase(name: String, version: String, description: String): Database = js.native
  def openDatabase(name: String, version: String, description: String, size: Double): Database = js.native
  def openDatabase(name: String, version: String, description: String, size: Double, callback: DatabaseCallback): Database = js.native
}

