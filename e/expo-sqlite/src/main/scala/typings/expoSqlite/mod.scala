package typings.expoSqlite

import typings.expoSqlite.sqliteTypesMod.WebSQLDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-sqlite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-sqlite", "SQLError")
  @js.native
  class SQLError ()
    extends typings.expoSqlite.sqliteTypesMod.SQLError
  /* static members */
  object SQLError {
    
    @JSImport("expo-sqlite", "SQLError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo-sqlite", "SQLError.CONSTRAINT_ERR")
    @js.native
    def CONSTRAINT_ERR: Double = js.native
    @scala.inline
    def CONSTRAINT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONSTRAINT_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite", "SQLError.DATABASE_ERR")
    @js.native
    def DATABASE_ERR: Double = js.native
    @scala.inline
    def DATABASE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATABASE_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite", "SQLError.QUOTA_ERR")
    @js.native
    def QUOTA_ERR: Double = js.native
    @scala.inline
    def QUOTA_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUOTA_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite", "SQLError.SYNTAX_ERR")
    @js.native
    def SYNTAX_ERR: Double = js.native
    @scala.inline
    def SYNTAX_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYNTAX_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite", "SQLError.TIMEOUT_ERR")
    @js.native
    def TIMEOUT_ERR: Double = js.native
    @scala.inline
    def TIMEOUT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite", "SQLError.TOO_LARGE_ERR")
    @js.native
    def TOO_LARGE_ERR: Double = js.native
    @scala.inline
    def TOO_LARGE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOO_LARGE_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite", "SQLError.UNKNOWN_ERR")
    @js.native
    def UNKNOWN_ERR: Double = js.native
    @scala.inline
    def UNKNOWN_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERR")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-sqlite", "SQLError.VERSION_ERR")
    @js.native
    def VERSION_ERR: Double = js.native
    @scala.inline
    def VERSION_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION_ERR")(x.asInstanceOf[js.Any])
  }
  
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
