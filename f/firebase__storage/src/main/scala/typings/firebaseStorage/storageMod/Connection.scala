package typings.firebaseStorage.storageMod

import typings.std.Blob
import typings.std.EventTarget
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A lightweight wrapper around XMLHttpRequest with a
  * goog.net.XhrIo-like interface.
  *
  * You can create a new connection by invoking `newTextConnection()`,
  * `newBytesConnection()` or `newStreamConnection()`.
  */
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
  def send(url: String, method: String, body: String, headers: Headers2): js.Promise[Unit] = js.native
  def send(url: String, method: String, body: js.typedarray.ArrayBufferView): js.Promise[Unit] = js.native
  def send(url: String, method: String, body: js.typedarray.ArrayBufferView, headers: Headers2): js.Promise[Unit] = js.native
  def send(url: String, method: String, body: Null, headers: Headers2): js.Promise[Unit] = js.native
  def send(url: String, method: String, body: Unit, headers: Headers2): js.Promise[Unit] = js.native
  def send(url: String, method: String, body: Blob): js.Promise[Unit] = js.native
  def send(url: String, method: String, body: Blob, headers: Headers2): js.Promise[Unit] = js.native
}
