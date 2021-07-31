package typings.expoSqlite

import typings.expoSqlite.sqliteTypesMod.WebSQLDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqliteMod {
  
  @JSImport("expo-sqlite/build/SQLite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def openDatabase(name: String): WebSQLDatabase = ^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any]).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(name: String, version: String): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(name: String, version: String, description: String): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(name: String, version: String, description: String, size: Double): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(
    name: String,
    version: String,
    description: String,
    size: Double,
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(
    name: String,
    version: String,
    description: String,
    size: Unit,
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(name: String, version: String, description: Unit, size: Double): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(
    name: String,
    version: String,
    description: Unit,
    size: Double,
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(
    name: String,
    version: String,
    description: Unit,
    size: Unit,
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(name: String, version: Unit, description: String): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(name: String, version: Unit, description: String, size: Double): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(
    name: String,
    version: Unit,
    description: String,
    size: Double,
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(
    name: String,
    version: Unit,
    description: String,
    size: Unit,
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(name: String, version: Unit, description: Unit, size: Double): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(
    name: String,
    version: Unit,
    description: Unit,
    size: Double,
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
  @scala.inline
  def openDatabase(
    name: String,
    version: Unit,
    description: Unit,
    size: Unit,
    callback: js.Function1[/* db */ WebSQLDatabase, Unit]
  ): WebSQLDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WebSQLDatabase]
}
