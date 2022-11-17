package typings.electron.Electron

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientRequest extends EventEmitter {
  
  /**
    * Cancels an ongoing HTTP transaction. If the request has already emitted the
    * `close` event, the abort operation will have no effect. Otherwise an ongoing
    * event will emit `abort` and `close` events. Additionally, if there is an ongoing
    * response object,it will emit the `aborted` event.
    */
  def abort(): Unit = js.native
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_close")
  def addListener(event: "close", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_finish")
  def addListener(event: "finish", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_abort")
  def addListener(event: "abort", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_error")
  def addListener(event: "error", listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_response")
  def addListener(event: "response", listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_login")
  def addListener(
    event: "login",
    listener: js.Function2[
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_redirect")
  def addListener(
    event: "redirect",
    listener: js.Function4[
      /* statusCode */ Double, 
      /* method */ String, 
      /* redirectUrl */ String, 
      /* responseHeaders */ Record[String, js.Array[String]], 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * A `boolean` specifying whether the request will use HTTP chunked transfer
    * encoding or not. Defaults to false. The property is readable and writable,
    * however it can be set only before the first write operation as the HTTP headers
    * are not yet put on the wire. Trying to set the `chunkedEncoding` property after
    * the first write will throw an error.
    *
    * Using chunked encoding is strongly recommended if you need to send a large
    * request body as data will be streamed in small chunks instead of being
    * internally buffered inside Electron process memory.
    */
  var chunkedEncoding: Boolean = js.native
  
  /**
    * Sends the last chunk of the request data. Subsequent write or end operations
    * will not be allowed. The `finish` event is emitted just after the end operation.
    */
  def end(): Unit = js.native
  def end(chunk: String): Unit = js.native
  def end(chunk: String, encoding: String): Unit = js.native
  def end(chunk: String, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  def end(chunk: String, encoding: Unit, callback: js.Function0[Unit]): Unit = js.native
  def end(chunk: Unit, encoding: String): Unit = js.native
  def end(chunk: Unit, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  def end(chunk: Unit, encoding: Unit, callback: js.Function0[Unit]): Unit = js.native
  def end(chunk: Buffer): Unit = js.native
  def end(chunk: Buffer, encoding: String): Unit = js.native
  def end(chunk: Buffer, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  def end(chunk: Buffer, encoding: Unit, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Continues any pending redirection. Can only be called during a `'redirect'`
    * event.
    */
  def followRedirect(): Unit = js.native
  
  /**
    * The value of a previously set extra header name.
    */
  def getHeader(name: String): String = js.native
  
  /**
    * * `active` boolean - Whether the request is currently active. If this is false
    * no other properties will be set
    * * `started` boolean - Whether the upload has started. If this is false both
    * `current` and `total` will be set to 0.
    * * `current` Integer - The number of bytes that have been uploaded so far
    * * `total` Integer - The number of bytes that will be uploaded this request
    *
    * You can use this method in conjunction with `POST` requests to get the progress
    * of a file upload or other data transfer.
    */
  def getUploadProgress(): UploadProgress = js.native
  
  /**
    * Emitted as the last event in the HTTP request-response transaction. The `close`
    * event indicates that no more events will be emitted on either the `request` or
    * `response` objects.
    */
  @JSName("on")
  @scala.annotation.targetName("on_close")
  def on(event: "close", listener: js.Function): this.type = js.native
  /**
    * Emitted just after the last chunk of the `request`'s data has been written into
    * the `request` object.
    */
  @JSName("on")
  @scala.annotation.targetName("on_finish")
  def on(event: "finish", listener: js.Function): this.type = js.native
  // Docs: https://electronjs.org/docs/api/client-request
  /**
    * Emitted when the `request` is aborted. The `abort` event will not be fired if
    * the `request` is already closed.
    */
  @JSName("on")
  @scala.annotation.targetName("on_abort")
  def on(event: "abort", listener: js.Function): this.type = js.native
  /**
    * Emitted when the `net` module fails to issue a network request. Typically when
    * the `request` object emits an `error` event, a `close` event will subsequently
    * follow and no response object will be provided.
    */
  @JSName("on")
  @scala.annotation.targetName("on_error")
  def on(event: "error", listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_response")
  def on(event: "response", listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
  /**
    * Emitted when an authenticating proxy is asking for user credentials.
    *
    * The `callback` function is expected to be called back with user credentials:
    *
    * * `username` string
    * * `password` string
    *
    * Providing empty credentials will cancel the request and report an authentication
    * error on the response object:
    */
  @JSName("on")
  @scala.annotation.targetName("on_login")
  def on(
    event: "login",
    listener: js.Function2[
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when the server returns a redirect response (e.g. 301 Moved
    * Permanently). Calling `request.followRedirect` will continue with the
    * redirection.  If this event is handled, `request.followRedirect` must be called
    * **synchronously**, otherwise the request will be cancelled.
    */
  @JSName("on")
  @scala.annotation.targetName("on_redirect")
  def on(
    event: "redirect",
    listener: js.Function4[
      /* statusCode */ Double, 
      /* method */ String, 
      /* redirectUrl */ String, 
      /* responseHeaders */ Record[String, js.Array[String]], 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_abort")
  def once(event: "abort", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_finish")
  def once(event: "finish", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_close")
  def once(event: "close", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_error")
  def once(event: "error", listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_response")
  def once(event: "response", listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_login")
  def once(
    event: "login",
    listener: js.Function2[
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_redirect")
  def once(
    event: "redirect",
    listener: js.Function4[
      /* statusCode */ Double, 
      /* method */ String, 
      /* redirectUrl */ String, 
      /* responseHeaders */ Record[String, js.Array[String]], 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Removes a previously set extra header name. This method can be called only
    * before first write. Trying to call it after the first write will throw an error.
    */
  def removeHeader(name: String): Unit = js.native
  
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_close")
  def removeListener(event: "close", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_finish")
  def removeListener(event: "finish", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_abort")
  def removeListener(event: "abort", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_error")
  def removeListener(event: "error", listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_response")
  def removeListener(event: "response", listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_login")
  def removeListener(
    event: "login",
    listener: js.Function2[
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_redirect")
  def removeListener(
    event: "redirect",
    listener: js.Function4[
      /* statusCode */ Double, 
      /* method */ String, 
      /* redirectUrl */ String, 
      /* responseHeaders */ Record[String, js.Array[String]], 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Adds an extra HTTP header. The header name will be issued as-is without
    * lowercasing. It can be called only before first write. Calling this method after
    * the first write will throw an error. If the passed value is not a `string`, its
    * `toString()` method will be called to obtain the final value.
    *
    * Certain headers are restricted from being set by apps. These headers are listed
    * below. More information on restricted headers can be found in Chromium's header
    * utils.
    *
    * * `Content-Length`
    * * `Host`
    * * `Trailer` or `Te`
    * * `Upgrade`
    * * `Cookie2`
    * * `Keep-Alive`
    * * `Transfer-Encoding`
    *
    * Additionally, setting the `Connection` header to the value `upgrade` is also
    * disallowed.
    */
  def setHeader(name: String, value: String): Unit = js.native
  
  /**
    * `callback` is essentially a dummy function introduced in the purpose of keeping
    * similarity with the Node.js API. It is called asynchronously in the next tick
    * after `chunk` content have been delivered to the Chromium networking layer.
    * Contrary to the Node.js implementation, it is not guaranteed that `chunk`
    * content have been flushed on the wire before `callback` is called.
    *
    * Adds a chunk of data to the request body. The first write operation may cause
    * the request headers to be issued on the wire. After the first write operation,
    * it is not allowed to add or remove a custom header.
    */
  def write(chunk: String): Unit = js.native
  def write(chunk: String, encoding: String): Unit = js.native
  def write(chunk: String, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  def write(chunk: String, encoding: Unit, callback: js.Function0[Unit]): Unit = js.native
  def write(chunk: Buffer): Unit = js.native
  def write(chunk: Buffer, encoding: String): Unit = js.native
  def write(chunk: Buffer, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  def write(chunk: Buffer, encoding: Unit, callback: js.Function0[Unit]): Unit = js.native
}
