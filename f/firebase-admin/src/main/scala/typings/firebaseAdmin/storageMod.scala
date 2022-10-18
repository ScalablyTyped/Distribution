package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object storageMod {
  
  @JSImport("firebase-admin/storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/storage", "Storage")
  @js.native
  open class Storage ()
    extends typings.firebaseAdmin.libStorageMod.Storage
  
  inline def getStorage(): typings.firebaseAdmin.libStorageStorageMod.Storage = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")().asInstanceOf[typings.firebaseAdmin.libStorageStorageMod.Storage]
  inline def getStorage(app: App): typings.firebaseAdmin.libStorageStorageMod.Storage = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.libStorageStorageMod.Storage]
}
