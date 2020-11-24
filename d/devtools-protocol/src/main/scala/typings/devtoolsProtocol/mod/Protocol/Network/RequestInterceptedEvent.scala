package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestInterceptedEvent extends js.Object {
  
  /**
    * Details of the Authorization Challenge encountered. If this is set then
    * continueInterceptedRequest must contain an authChallengeResponse.
    */
  var authChallenge: js.UndefOr[AuthChallenge] = js.native
  
  /**
    * The id of the frame that initiated the request.
    */
  var frameId: FrameId = js.native
  
  /**
    * Each request the page makes will have a unique id, however if any redirects are encountered
    * while processing that fetch, they will be reported with the same id as the original fetch.
    * Likewise if HTTP authentication is needed then the same fetch id will be used.
    */
  var interceptionId: InterceptionId = js.native
  
  /**
    * Set if the request is a navigation that will result in a download.
    * Only present after response is received from the server (i.e. HeadersReceived stage).
    */
  var isDownload: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this is a navigation request, which can abort the navigation completely.
    */
  var isNavigationRequest: Boolean = js.native
  
  /**
    * Redirect location, only sent if a redirect was intercepted.
    */
  var redirectUrl: js.UndefOr[String] = js.native
  
  var request: Request = js.native
  
  /**
    * If the intercepted request had a corresponding requestWillBeSent event fired for it, then
    * this requestId will be the same as the requestId present in the requestWillBeSent event.
    */
  var requestId: js.UndefOr[RequestId] = js.native
  
  /**
    * How the requested resource will be used.
    */
  var resourceType: ResourceType = js.native
  
  /**
    * Response error if intercepted at response stage or if redirect occurred while intercepting
    * request.
    */
  var responseErrorReason: js.UndefOr[ErrorReason] = js.native
  
  /**
    * Response headers if intercepted at the response stage or if redirect occurred while
    * intercepting request or auth retry occurred.
    */
  var responseHeaders: js.UndefOr[Headers] = js.native
  
  /**
    * Response code if intercepted at response stage or if redirect occurred while intercepting
    * request or auth retry occurred.
    */
  var responseStatusCode: js.UndefOr[integer] = js.native
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
  implicit class RequestInterceptedEventOps[Self <: RequestInterceptedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptionId(value: InterceptionId): Self = this.set("interceptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNavigationRequest(value: Boolean): Self = this.set("isNavigationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthChallenge(value: AuthChallenge): Self = this.set("authChallenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthChallenge: Self = this.set("authChallenge", js.undefined)
    
    @scala.inline
    def setIsDownload(value: Boolean): Self = this.set("isDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDownload: Self = this.set("isDownload", js.undefined)
    
    @scala.inline
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUrl: Self = this.set("redirectUrl", js.undefined)
    
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    
    @scala.inline
    def setResponseErrorReason(value: ErrorReason): Self = this.set("responseErrorReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseErrorReason: Self = this.set("responseErrorReason", js.undefined)
    
    @scala.inline
    def setResponseHeaders(value: Headers): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseHeaders: Self = this.set("responseHeaders", js.undefined)
    
    @scala.inline
    def setResponseStatusCode(value: integer): Self = this.set("responseStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseStatusCode: Self = this.set("responseStatusCode", js.undefined)
  }
}
