package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.webRequest.BlockingResponse
import typings.firefoxWebextBrowser.browser.webRequest.GetSecurityInfoOptions
import typings.firefoxWebextBrowser.browser.webRequest.OnAuthRequiredDetails
import typings.firefoxWebextBrowser.browser.webRequest.OnBeforeRedirectDetails
import typings.firefoxWebextBrowser.browser.webRequest.OnBeforeRequestDetails
import typings.firefoxWebextBrowser.browser.webRequest.OnBeforeSendHeadersDetails
import typings.firefoxWebextBrowser.browser.webRequest.OnCompletedDetails
import typings.firefoxWebextBrowser.browser.webRequest.OnErrorOccurredDetails
import typings.firefoxWebextBrowser.browser.webRequest.OnHeadersReceivedDetails
import typings.firefoxWebextBrowser.browser.webRequest.OnResponseStartedDetails
import typings.firefoxWebextBrowser.browser.webRequest.OnSendHeadersDetails
import typings.firefoxWebextBrowser.browser.webRequest.SecurityInfo
import typings.firefoxWebextBrowser.browser.webRequest.StreamFilter
import typings.firefoxWebextBrowser.browser.webRequest.WebRequestOnAuthRequiredEvent
import typings.firefoxWebextBrowser.browser.webRequest.WebRequestOnBeforeRedirectEvent
import typings.firefoxWebextBrowser.browser.webRequest.WebRequestOnBeforeRequestEvent
import typings.firefoxWebextBrowser.browser.webRequest.WebRequestOnBeforeSendHeadersEvent
import typings.firefoxWebextBrowser.browser.webRequest.WebRequestOnCompletedEvent
import typings.firefoxWebextBrowser.browser.webRequest.WebRequestOnErrorOccurredEvent
import typings.firefoxWebextBrowser.browser.webRequest.WebRequestOnHeadersReceivedEvent
import typings.firefoxWebextBrowser.browser.webRequest.WebRequestOnResponseStartedEvent
import typings.firefoxWebextBrowser.browser.webRequest.WebRequestOnSendHeadersEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.webRequest` API to observe and analyze traffic and to intercept, block, or modify requests in-flight.
  *
  * Permissions: `webRequest`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object webRequest {
  
  @JSGlobal("browser.webRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /* webRequest properties */
  /**
    * The maximum number of times that `handlerBehaviorChanged` can be called per 10 minute sustained interval. `handlerBehaviorChanged` is an expensive function call that shouldn't be called often.
    */
  @JSGlobal("browser.webRequest.MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES")
  @js.native
  val MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Double = js.native
  
  /** ... */
  @scala.inline
  def filterResponseData(requestId: String): StreamFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("filterResponseData")(requestId.asInstanceOf[js.Any]).asInstanceOf[StreamFilter]
  
  /**
    * Retrieves the security information for the request. Returns a promise that will resolve to a SecurityInfo object.
    */
  @scala.inline
  def getSecurityInfo(requestId: String): js.Promise[SecurityInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityInfo")(requestId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SecurityInfo]]
  @scala.inline
  def getSecurityInfo(requestId: String, options: GetSecurityInfoOptions): js.Promise[SecurityInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityInfo")(requestId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SecurityInfo]]
  
  /* webRequest functions */
  /**
    * Needs to be called when the behavior of the webRequest handlers has changed to prevent incorrect handling due to caching. This function call is expensive. Don't call it often.
    */
  @scala.inline
  def handlerBehaviorChanged(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handlerBehaviorChanged")().asInstanceOf[js.Promise[Unit]]
  
  /**
    * Fired when an authentication failure is received. The listener has three options: it can provide authentication credentials, it can cancel the request and display the error page, or it can take no action on the challenge. If bad user credentials are provided, this may be called multiple times for the same request.
    * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object of this type.
    */
  @JSGlobal("browser.webRequest.onAuthRequired")
  @js.native
  val onAuthRequired: WebRequestOnAuthRequiredEvent[
    js.Function1[
      /* details */ OnAuthRequiredDetails, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  
  /** Fired when a server-initiated redirect is about to occur. */
  @JSGlobal("browser.webRequest.onBeforeRedirect")
  @js.native
  val onBeforeRedirect: WebRequestOnBeforeRedirectEvent[js.Function1[/* details */ OnBeforeRedirectDetails, Unit]] = js.native
  
  /* webRequest events */
  /**
    * Fired when a request is about to occur.
    * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object of this type.
    */
  @JSGlobal("browser.webRequest.onBeforeRequest")
  @js.native
  val onBeforeRequest: WebRequestOnBeforeRequestEvent[
    js.Function1[
      /* details */ OnBeforeRequestDetails, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  
  /**
    * Fired before sending an HTTP request, once the request headers are available. This may occur after a TCP connection is made to the server, but before any HTTP data is sent.
    * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object of this type.
    */
  @JSGlobal("browser.webRequest.onBeforeSendHeaders")
  @js.native
  val onBeforeSendHeaders: WebRequestOnBeforeSendHeadersEvent[
    js.Function1[
      /* details */ OnBeforeSendHeadersDetails, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  
  /** Fired when a request is completed. */
  @JSGlobal("browser.webRequest.onCompleted")
  @js.native
  val onCompleted: WebRequestOnCompletedEvent[js.Function1[/* details */ OnCompletedDetails, Unit]] = js.native
  
  /** Fired when an error occurs. */
  @JSGlobal("browser.webRequest.onErrorOccurred")
  @js.native
  val onErrorOccurred: WebRequestOnErrorOccurredEvent[js.Function1[/* details */ OnErrorOccurredDetails, Unit]] = js.native
  
  /**
    * Fired when HTTP response headers of a request have been received.
    * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object of this type.
    */
  @JSGlobal("browser.webRequest.onHeadersReceived")
  @js.native
  val onHeadersReceived: WebRequestOnHeadersReceivedEvent[
    js.Function1[
      /* details */ OnHeadersReceivedDetails, 
      BlockingResponse | js.Promise[BlockingResponse] | Unit
    ]
  ] = js.native
  
  /**
    * Fired when the first byte of the response body is received. For HTTP requests, this means that the status line and response headers are available.
    */
  @JSGlobal("browser.webRequest.onResponseStarted")
  @js.native
  val onResponseStarted: WebRequestOnResponseStartedEvent[js.Function1[/* details */ OnResponseStartedDetails, Unit]] = js.native
  
  /**
    * Fired just before a request is going to be sent to the server (modifications of previous onBeforeSendHeaders callbacks are visible by the time onSendHeaders is fired).
    */
  @JSGlobal("browser.webRequest.onSendHeaders")
  @js.native
  val onSendHeaders: WebRequestOnSendHeadersEvent[js.Function1[/* details */ OnSendHeadersDetails, Unit]] = js.native
}
