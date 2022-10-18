package typings.expoSqlite

import typings.expoSqlite.buildSqliteDottypesMod.Database
import typings.expoSqlite.buildSqliteDottypesMod.DatabaseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSqliteDotwebMod {
  
  @JSImport("expo-sqlite/build/SQLite.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def openDatabase(name: String): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any]).asInstanceOf[Database]
  inline def openDatabase(name: String, version: String): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: String, description: String): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: String, description: String, size: Double): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: String, description: String, size: Double, callback: DatabaseCallback): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: String, description: String, size: Unit, callback: DatabaseCallback): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: String, description: Unit, size: Double): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: String, description: Unit, size: Double, callback: DatabaseCallback): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: String, description: Unit, size: Unit, callback: DatabaseCallback): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: Unit, description: String): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: Unit, description: String, size: Double): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: Unit, description: String, size: Double, callback: DatabaseCallback): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: Unit, description: String, size: Unit, callback: DatabaseCallback): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: Unit, description: Unit, size: Double): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: Unit, description: Unit, size: Double, callback: DatabaseCallback): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def openDatabase(name: String, version: Unit, description: Unit, size: Unit, callback: DatabaseCallback): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], description.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Database]
}
