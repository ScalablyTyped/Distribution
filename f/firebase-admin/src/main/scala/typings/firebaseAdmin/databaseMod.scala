package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import typings.firebaseAdmin.libDatabaseDatabaseMod.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object databaseMod {
  
  @JSImport("firebase-admin/database", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/database", "ServerValue")
  @js.native
  val ServerValue: typings.firebaseDatabaseTypes.mod.ServerValue = js.native
  
  inline def enableLogging(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")().asInstanceOf[Any]
  inline def enableLogging(logger: js.Function1[/* a */ String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def enableLogging(logger: js.Function1[/* a */ String, Any], persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def enableLogging(logger: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def enableLogging(logger: Boolean, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def enableLogging(logger: Unit, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getDatabase(): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")().asInstanceOf[Database]
  inline def getDatabase(app: App): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any]).asInstanceOf[Database]
  
  inline def getDatabaseWithUrl(url: String): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabaseWithUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Database]
  inline def getDatabaseWithUrl(url: String, app: App): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabaseWithUrl")(url.asInstanceOf[js.Any], app.asInstanceOf[js.Any])).asInstanceOf[Database]
}
