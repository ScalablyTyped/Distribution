package typings.electron.Electron

import typings.electron.electronStrings.abort
import typings.electron.electronStrings.close
import typings.electron.electronStrings.error
import typings.electron.electronStrings.finish
import typings.electron.electronStrings.login
import typings.electron.electronStrings.redirect
import typings.electron.electronStrings.response
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def addListener_abort(event: abort, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: finish, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_login(
    event: login,
    listener: js.Function2[
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_redirect(
    event: redirect,
    listener: js.Function4[
      /* statusCode */ Double, 
      /* method */ String, 
      /* redirectUrl */ String, 
      /* responseHeaders */ Record[String, js.Array[String]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
  
  var chunkedEncoding: Boolean = js.native
  
  /**
    * Sends the last chunk of the request data. Subsequent write or end operations
    * will not be allowed. The `finish` event is emitted just after the end operation.
    */
  def end(): Unit = js.native
  def end(
    chunk: js.UndefOr[scala.Nothing],
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def end(chunk: js.UndefOr[scala.Nothing], encoding: String): Unit = js.native
  def end(chunk: js.UndefOr[scala.Nothing], encoding: String, callback: js.Function0[Unit]): Unit = js.native
  def end(chunk: String): Unit = js.native
  def end(chunk: String, encoding: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def end(chunk: String, encoding: String): Unit = js.native
  def end(chunk: String, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  def end(chunk: Buffer): Unit = js.native
  def end(chunk: Buffer, encoding: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def end(chunk: Buffer, encoding: String): Unit = js.native
  def end(chunk: Buffer, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  
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
    * * `active` Boolean - Whether the request is currently active. If this is false
    * no other properties will be set
    * * `started` Boolean - Whether the upload has started. If this is false both
    * `current` and `total` will be set to 0.
    * * `current` Integer - The number of bytes that have been uploaded so far
    * * `total` Integer - The number of bytes that will be uploaded this request
    *
    * You can use this method in conjunction with `POST` requests to get the progress
    * of a file upload or other data transfer.
    */
  def getUploadProgress(): UploadProgress = js.native
  
  // Docs: https://electronjs.org/docs/api/client-request
  /**
    * Emitted when the `request` is aborted. The `abort` event will not be fired if
    * the `request` is already closed.
    */
  @JSName("on")
  def on_abort(event: abort, listener: js.Function): this.type = js.native
  /**
    * Emitted as the last event in the HTTP request-response transaction. The `close`
    * event indicates that no more events will be emitted on either the `request` or
    * `response` objects.
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function): this.type = js.native
  /**
    * Emitted when the `net` module fails to issue a network request. Typically when
    * the `request` object emits an `error` event, a `close` event will subsequently
    * follow and no response object will be provided.
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  /**
    * Emitted just after the last chunk of the `request`'s data has been written into
    * the `request` object.
    */
  @JSName("on")
  def on_finish(event: finish, listener: js.Function): this.type = js.native
  /**
    * Emitted when an authenticating proxy is asking for user credentials.
    *
    * The `callback` function is expected to be called back with user credentials:
    *
    * * `username` String
    * * `password` String
    *
    * Providing empty credentials will cancel the request and report an authentication
    * error on the response object:
    */
  @JSName("on")
  def on_login(
    event: login,
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
  def on_redirect(
    event: redirect,
    listener: js.Function4[
      /* statusCode */ Double, 
      /* method */ String, 
      /* redirectUrl */ String, 
      /* responseHeaders */ Record[String, js.Array[String]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
  
  @JSName("once")
  def once_abort(event: abort, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: finish, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_login(
    event: login,
    listener: js.Function2[
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_redirect(
    event: redirect,
    listener: js.Function4[
      /* statusCode */ Double, 
      /* method */ String, 
      /* redirectUrl */ String, 
      /* responseHeaders */ Record[String, js.Array[String]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
  
  /**
    * Removes a previously set extra header name. This method can be called only
    * before first write. Trying to call it after the first write will throw an error.
    */
  def removeHeader(name: String): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_abort(event: abort, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_finish(event: finish, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_login(
    event: login,
    listener: js.Function2[
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ js.UndefOr[String], /* password */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_redirect(
    event: redirect,
    listener: js.Function4[
      /* statusCode */ Double, 
      /* method */ String, 
      /* redirectUrl */ String, 
      /* responseHeaders */ Record[String, js.Array[String]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_response(event: response, listener: js.Function1[/* response */ IncomingMessage, Unit]): this.type = js.native
  
  /**
    * Adds an extra HTTP header. The header name will be issued as-is without
    * lowercasing. It can be called only before first write. Calling this method after
    * the first write will throw an error. If the passed value is not a `String`, its
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
  def write(chunk: String, encoding: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def write(chunk: String, encoding: String): Unit = js.native
  def write(chunk: String, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  def write(chunk: Buffer): Unit = js.native
  def write(chunk: Buffer, encoding: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def write(chunk: Buffer, encoding: String): Unit = js.native
  def write(chunk: Buffer, encoding: String, callback: js.Function0[Unit]): Unit = js.native
}
