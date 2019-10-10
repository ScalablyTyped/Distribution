package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.webRequest.BlockingResponse
import typings.firefoxDashWebextDashBrowser.browser.webRequest.SecurityInfo
import typings.firefoxDashWebextDashBrowser.browser.webRequest._WebRequestOnAuthRequiredEvent
import typings.firefoxDashWebextDashBrowser.browser.webRequest._WebRequestOnBeforeRedirectEvent
import typings.firefoxDashWebextDashBrowser.browser.webRequest._WebRequestOnBeforeRequestEvent
import typings.firefoxDashWebextDashBrowser.browser.webRequest._WebRequestOnBeforeSendHeadersEvent
import typings.firefoxDashWebextDashBrowser.browser.webRequest._WebRequestOnCompletedEvent
import typings.firefoxDashWebextDashBrowser.browser.webRequest._WebRequestOnErrorOccurredEvent
import typings.firefoxDashWebextDashBrowser.browser.webRequest._WebRequestOnHeadersReceivedEvent
import typings.firefoxDashWebextDashBrowser.browser.webRequest._WebRequestOnResponseStartedEvent
import typings.firefoxDashWebextDashBrowser.browser.webRequest._WebRequestOnSendHeadersEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofwebRequest extends js.Object {
  /* webRequest properties */
  /**
    * The maximum number of times that `handlerBehaviorChanged` can be called per 10 minute sustained interval.
    * `handlerBehaviorChanged` is an expensive function call that shouldn't be called often.
    */
  val MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Double = js.native
  /**
    * Fired when an authentication failure is received. The listener has three options: it can provide authentication
    * credentials, it can cancel the request and display the error page, or it can take no action on the challenge. If
    * bad user credentials are provided, this may be called multiple times for the same request.
    * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object
    *     of this type.
    */
  val onAuthRequired: _WebRequestOnAuthRequiredEvent[
    js.Function1[
      /* details */ Anon_Challenger, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  /** Fired when a server-initiated redirect is about to occur. */
  val onBeforeRedirect: _WebRequestOnBeforeRedirectEvent[
    js.Function1[/* details */ Anon_CookieStoreIdDocumentUrlFrameIdFromCacheIncognito, Unit]
  ] = js.native
  /* webRequest events */
  /**
    * Fired when a request is about to occur.
    * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object
    *     of this type.
    */
  val onBeforeRequest: _WebRequestOnBeforeRequestEvent[
    js.Function1[
      /* details */ Anon_CookieStoreIdDocumentUrl, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  /**
    * Fired before sending an HTTP request, once the request headers are available. This may occur after a TCP
    * connection is made to the server, but before any HTTP data is sent.
    * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object
    *     of this type.
    */
  val onBeforeSendHeaders: _WebRequestOnBeforeSendHeadersEvent[
    js.Function1[
      /* details */ Anon_CookieStoreIdDocumentUrlFrameId, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  /** Fired when a request is completed. */
  val onCompleted: _WebRequestOnCompletedEvent[
    js.Function1[/* details */ Anon_CookieStoreIdDocumentUrlFrameIdFromCacheIncognitoIp, Unit]
  ] = js.native
  /** Fired when an error occurs. */
  val onErrorOccurred: _WebRequestOnErrorOccurredEvent[js.Function1[/* details */ Anon_CookieStoreIdDocumentUrlError, Unit]] = js.native
  /**
    * Fired when HTTP response headers of a request have been received.
    * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object
    *     of this type.
    */
  val onHeadersReceived: _WebRequestOnHeadersReceivedEvent[
    js.Function1[
      /* details */ Anon_CookieStoreIdDocumentUrlFrameIdIncognito, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  /**
    * Fired when the first byte of the response body is received. For HTTP requests, this means that the status line
    * and response headers are available.
    */
  val onResponseStarted: _WebRequestOnResponseStartedEvent[js.Function1[/* details */ Anon_CookieStoreIdDocumentUrlFrameIdFromCache, Unit]] = js.native
  /**
    * Fired just before a request is going to be sent to the server (modifications of previous onBeforeSendHeaders
    * callbacks are visible by the time onSendHeaders is fired).
    */
  val onSendHeaders: _WebRequestOnSendHeadersEvent[js.Function1[/* details */ Anon_CookieStoreIdDocumentUrlFrameId, Unit]] = js.native
  /** ... */
  def filterResponseData(requestId: String): js.Object = js.native
  /**
    * Retrieves the security information for the request. Returns a promise that will resolve to a SecurityInfo object.
    */
  def getSecurityInfo(requestId: String): js.Promise[SecurityInfo] = js.native
  def getSecurityInfo(requestId: String, options: Anon_CertificateChain): js.Promise[SecurityInfo] = js.native
  /* webRequest functions */
  /**
    * Needs to be called when the behavior of the webRequest handlers has changed to prevent incorrect handling due to
    * caching. This function call is expensive. Don't call it often.
    */
  def handlerBehaviorChanged(): js.Promise[Unit] = js.native
}

