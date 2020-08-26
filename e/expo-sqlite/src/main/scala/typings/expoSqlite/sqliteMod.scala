package typings.expoSqlite

import typings.expoSqlite.sqliteTypesMod.WebSQLDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-sqlite/build/SQLite", JSImport.Namespace)
@js.native
object sqliteMod extends js.Object {
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
}

