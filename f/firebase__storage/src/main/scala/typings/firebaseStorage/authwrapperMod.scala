package typings.firebaseStorage

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseStorage.locationMod.Location
import typings.firebaseStorage.referenceMod.Reference
import typings.firebaseStorage.requestMod.Request
import typings.firebaseStorage.requestinfoMod.RequestInfo
import typings.firebaseStorage.requestmakerMod.requestMaker
import typings.firebaseStorage.serviceMod.Service
import typings.firebaseStorage.xhriopoolMod.XhrIoPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/authwrapper", JSImport.Namespace)
@js.native
object authwrapperMod extends js.Object {
  @js.native
  class AuthWrapper protected () extends js.Object {
    def this(
      app: Null,
      authProvider: Provider[FirebaseAuthInternalName],
      maker: js.Function2[/* p1 */ AuthWrapper, /* p2 */ Location, Reference],
      requestMaker: requestMaker,
      service: Service,
      pool: XhrIoPool
    ) = this()
    def this(
      app: FirebaseApp,
      authProvider: Provider[FirebaseAuthInternalName],
      maker: js.Function2[/* p1 */ AuthWrapper, /* p2 */ Location, Reference],
      requestMaker: requestMaker,
      service: Service,
      pool: XhrIoPool
    ) = this()
    var app_ : js.Any = js.native
    var authProvider_ : js.Any = js.native
    var bucket_ : js.Any = js.native
    var deleted_ : js.Any = js.native
    var maxOperationRetryTime_ : js.Any = js.native
    var maxUploadRetryTime_ : js.Any = js.native
    var pool_ : js.Any = js.native
    var requestMaker_ : js.Any = js.native
    var requestMap_ : js.Any = js.native
    var service_ : js.Any = js.native
    var storageRefMaker_ : js.Any = js.native
    def bucket(): String | Null = js.native
    /**
      * Stop running requests and prevent more from being created.
      */
    def deleteApp(): Unit = js.native
    def getAuthToken(): js.Promise[String | Null] = js.native
    def makeRequest[T](requestInfo: RequestInfo[T]): Request[T] = js.native
    def makeRequest[T](requestInfo: RequestInfo[T], authToken: String): Request[T] = js.native
    /**
      * Returns a new firebaseStorage.Reference object referencing this AuthWrapper
      * at the given Location.
      * @param loc The Location.
      * @return Actually a firebaseStorage.Reference, typing not allowed
      *     because of circular dependency problems.
      */
    def makeStorageReference(loc: Location): Reference = js.native
    def maxOperationRetryTime(): Double = js.native
    def maxUploadRetryTime(): Double = js.native
    /**
      * The service associated with this auth wrapper. Untyped to avoid circular
      * type dependencies.
      */
    def service(): Service = js.native
    def setMaxOperationRetryTime(time: Double): Unit = js.native
    def setMaxUploadRetryTime(time: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object AuthWrapper extends js.Object {
    var extractBucket_ : js.Any = js.native
  }
  
}

