package typings.atFirebaseStorage

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseStorage.distSrcImplementationAuthwrapperMod.AuthWrapper
import typings.atFirebaseStorage.distSrcImplementationXhriopoolMod.XhrIoPool
import typings.atFirebaseStorage.distSrcReferenceMod.Reference
import typings.atFirebaseStorage.distSrcServiceMod.Service
import typings.atFirebaseStorage.distSrcServiceMod.ServiceInternals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/service", JSImport.Namespace)
@js.native
object distSrcServiceMod extends js.Object {
  @js.native
  class Service protected () extends js.Object {
    def this(app: FirebaseApp, pool: XhrIoPool) = this()
    def this(app: FirebaseApp, pool: XhrIoPool, url: String) = this()
    var app_ : js.Any = js.native
    var authWrapper_ : AuthWrapper = js.native
    var bucket_ : js.Any = js.native
    var internals_ : js.Any = js.native
    def INTERNAL(): ServiceInternals = js.native
    def app(): FirebaseApp = js.native
    def maxUploadRetryTime(): Double = js.native
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
  
  @js.native
  class ServiceInternals protected () extends js.Object {
    def this(service: Service) = this()
    var service_ : Service = js.native
    /**
      * Called when the associated app is deleted.
      * @see {!fbs.AuthWrapper.prototype.deleteApp}
      */
    def delete(): js.Promise[Unit] = js.native
  }
  
}

