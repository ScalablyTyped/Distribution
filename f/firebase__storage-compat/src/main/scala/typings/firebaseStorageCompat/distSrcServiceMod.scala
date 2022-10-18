package typings.firebaseStorageCompat

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseStorageCompat.anon.MockUserToken
import typings.firebaseStorageTypes.mod.FirebaseStorage
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcServiceMod {
  
  @JSImport("@firebase/storage-compat/dist/src/service", "StorageServiceCompat")
  @js.native
  open class StorageServiceCompat protected ()
    extends FirebaseStorage
       with Compat[typings.firebaseStorage.mod.FirebaseStorage] {
    def this(app: FirebaseApp, _delegate: typings.firebaseStorage.mod.FirebaseStorage) = this()
    
    /* CompleteClass */
    var _delegate: typings.firebaseStorage.mod.FirebaseStorage = js.native
    
    @JSName("maxOperationRetryTime")
    def maxOperationRetryTime_MStorageServiceCompat: Double = js.native
    
    @JSName("maxUploadRetryTime")
    def maxUploadRetryTime_MStorageServiceCompat: Double = js.native
    
    def useEmulator(host: String, port: Double, options: MockUserToken): Unit = js.native
  }
}
