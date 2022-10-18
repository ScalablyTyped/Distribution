package typings.firebaseStorage

import typings.node.NodeJS.ReadableStream
import typings.std.Blob
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcImplementationConnectionMod {
  
  @js.native
  sealed trait ErrorCode extends StObject
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/connection", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorCode & Double] = js.native
    
    @js.native
    sealed trait ABORT
      extends StObject
         with ErrorCode
    /* 2 */ val ABORT: typings.firebaseStorage.distNodeEsmSrcImplementationConnectionMod.ErrorCode.ABORT & Double = js.native
    
    @js.native
    sealed trait NETWORK_ERROR
      extends StObject
         with ErrorCode
    /* 1 */ val NETWORK_ERROR: typings.firebaseStorage.distNodeEsmSrcImplementationConnectionMod.ErrorCode.NETWORK_ERROR & Double = js.native
    
    @js.native
    sealed trait NO_ERROR
      extends StObject
         with ErrorCode
    /* 0 */ val NO_ERROR: typings.firebaseStorage.distNodeEsmSrcImplementationConnectionMod.ErrorCode.NO_ERROR & Double = js.native
  }
  
  @js.native
  trait Connection[T /* <: ConnectionType */] extends StObject {
    
    /**
      * Abort the request.
      */
    def abort(): Unit = js.native
    
    def addUploadProgressListener(listener: js.Function1[/* p1 */ ProgressEvent[EventTarget], Unit]): Unit = js.native
    
    def getErrorCode(): ErrorCode = js.native
    
    def getErrorText(): String = js.native
    
    def getResponse(): T = js.native
    
    def getResponseHeader(header: String): String | Null = js.native
    
    def getStatus(): Double = js.native
    
    def removeUploadProgressListener(listener: js.Function1[/* p1 */ ProgressEvent[EventTarget], Unit]): Unit = js.native
    
    /**
      * Sends a request to the provided URL.
      *
      * This method never rejects its promise. In case of encountering an error,
      * it sets an error code internally which can be accessed by calling
      * getErrorCode() by callers.
      */
    def send(url: String, method: String): js.Promise[Unit] = js.native
    def send(url: String, method: String, body: String): js.Promise[Unit] = js.native
    def send(url: String, method: String, body: String, headers: Headers): js.Promise[Unit] = js.native
    def send(url: String, method: String, body: js.typedarray.ArrayBufferView): js.Promise[Unit] = js.native
    def send(url: String, method: String, body: js.typedarray.ArrayBufferView, headers: Headers): js.Promise[Unit] = js.native
    def send(url: String, method: String, body: Null, headers: Headers): js.Promise[Unit] = js.native
    def send(url: String, method: String, body: Unit, headers: Headers): js.Promise[Unit] = js.native
    def send(url: String, method: String, body: Blob): js.Promise[Unit] = js.native
    def send(url: String, method: String, body: Blob, headers: Headers): js.Promise[Unit] = js.native
  }
  
  type ConnectionType = String | js.typedarray.ArrayBuffer | Blob | ReadableStream
  
  type Headers = Record[String, String]
}
