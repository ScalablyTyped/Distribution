package typings.firebaseStorage

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseStorage.locationMod.Location
import typings.firebaseStorage.referenceMod.Reference
import typings.firebaseStorage.requestMod.Request
import typings.firebaseStorage.requestinfoMod.RequestInfo
import typings.firebaseStorage.xhriopoolMod.XhrIoPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/service", JSImport.Namespace)
@js.native
object serviceMod extends js.Object {
  @js.native
  class ServiceInternals protected () extends js.Object {
    def this(service: StorageService) = this()
    var service_ : StorageService = js.native
    /**
      * Called when the associated app is deleted.
      */
    def delete(): js.Promise[Unit] = js.native
  }
  
  @js.native
  class StorageService protected () extends js.Object {
    def this(app: Null, authProvider: Provider[FirebaseAuthInternalName], pool: XhrIoPool) = this()
    def this(app: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName], pool: XhrIoPool) = this()
    def this(app: Null, authProvider: Provider[FirebaseAuthInternalName], pool: XhrIoPool, url: String) = this()
    def this(app: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName], pool: XhrIoPool, url: String) = this()
    val appId_ : js.Any = js.native
    var app_ : js.Any = js.native
    val authProvider_ : js.Any = js.native
    val bucket_ : js.Any = js.native
    var deleted_ : js.Any = js.native
    val internals_ : js.Any = js.native
    var maxOperationRetryTime_ : js.Any = js.native
    var maxUploadRetryTime_ : js.Any = js.native
    val pool_ : js.Any = js.native
    val requests_ : js.Any = js.native
    def INTERNAL: ServiceInternals = js.native
    def app: FirebaseApp | Null = js.native
    /**
      * Stop running requests and prevent more from being created.
      */
    def deleteApp(): Unit = js.native
    def getAuthToken(): js.Promise[String | Null] = js.native
    def makeRequest[T](requestInfo: RequestInfo[T]): Request[T] = js.native
    def makeRequest[T](requestInfo: RequestInfo[T], authToken: String): Request[T] = js.native
    /**
      * Returns a new firebaseStorage.Reference object referencing this StorageService
      * at the given Location.
      * @param loc The Location.
      * @return A firebaseStorage.Reference.
      */
    def makeStorageReference(loc: Location): Reference = js.native
    def maxOperationRetryTime: Double = js.native
    def maxUploadRetryTime: Double = js.native
    /**
      * Returns a firebaseStorage.Reference for the given path in the default
      * bucket.
      */
    def ref(): Reference = js.native
    def ref(path: String): Reference = js.native
    /**
      * Returns a firebaseStorage.Reference object for the given absolute URL,
      * which must be a gs:// or http[s]:// URL.
      */
    def refFromURL(url: String): Reference = js.native
    def setMaxOperationRetryTime(time: Double): Unit = js.native
    def setMaxUploadRetryTime(time: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object StorageService extends js.Object {
    var extractBucket_ : js.Any = js.native
  }
  
}

