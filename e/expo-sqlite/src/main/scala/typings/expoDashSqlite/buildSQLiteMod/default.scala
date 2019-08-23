package typings.expoDashSqlite.buildSQLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-sqlite/build/SQLite", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("openDatabase")
  var openDatabase_Original: js.Function5[
    /* name */ String, 
    /* version */ js.UndefOr[String], 
    /* description */ js.UndefOr[String], 
    /* size */ js.UndefOr[Double], 
    /* callback */ js.UndefOr[js.Function1[/* db */ WebSQLDatabase, Unit]], 
    WebSQLDatabase
  ] = js.native
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

