package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.WebRequest")
@js.native
class WebRequest () extends EventEmitter {
  def onBeforeRedirect(): Unit = js.native
  def onBeforeRedirect(filter: OnBeforeRedirectFilter): Unit = js.native
  /**
    * The listener will be called with listener(details) when a server initiated
    * redirect is about to occur.
    */
  def onBeforeRedirect(
    filter: OnBeforeRedirectFilter,
    listener: js.Function1[/* details */ OnBeforeRedirectDetails, Unit]
  ): Unit = js.native
  // Docs: http://electronjs.org/docs/api/web-request
  /**
    * The listener will be called with listener(details) when a server initiated
    * redirect is about to occur.
    */
  def onBeforeRedirect(listener: js.Function1[/* details */ OnBeforeRedirectDetails, Unit]): Unit = js.native
  def onBeforeRequest(): Unit = js.native
  def onBeforeRequest(filter: OnBeforeRequestFilter): Unit = js.native
  /**
    * The listener will be called with listener(details, callback) when a request is
    * about to occur. The uploadData is an array of UploadData objects. The callback
    * has to be called with an response object.
    */
  def onBeforeRequest(
    filter: OnBeforeRequestFilter,
    listener: js.Function2[
      /* details */ OnBeforeRequestDetails, 
      /* callback */ js.Function1[/* response */ Response, Unit], 
      Unit
    ]
  ): Unit = js.native
  /**
    * The listener will be called with listener(details, callback) when a request is
    * about to occur. The uploadData is an array of UploadData objects. The callback
    * has to be called with an response object.
    */
  def onBeforeRequest(
    listener: js.Function2[
      /* details */ OnBeforeRequestDetails, 
      /* callback */ js.Function1[/* response */ Response, Unit], 
      Unit
    ]
  ): Unit = js.native
  def onBeforeSendHeaders(): Unit = js.native
  def onBeforeSendHeaders(filter: OnBeforeSendHeadersFilter): Unit = js.native
  /**
    * The listener will be called with listener(details, callback) before sending an
    * HTTP request, once the request headers are available. This may occur after a TCP
    * connection is made to the server, but before any http data is sent. The callback
    * has to be called with an response object.
    */
  def onBeforeSendHeaders(
    filter: OnBeforeSendHeadersFilter,
    listener: js.Function2[
      /* details */ OnBeforeSendHeadersDetails, 
      /* callback */ js.Function1[/* response */ OnBeforeSendHeadersResponse, Unit], 
      Unit
    ]
  ): Unit = js.native
  /**
    * The listener will be called with listener(details, callback) before sending an
    * HTTP request, once the request headers are available. This may occur after a TCP
    * connection is made to the server, but before any http data is sent. The callback
    * has to be called with an response object.
    */
  def onBeforeSendHeaders(
    listener: js.Function2[
      /* details */ OnBeforeSendHeadersDetails, 
      /* callback */ js.Function1[/* response */ OnBeforeSendHeadersResponse, Unit], 
      Unit
    ]
  ): Unit = js.native
  def onCompleted(): Unit = js.native
  def onCompleted(filter: OnCompletedFilter): Unit = js.native
  /**
    * The listener will be called with listener(details) when a request is completed.
    */
  def onCompleted(filter: OnCompletedFilter, listener: js.Function1[/* details */ OnCompletedDetails, Unit]): Unit = js.native
  /**
    * The listener will be called with listener(details) when a request is completed.
    */
  def onCompleted(listener: js.Function1[/* details */ OnCompletedDetails, Unit]): Unit = js.native
  def onErrorOccurred(): Unit = js.native
  def onErrorOccurred(filter: OnErrorOccurredFilter): Unit = js.native
  /**
    * The listener will be called with listener(details) when an error occurs.
    */
  def onErrorOccurred(filter: OnErrorOccurredFilter, listener: js.Function1[/* details */ OnErrorOccurredDetails, Unit]): Unit = js.native
  /**
    * The listener will be called with listener(details) when an error occurs.
    */
  def onErrorOccurred(listener: js.Function1[/* details */ OnErrorOccurredDetails, Unit]): Unit = js.native
  def onHeadersReceived(): Unit = js.native
  def onHeadersReceived(filter: OnHeadersReceivedFilter): Unit = js.native
  /**
    * The listener will be called with listener(details, callback) when HTTP response
    * headers of a request have been received. The callback has to be called with an
    * response object.
    */
  def onHeadersReceived(
    filter: OnHeadersReceivedFilter,
    listener: js.Function2[
      /* details */ OnHeadersReceivedDetails, 
      /* callback */ js.Function1[/* response */ OnHeadersReceivedResponse, Unit], 
      Unit
    ]
  ): Unit = js.native
  /**
    * The listener will be called with listener(details, callback) when HTTP response
    * headers of a request have been received. The callback has to be called with an
    * response object.
    */
  def onHeadersReceived(
    listener: js.Function2[
      /* details */ OnHeadersReceivedDetails, 
      /* callback */ js.Function1[/* response */ OnHeadersReceivedResponse, Unit], 
      Unit
    ]
  ): Unit = js.native
  def onResponseStarted(): Unit = js.native
  def onResponseStarted(filter: OnResponseStartedFilter): Unit = js.native
  /**
    * The listener will be called with listener(details) when first byte of the
    * response body is received. For HTTP requests, this means that the status line
    * and response headers are available.
    */
  def onResponseStarted(
    filter: OnResponseStartedFilter,
    listener: js.Function1[/* details */ OnResponseStartedDetails, Unit]
  ): Unit = js.native
  /**
    * The listener will be called with listener(details) when first byte of the
    * response body is received. For HTTP requests, this means that the status line
    * and response headers are available.
    */
  def onResponseStarted(listener: js.Function1[/* details */ OnResponseStartedDetails, Unit]): Unit = js.native
  def onSendHeaders(): Unit = js.native
  def onSendHeaders(filter: OnSendHeadersFilter): Unit = js.native
  /**
    * The listener will be called with listener(details) just before a request is
    * going to be sent to the server, modifications of previous onBeforeSendHeaders
    * response are visible by the time this listener is fired.
    */
  def onSendHeaders(filter: OnSendHeadersFilter, listener: js.Function1[/* details */ OnSendHeadersDetails, Unit]): Unit = js.native
  /**
    * The listener will be called with listener(details) just before a request is
    * going to be sent to the server, modifications of previous onBeforeSendHeaders
    * response are visible by the time this listener is fired.
    */
  def onSendHeaders(listener: js.Function1[/* details */ OnSendHeadersDetails, Unit]): Unit = js.native
}

