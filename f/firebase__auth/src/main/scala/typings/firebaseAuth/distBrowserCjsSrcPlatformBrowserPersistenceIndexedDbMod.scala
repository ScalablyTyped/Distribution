package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsSrcCorePersistenceMod.PersistenceValue
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.Persistence
import typings.std.IDBDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcPlatformBrowserPersistenceIndexedDbMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/platform_browser/persistence/indexed_db", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/platform_browser/persistence/indexed_db", "DB_NAME")
  @js.native
  val DB_NAME: /* "firebaseLocalStorageDb" */ String = js.native
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/platform_browser/persistence/indexed_db", "_POLLING_INTERVAL_MS")
  @js.native
  val _POLLING_INTERVAL_MS: /* 800 */ Double = js.native
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/platform_browser/persistence/indexed_db", "_TRANSACTION_RETRY_COUNT")
  @js.native
  val _TRANSACTION_RETRY_COUNT: /* 3 */ Double = js.native
  
  inline def clearDatabase(db: IDBDatabase): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("_clearDatabase")(db.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteDatabase(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("_deleteDatabase")().asInstanceOf[js.Promise[Unit]]
  
  inline def deleteObject(db: IDBDatabase, key: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("_deleteObject")(db.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/platform_browser/persistence/indexed_db", "indexedDBLocalPersistence")
  @js.native
  val indexedDBLocalPersistence: Persistence = js.native
  
  inline def openDatabase(): js.Promise[IDBDatabase] = ^.asInstanceOf[js.Dynamic].applyDynamic("_openDatabase")().asInstanceOf[js.Promise[IDBDatabase]]
  
  inline def putObject(db: IDBDatabase, key: String, value: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("_putObject")(db.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def putObject(db: IDBDatabase, key: String, value: PersistenceValue): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("_putObject")(db.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
