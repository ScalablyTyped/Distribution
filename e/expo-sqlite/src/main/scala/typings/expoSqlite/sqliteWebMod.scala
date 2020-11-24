package typings.expoSqlite

import typings.expoSqlite.sqliteTypesMod.Database
import typings.expoSqlite.sqliteTypesMod.DatabaseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-sqlite/build/SQLite.web", JSImport.Namespace)
@js.native
object sqliteWebMod extends js.Object {
  
  def openDatabase(name: String): Database = js.native
  def openDatabase(
    name: String,
    version: js.UndefOr[scala.Nothing],
    description: js.UndefOr[scala.Nothing],
    size: js.UndefOr[scala.Nothing],
    callback: DatabaseCallback
  ): Database = js.native
  def openDatabase(
    name: String,
    version: js.UndefOr[scala.Nothing],
    description: js.UndefOr[scala.Nothing],
    size: Double
  ): Database = js.native
  def openDatabase(
    name: String,
    version: js.UndefOr[scala.Nothing],
    description: js.UndefOr[scala.Nothing],
    size: Double,
    callback: DatabaseCallback
  ): Database = js.native
  def openDatabase(name: String, version: js.UndefOr[scala.Nothing], description: String): Database = js.native
  def openDatabase(
    name: String,
    version: js.UndefOr[scala.Nothing],
    description: String,
    size: js.UndefOr[scala.Nothing],
    callback: DatabaseCallback
  ): Database = js.native
  def openDatabase(name: String, version: js.UndefOr[scala.Nothing], description: String, size: Double): Database = js.native
  def openDatabase(
    name: String,
    version: js.UndefOr[scala.Nothing],
    description: String,
    size: Double,
    callback: DatabaseCallback
  ): Database = js.native
  def openDatabase(name: String, version: String): Database = js.native
  def openDatabase(
    name: String,
    version: String,
    description: js.UndefOr[scala.Nothing],
    size: js.UndefOr[scala.Nothing],
    callback: DatabaseCallback
  ): Database = js.native
  def openDatabase(name: String, version: String, description: js.UndefOr[scala.Nothing], size: Double): Database = js.native
  def openDatabase(
    name: String,
    version: String,
    description: js.UndefOr[scala.Nothing],
    size: Double,
    callback: DatabaseCallback
  ): Database = js.native
  def openDatabase(name: String, version: String, description: String): Database = js.native
  def openDatabase(
    name: String,
    version: String,
    description: String,
    size: js.UndefOr[scala.Nothing],
    callback: DatabaseCallback
  ): Database = js.native
  def openDatabase(name: String, version: String, description: String, size: Double): Database = js.native
  def openDatabase(name: String, version: String, description: String, size: Double, callback: DatabaseCallback): Database = js.native
}
