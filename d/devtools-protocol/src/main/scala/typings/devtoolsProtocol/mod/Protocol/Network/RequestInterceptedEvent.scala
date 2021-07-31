package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestInterceptedEvent extends StObject {
  
  /**
    * Details of the Authorization Challenge encountered. If this is set then
    * continueInterceptedRequest must contain an authChallengeResponse.
    */
  var authChallenge: js.UndefOr[AuthChallenge] = js.undefined
  
  /**
    * The id of the frame that initiated the request.
    */
  var frameId: FrameId
  
  /**
    * Each request the page makes will have a unique id, however if any redirects are encountered
    * while processing that fetch, they will be reported with the same id as the original fetch.
    * Likewise if HTTP authentication is needed then the same fetch id will be used.
    */
  var interceptionId: InterceptionId
  
  /**
    * Set if the request is a navigation that will result in a download.
    * Only present after response is received from the server (i.e. HeadersReceived stage).
    */
  var isDownload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this is a navigation request, which can abort the navigation completely.
    */
  var isNavigationRequest: Boolean
  
  /**
    * Redirect location, only sent if a redirect was intercepted.
    */
  var redirectUrl: js.UndefOr[String] = js.undefined
  
  var request: Request
  
  /**
    * If the intercepted request had a corresponding requestWillBeSent event fired for it, then
    * this requestId will be the same as the requestId present in the requestWillBeSent event.
    */
  var requestId: js.UndefOr[RequestId] = js.undefined
  
  /**
    * How the requested resource will be used.
    */
  var resourceType: ResourceType
  
  /**
    * Response error if intercepted at response stage or if redirect occurred while intercepting
    * request.
    */
  var responseErrorReason: js.UndefOr[ErrorReason] = js.undefined
  
  /**
    * Response headers if intercepted at the response stage or if redirect occurred while
    * intercepting request or auth retry occurred.
    */
  var responseHeaders: js.UndefOr[Headers] = js.undefined
  
  /**
    * Response code if intercepted at response stage or if redirect occurred while intercepting
    * request or auth retry occurred.
    */
  var responseStatusCode: js.UndefOr[integer] = js.undefined
}
object RequestInterceptedEvent {
  
  @scala.inline
  def apply(
    frameId: FrameId,
    interceptionId: InterceptionId,
    isNavigationRequest: Boolean,
    request: Request,
    resourceType: ResourceType
  ): RequestInterceptedEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], interceptionId = interceptionId.asInstanceOf[js.Any], isNavigationRequest = isNavigationRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInterceptedEvent]
  }
  
  @scala.inline
  implicit class RequestInterceptedEventMutableBuilder[Self <: RequestInterceptedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthChallenge(value: AuthChallenge): Self = StObject.set(x, "authChallenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthChallengeUndefined: Self = StObject.set(x, "authChallenge", js.undefined)
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptionId(value: InterceptionId): Self = StObject.set(x, "interceptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDownload(value: Boolean): Self = StObject.set(x, "isDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDownloadUndefined: Self = StObject.set(x, "isDownload", js.undefined)
    
    @scala.inline
    def setIsNavigationRequest(value: Boolean): Self = StObject.set(x, "isNavigationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    @scala.inline
    def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseErrorReason(value: ErrorReason): Self = StObject.set(x, "responseErrorReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseErrorReasonUndefined: Self = StObject.set(x, "responseErrorReason", js.undefined)
    
    @scala.inline
    def setResponseHeaders(value: Headers): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    @scala.inline
    def setResponseStatusCode(value: integer): Self = StObject.set(x, "responseStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatusCodeUndefined: Self = StObject.set(x, "responseStatusCode", js.undefined)
  }
}
