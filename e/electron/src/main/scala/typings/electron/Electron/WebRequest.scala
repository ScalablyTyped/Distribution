package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebRequest extends js.Object {
  /**
    * The `listener` will be called with `listener(details)` when a server initiated
    * redirect is about to occur.
    */
  def onBeforeRedirect(): Unit = js.native
  // Docs: http://electronjs.org/docs/api/web-request
  /**
    * The `listener` will be called with `listener(details)` when a server initiated
    * redirect is about to occur.
    */
  def onBeforeRedirect(filter: Filter): Unit = js.native
  def onBeforeRedirect(filter: Filter, listener: js.Function1[/* details */ OnBeforeRedirectListenerDetails, Unit]): Unit = js.native
  def onBeforeRedirect(listener: js.Function1[/* details */ OnBeforeRedirectListenerDetails, Unit]): Unit = js.native
  /**
    * The `listener` will be called with `listener(details, callback)` when a request
    * is about to occur.
    *
    * The `uploadData` is an array of `UploadData` objects.
    *
    * The `callback` has to be called with an `response` object.
    * 
  Some examples of valid `urls`:
    */
  def onBeforeRequest(): Unit = js.native
  /**
    * The `listener` will be called with `listener(details, callback)` when a request
    * is about to occur.
    *
    * The `uploadData` is an array of `UploadData` objects.
    *
    * The `callback` has to be called with an `response` object.
    * 
  Some examples of valid `urls`:
    */
  def onBeforeRequest(filter: Filter): Unit = js.native
  def onBeforeRequest(
    filter: Filter,
    listener: js.Function2[
      /* details */ OnBeforeRequestListenerDetails, 
      /* callback */ js.Function1[/* response */ Response, Unit], 
      Unit
    ]
  ): Unit = js.native
  def onBeforeRequest(
    listener: js.Function2[
      /* details */ OnBeforeRequestListenerDetails, 
      /* callback */ js.Function1[/* response */ Response, Unit], 
      Unit
    ]
  ): Unit = js.native
  /**
    * The `listener` will be called with `listener(details, callback)` before sending
    * an HTTP request, once the request headers are available. This may occur after a
    * TCP connection is made to the server, but before any http data is sent.
    * 
  The `callback` has to be called with a `response` object.
    */
  def onBeforeSendHeaders(): Unit = js.native
  /**
    * The `listener` will be called with `listener(details, callback)` before sending
    * an HTTP request, once the request headers are available. This may occur after a
    * TCP connection is made to the server, but before any http data is sent.
    * 
  The `callback` has to be called with a `response` object.
    */
  def onBeforeSendHeaders(filter: Filter): Unit = js.native
  def onBeforeSendHeaders(
    filter: Filter,
    listener: js.Function2[
      /* details */ OnBeforeSendHeadersListenerDetails, 
      /* callback */ js.Function1[/* beforeSendResponse */ BeforeSendResponse, Unit], 
      Unit
    ]
  ): Unit = js.native
  def onBeforeSendHeaders(
    listener: js.Function2[
      /* details */ OnBeforeSendHeadersListenerDetails, 
      /* callback */ js.Function1[/* beforeSendResponse */ BeforeSendResponse, Unit], 
      Unit
    ]
  ): Unit = js.native
  /**
    * The `listener` will be called with `listener(details)` when a request is
    * completed.
    */
  def onCompleted(): Unit = js.native
  /**
    * The `listener` will be called with `listener(details)` when a request is
    * completed.
    */
  def onCompleted(filter: Filter): Unit = js.native
  def onCompleted(filter: Filter, listener: js.Function1[/* details */ OnCompletedListenerDetails, Unit]): Unit = js.native
  def onCompleted(listener: js.Function1[/* details */ OnCompletedListenerDetails, Unit]): Unit = js.native
  /**
    * The `listener` will be called with `listener(details)` when an error occurs.
    */
  def onErrorOccurred(): Unit = js.native
  /**
    * The `listener` will be called with `listener(details)` when an error occurs.
    */
  def onErrorOccurred(filter: Filter): Unit = js.native
  def onErrorOccurred(filter: Filter, listener: js.Function1[/* details */ OnErrorOccurredListenerDetails, Unit]): Unit = js.native
  def onErrorOccurred(listener: js.Function1[/* details */ OnErrorOccurredListenerDetails, Unit]): Unit = js.native
  /**
    * The `listener` will be called with `listener(details, callback)` when HTTP
    * response headers of a request have been received.
    * 
  The `callback` has to be called with a `response` object.
    */
  def onHeadersReceived(): Unit = js.native
  /**
    * The `listener` will be called with `listener(details, callback)` when HTTP
    * response headers of a request have been received.
    * 
  The `callback` has to be called with a `response` object.
    */
  def onHeadersReceived(filter: Filter): Unit = js.native
  def onHeadersReceived(
    filter: Filter,
    listener: js.Function2[
      /* details */ OnHeadersReceivedListenerDetails, 
      /* callback */ js.Function1[/* headersReceivedResponse */ HeadersReceivedResponse, Unit], 
      Unit
    ]
  ): Unit = js.native
  def onHeadersReceived(
    listener: js.Function2[
      /* details */ OnHeadersReceivedListenerDetails, 
      /* callback */ js.Function1[/* headersReceivedResponse */ HeadersReceivedResponse, Unit], 
      Unit
    ]
  ): Unit = js.native
  /**
    * The `listener` will be called with `listener(details)` when first byte of the
    * response body is received. For HTTP requests, this means that the status line
    * and response headers are available.
    */
  def onResponseStarted(): Unit = js.native
  /**
    * The `listener` will be called with `listener(details)` when first byte of the
    * response body is received. For HTTP requests, this means that the status line
    * and response headers are available.
    */
  def onResponseStarted(filter: Filter): Unit = js.native
  def onResponseStarted(filter: Filter, listener: js.Function1[/* details */ OnResponseStartedListenerDetails, Unit]): Unit = js.native
  def onResponseStarted(listener: js.Function1[/* details */ OnResponseStartedListenerDetails, Unit]): Unit = js.native
  /**
    * The `listener` will be called with `listener(details)` just before a request is
    * going to be sent to the server, modifications of previous `onBeforeSendHeaders`
    * response are visible by the time this listener is fired.
    */
  def onSendHeaders(): Unit = js.native
  /**
    * The `listener` will be called with `listener(details)` just before a request is
    * going to be sent to the server, modifications of previous `onBeforeSendHeaders`
    * response are visible by the time this listener is fired.
    */
  def onSendHeaders(filter: Filter): Unit = js.native
  def onSendHeaders(filter: Filter, listener: js.Function1[/* details */ OnSendHeadersListenerDetails, Unit]): Unit = js.native
  def onSendHeaders(listener: js.Function1[/* details */ OnSendHeadersListenerDetails, Unit]): Unit = js.native
}

