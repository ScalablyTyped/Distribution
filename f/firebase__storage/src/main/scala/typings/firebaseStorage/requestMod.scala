package typings.firebaseStorage

import typings.firebaseStorage.requestinfoMod.RequestInfo
import typings.firebaseStorage.xhrioMod.Headers
import typings.firebaseStorage.xhrioMod.XhrIo
import typings.firebaseStorage.xhriopoolMod.XhrIoPool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/request", "RequestEndStatus")
  @js.native
  class RequestEndStatus protected () extends StObject {
    def this(wasSuccessCode: Boolean) = this()
    def this(wasSuccessCode: Boolean, xhr: XhrIo) = this()
    def this(wasSuccessCode: Boolean, xhr: Null, canceled: Boolean) = this()
    def this(wasSuccessCode: Boolean, xhr: XhrIo, canceled: Boolean) = this()
    
    /**
      * True if the request was canceled.
      */
    var canceled: Boolean = js.native
    
    var wasSuccessCode: Boolean = js.native
    
    var xhr: XhrIo | Null = js.native
  }
  
  inline def addAuthHeader(headers: Headers): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAuthHeader_")(headers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addAuthHeader(headers: Headers, authToken: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAuthHeader_")(headers.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addGmpidHeader(headers: Headers): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGmpidHeader_")(headers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addGmpidHeader(headers: Headers, appId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addGmpidHeader_")(headers.asInstanceOf[js.Any], appId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addVersionHeader(headers: Headers): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addVersionHeader_")(headers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def makeRequest[T](requestInfo: RequestInfo[T], appId: String, authToken: String, pool: XhrIoPool): Request[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], pool.asInstanceOf[js.Any])).asInstanceOf[Request[T]]
  inline def makeRequest[T](requestInfo: RequestInfo[T], appId: String, authToken: Null, pool: XhrIoPool): Request[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], pool.asInstanceOf[js.Any])).asInstanceOf[Request[T]]
  inline def makeRequest[T](requestInfo: RequestInfo[T], appId: Null, authToken: String, pool: XhrIoPool): Request[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], pool.asInstanceOf[js.Any])).asInstanceOf[Request[T]]
  inline def makeRequest[T](requestInfo: RequestInfo[T], appId: Null, authToken: Null, pool: XhrIoPool): Request[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRequest")(requestInfo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], pool.asInstanceOf[js.Any])).asInstanceOf[Request[T]]
  
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
