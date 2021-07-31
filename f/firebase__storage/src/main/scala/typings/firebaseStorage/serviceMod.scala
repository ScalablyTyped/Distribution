package typings.firebaseStorage

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseStorage.anon.Delete
import typings.firebaseStorage.srcServiceMod.StorageService
import typings.firebaseStorageTypes.mod.FirebaseStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceMod {
  
  @JSImport("@firebase/storage/dist/compat/service", "StorageServiceCompat")
  @js.native
  class StorageServiceCompat protected () extends FirebaseStorage {
    def this(app: FirebaseApp, _delegate: StorageService) = this()
    
    var INTERNAL: Delete = js.native
    
    val _delegate: StorageService = js.native
    
    @JSName("maxOperationRetryTime")
    def maxOperationRetryTime_MStorageServiceCompat: Double = js.native
    
    @JSName("maxUploadRetryTime")
    def maxUploadRetryTime_MStorageServiceCompat: Double = js.native
  }
}
