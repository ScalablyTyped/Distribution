package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.EventTarget
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xhrioMod {
  
  @js.native
  sealed trait ErrorCode extends StObject
  @JSImport("@firebase/storage/dist/src/implementation/xhrio", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorCode & Double] = js.native
    
    @js.native
    sealed trait ABORT
      extends StObject
         with ErrorCode
    /* 2 */ val ABORT: typings.firebaseStorage.xhrioMod.ErrorCode.ABORT & Double = js.native
    
    @js.native
    sealed trait NETWORK_ERROR
      extends StObject
         with ErrorCode
    /* 1 */ val NETWORK_ERROR: typings.firebaseStorage.xhrioMod.ErrorCode.NETWORK_ERROR & Double = js.native
    
    @js.native
    sealed trait NO_ERROR
      extends StObject
         with ErrorCode
    /* 0 */ val NO_ERROR: typings.firebaseStorage.xhrioMod.ErrorCode.NO_ERROR & Double = js.native
  }
  
  type Headers = StringDictionary[String | Double]
  
  @js.native
  trait XhrIo extends StObject {
    
    /**
      * Abort the request.
      */
    def abort(): Unit = js.native
    
    def addUploadProgressListener(listener: js.Function1[/* p1 */ ProgressEvent[EventTarget], Unit]): Unit = js.native
    
    def getErrorCode(): ErrorCode = js.native
    
    def getResponseHeader(header: String): String | Null = js.native
    
    def getResponseText(): String = js.native
    
    def getStatus(): Double = js.native
    
    def removeUploadProgressListener(listener: js.Function1[/* p1 */ ProgressEvent[EventTarget], Unit]): Unit = js.native
    
    def send(url: String, method: String): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: String): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: String, headers: Headers): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: Null, headers: Headers): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: Unit, headers: Headers): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: ArrayBufferView): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: ArrayBufferView, headers: Headers): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: Blob): js.Promise[XhrIo] = js.native
    def send(url: String, method: String, body: Blob, headers: Headers): js.Promise[XhrIo] = js.native
  }
}
