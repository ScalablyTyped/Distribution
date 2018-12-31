package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.ClientRequest")
@js.native
class ClientRequest protected () extends EventEmitter {
  def this(options: electronLib.electronLibStrings.method | electronLib.electronLibStrings.url | electronLib.electronLibStrings.session | electronLib.electronLibStrings.partition | electronLib.electronLibStrings.protocol | electronLib.electronLibStrings.host | electronLib.electronLibStrings.hostname | electronLib.electronLibStrings.port | electronLib.electronLibStrings.path | electronLib.electronLibStrings.redirect) = this()
  var chunkedEncoding: scala.Boolean = js.native
  /**
    * Cancels an ongoing HTTP transaction. If the request has already emitted the
    * close event, the abort operation will have no effect. Otherwise an ongoing event
    * will emit abort and close events. Additionally, if there is an ongoing response
    * object,it will emit the aborted event.
    */
  def abort(): scala.Unit = js.native
  @JSName("addListener")
  def addListener_abort(event: electronLib.electronLibStrings.abort, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: electronLib.electronLibStrings.close, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: electronLib.electronLibStrings.error,
    listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: electronLib.electronLibStrings.finish, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_login(
    event: electronLib.electronLibStrings.login,
    listener: js.Function2[
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ java.lang.String, /* password */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_redirect(
    event: electronLib.electronLibStrings.redirect,
    listener: js.Function4[
      /* statusCode */ scala.Double, 
      /* method */ java.lang.String, 
      /* redirectUrl */ java.lang.String, 
      /* responseHeaders */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_response(
    event: electronLib.electronLibStrings.response,
    listener: js.Function1[/* response */ IncomingMessage, scala.Unit]
  ): this.type = js.native
  /**
    * Sends the last chunk of the request data. Subsequent write or end operations
    * will not be allowed. The finish event is emitted just after the end operation.
    */
  def end(): scala.Unit = js.native
  def end(chunk: java.lang.String): scala.Unit = js.native
  def end(chunk: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def end(chunk: java.lang.String, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  def end(chunk: nodeLib.Buffer): scala.Unit = js.native
  def end(chunk: nodeLib.Buffer, encoding: java.lang.String): scala.Unit = js.native
  def end(chunk: nodeLib.Buffer, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  /**
    * Continues any deferred redirection request when the redirection mode is manual.
    */
  def followRedirect(): scala.Unit = js.native
  def getHeader(name: java.lang.String): Header = js.native
  /**
    * You can use this method in conjunction with POST requests to get the progress of
    * a file upload or other data transfer.
    */
  def getUploadProgress(): UploadProgress = js.native
  // Docs: http://electronjs.org/docs/api/client-request
  /**
    * Emitted when the request is aborted. The abort event will not be fired if the
    * request is already closed.
    */
  @JSName("on")
  def on_abort(event: electronLib.electronLibStrings.abort, listener: js.Function): this.type = js.native
  /**
    * Emitted as the last event in the HTTP request-response transaction. The close
    * event indicates that no more events will be emitted on either the request or
    * response objects.
    */
  @JSName("on")
  def on_close(event: electronLib.electronLibStrings.close, listener: js.Function): this.type = js.native
  /**
    * Emitted when the net module fails to issue a network request. Typically when the
    * request object emits an error event, a close event will subsequently follow and
    * no response object will be provided.
    */
  @JSName("on")
  def on_error(
    event: electronLib.electronLibStrings.error,
    listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted just after the last chunk of the request's data has been written into
    * the request object.
    */
  @JSName("on")
  def on_finish(event: electronLib.electronLibStrings.finish, listener: js.Function): this.type = js.native
  /**
    * Emitted when an authenticating proxy is asking for user credentials. The
    * callback function is expected to be called back with user credentials: Providing
    * empty credentials will cancel the request and report an authentication error on
    * the response object:
    */
  @JSName("on")
  def on_login(
    event: electronLib.electronLibStrings.login,
    listener: js.Function2[
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ java.lang.String, /* password */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when there is redirection and the mode is manual. Calling
    * request.followRedirect will continue with the redirection.
    */
  @JSName("on")
  def on_redirect(
    event: electronLib.electronLibStrings.redirect,
    listener: js.Function4[
      /* statusCode */ scala.Double, 
      /* method */ java.lang.String, 
      /* redirectUrl */ java.lang.String, 
      /* responseHeaders */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_response(
    event: electronLib.electronLibStrings.response,
    listener: js.Function1[/* response */ IncomingMessage, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_abort(event: electronLib.electronLibStrings.abort, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_close(event: electronLib.electronLibStrings.close, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_error(
    event: electronLib.electronLibStrings.error,
    listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_finish(event: electronLib.electronLibStrings.finish, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_login(
    event: electronLib.electronLibStrings.login,
    listener: js.Function2[
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ java.lang.String, /* password */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_redirect(
    event: electronLib.electronLibStrings.redirect,
    listener: js.Function4[
      /* statusCode */ scala.Double, 
      /* method */ java.lang.String, 
      /* redirectUrl */ java.lang.String, 
      /* responseHeaders */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_response(
    event: electronLib.electronLibStrings.response,
    listener: js.Function1[/* response */ IncomingMessage, scala.Unit]
  ): this.type = js.native
  /**
    * Removes a previously set extra header name. This method can be called only
    * before first write. Trying to call it after the first write will throw an error.
    */
  def removeHeader(name: java.lang.String): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_abort(event: electronLib.electronLibStrings.abort, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: electronLib.electronLibStrings.close, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: electronLib.electronLibStrings.error,
    listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_finish(event: electronLib.electronLibStrings.finish, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_login(
    event: electronLib.electronLibStrings.login,
    listener: js.Function2[
      /* authInfo */ AuthInfo, 
      /* callback */ js.Function2[/* username */ java.lang.String, /* password */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_redirect(
    event: electronLib.electronLibStrings.redirect,
    listener: js.Function4[
      /* statusCode */ scala.Double, 
      /* method */ java.lang.String, 
      /* redirectUrl */ java.lang.String, 
      /* responseHeaders */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_response(
    event: electronLib.electronLibStrings.response,
    listener: js.Function1[/* response */ IncomingMessage, scala.Unit]
  ): this.type = js.native
  /**
    * Adds an extra HTTP header. The header name will issued as it is without
    * lowercasing. It can be called only before first write. Calling this method after
    * the first write will throw an error. If the passed value is not a String, its
    * toString() method will be called to obtain the final value.
    */
  def setHeader(name: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
    * callback is essentially a dummy function introduced in the purpose of keeping
    * similarity with the Node.js API. It is called asynchronously in the next tick
    * after chunk content have been delivered to the Chromium networking layer.
    * Contrary to the Node.js implementation, it is not guaranteed that chunk content
    * have been flushed on the wire before callback is called. Adds a chunk of data to
    * the request body. The first write operation may cause the request headers to be
    * issued on the wire. After the first write operation, it is not allowed to add or
    * remove a custom header.
    */
  def write(chunk: java.lang.String): scala.Unit = js.native
  def write(chunk: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def write(chunk: java.lang.String, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  def write(chunk: nodeLib.Buffer): scala.Unit = js.native
  def write(chunk: nodeLib.Buffer, encoding: java.lang.String): scala.Unit = js.native
  def write(chunk: nodeLib.Buffer, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
}

