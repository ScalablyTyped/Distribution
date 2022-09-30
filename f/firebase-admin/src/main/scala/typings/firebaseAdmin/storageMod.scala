package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageMod {
  
  @JSImport("firebase-admin/lib/storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/storage", "Storage")
  @js.native
  open class Storage ()
    extends typings.firebaseAdmin.storageStorageMod.Storage
  
  inline def getStorage(): typings.firebaseAdmin.storageStorageMod.Storage = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")().asInstanceOf[typings.firebaseAdmin.storageStorageMod.Storage]
  inline def getStorage(app: App): typings.firebaseAdmin.storageStorageMod.Storage = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.storageStorageMod.Storage]
}
