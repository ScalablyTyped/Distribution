package typings.firebaseStorage

import typings.firebaseStorage.connectionMod.Connection
import typings.firebaseStorage.connectionMod.ConnectionType
import typings.firebaseStorage.connectionMod.Headers
import typings.firebaseStorage.requestinfoMod.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/request", "RequestEndStatus")
  @js.native
  open class RequestEndStatus[I /* <: ConnectionType */] protected () extends StObject {
    def this(wasSuccessCode: Boolean) = this()
    def this(wasSuccessCode: Boolean, connection: Connection[I]) = this()
    def this(wasSuccessCode: Boolean, connection: Null, canceled: Boolean) = this()
    def this(wasSuccessCode: Boolean, connection: Connection[I], canceled: Boolean) = this()
    
    /**
      * True if the request was canceled.
      */
    var canceled: Boolean = js.native
    
    var connection: Connection[I] | Null = js.native
    
    var wasSuccessCode: Boolean = js.native
  }
  
  inline def addAppCheckHeader(headers: Headers): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAppCheckHeader_")(headers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addAppCheckHeader(headers: Headers, appCheckToken: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAppCheckHeader_")(headers.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addAuthHeader(headers: Headers): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAuthHeader_")(headers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addAuthHeader(headers: Headers, authToken: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAuthHeader_")(headers.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addGmpidHeader(headers: Headers): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGmpidHeader_")(headers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addGmpidHeader(headers: Headers, appId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addGmpidHeader_")(headers.asInstanceOf[js.Any], appId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addVersionHeader(headers: Headers): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addVersionHeader_")(headers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addVersionHeader(headers: Headers, firebaseVersion: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addVersionHeader_")(headers.asInstanceOf[js.Any], firebaseVersion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: String,
    authToken: String,
    appCheckToken: String,
    requestFactory: js.Function0[Connection[I]]
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: String,
    authToken: String,
    appCheckToken: String,
    requestFactory: js.Function0[Connection[I]],
    firebaseVersion: String
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any], firebaseVersion.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: String,
    authToken: String,
    appCheckToken: Null,
    requestFactory: js.Function0[Connection[I]]
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: String,
    authToken: String,
    appCheckToken: Null,
    requestFactory: js.Function0[Connection[I]],
    firebaseVersion: String
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any], firebaseVersion.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: String,
    authToken: Null,
    appCheckToken: String,
    requestFactory: js.Function0[Connection[I]]
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: String,
    authToken: Null,
    appCheckToken: String,
    requestFactory: js.Function0[Connection[I]],
    firebaseVersion: String
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any], firebaseVersion.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: String,
    authToken: Null,
    appCheckToken: Null,
    requestFactory: js.Function0[Connection[I]]
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: String,
    authToken: Null,
    appCheckToken: Null,
    requestFactory: js.Function0[Connection[I]],
    firebaseVersion: String
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any], firebaseVersion.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: Null,
    authToken: String,
    appCheckToken: String,
    requestFactory: js.Function0[Connection[I]]
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: Null,
    authToken: String,
    appCheckToken: String,
    requestFactory: js.Function0[Connection[I]],
    firebaseVersion: String
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any], firebaseVersion.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: Null,
    authToken: String,
    appCheckToken: Null,
    requestFactory: js.Function0[Connection[I]]
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: Null,
    authToken: String,
    appCheckToken: Null,
    requestFactory: js.Function0[Connection[I]],
    firebaseVersion: String
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any], firebaseVersion.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: Null,
    authToken: Null,
    appCheckToken: String,
    requestFactory: js.Function0[Connection[I]]
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: Null,
    authToken: Null,
    appCheckToken: String,
    requestFactory: js.Function0[Connection[I]],
    firebaseVersion: String
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any], firebaseVersion.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: Null,
    authToken: Null,
    appCheckToken: Null,
    requestFactory: js.Function0[Connection[I]]
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  inline def makeRequest[I /* <: ConnectionType */, O](
    requestInfo: RequestInfo[I, O],
    appId: Null,
    authToken: Null,
    appCheckToken: Null,
    requestFactory: js.Function0[Connection[I]],
    firebaseVersion: String
  ): Request[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], appCheckToken.asInstanceOf[js.Any], requestFactory.asInstanceOf[js.Any], firebaseVersion.asInstanceOf[js.Any])).asInstanceOf[Request[O]]
  
  @js.native
  trait Request[T] extends StObject {
    
    /**
      * Cancels the request. IMPORTANT: the promise may still be resolved with an
      * appropriate value (if the request is finished before you call this method,
      * but the promise has not yet been resolved), so don't just assume it will be
      * rejected if you call this function.
      * @param appDelete - True if the cancelation came from the app being deleted.
      */
    def cancel(): Unit = js.native
    def cancel(appDelete: Boolean): Unit = js.native
    
    def getPromise(): js.Promise[T] = js.native
  }
}
