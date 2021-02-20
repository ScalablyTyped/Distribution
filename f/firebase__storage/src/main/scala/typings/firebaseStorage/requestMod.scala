package typings.firebaseStorage

import typings.firebaseStorage.requestinfoMod.RequestInfo
import typings.firebaseStorage.xhrioMod.Headers
import typings.firebaseStorage.xhrioMod.XhrIo
import typings.firebaseStorage.xhriopoolMod.XhrIoPool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
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
  
  @JSImport("@firebase/storage/dist/src/implementation/request", "addAuthHeader_")
  @js.native
  def addAuthHeader(headers: Headers): Unit = js.native
  @JSImport("@firebase/storage/dist/src/implementation/request", "addAuthHeader_")
  @js.native
  def addAuthHeader(headers: Headers, authToken: String): Unit = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/request", "addGmpidHeader_")
  @js.native
  def addGmpidHeader(headers: Headers): Unit = js.native
  @JSImport("@firebase/storage/dist/src/implementation/request", "addGmpidHeader_")
  @js.native
  def addGmpidHeader(headers: Headers, appId: String): Unit = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/request", "addVersionHeader_")
  @js.native
  def addVersionHeader(headers: Headers): Unit = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/request", "makeRequest")
  @js.native
  def makeRequest[T](requestInfo: RequestInfo[T], appId: String, authToken: String, pool: XhrIoPool): Request[T] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/request", "makeRequest")
  @js.native
  def makeRequest[T](requestInfo: RequestInfo[T], appId: String, authToken: Null, pool: XhrIoPool): Request[T] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/request", "makeRequest")
  @js.native
  def makeRequest[T](requestInfo: RequestInfo[T], appId: Null, authToken: String, pool: XhrIoPool): Request[T] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/request", "makeRequest")
  @js.native
  def makeRequest[T](requestInfo: RequestInfo[T], appId: Null, authToken: Null, pool: XhrIoPool): Request[T] = js.native
  
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
