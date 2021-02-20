package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.mod.Protocol.Network.ErrorReason
import typings.devtoolsProtocol.mod.Protocol.Network.Request
import typings.devtoolsProtocol.mod.Protocol.Network.ResourceType
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestPausedEvent extends StObject {
  
  /**
    * The id of the frame that initiated the request.
    */
  var frameId: FrameId = js.native
  
  /**
    * If the intercepted request had a corresponding Network.requestWillBeSent event fired for it,
    * then this networkId will be the same as the requestId present in the requestWillBeSent event.
    */
  var networkId: js.UndefOr[RequestId] = js.native
  
  /**
    * The details of the request.
    */
  var request: Request = js.native
  
  /**
    * Each request the page makes will have a unique id.
    */
  var requestId: RequestId = js.native
  
  /**
    * How the requested resource will be used.
    */
  var resourceType: ResourceType = js.native
  
  /**
    * Response error if intercepted at response stage.
    */
  var responseErrorReason: js.UndefOr[ErrorReason] = js.native
  
  /**
    * Response headers if intercepted at the response stage.
    */
  var responseHeaders: js.UndefOr[js.Array[HeaderEntry]] = js.native
  
  /**
    * Response code if intercepted at response stage.
    */
  var responseStatusCode: js.UndefOr[integer] = js.native
}
object RequestPausedEvent {
  
  @scala.inline
  def apply(frameId: FrameId, request: Request, requestId: RequestId, resourceType: ResourceType): RequestPausedEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPausedEvent]
  }
  
  @scala.inline
  implicit class RequestPausedEventMutableBuilder[Self <: RequestPausedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkId(value: RequestId): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkIdUndefined: Self = StObject.set(x, "networkId", js.undefined)
    
    @scala.inline
    def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseErrorReason(value: ErrorReason): Self = StObject.set(x, "responseErrorReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseErrorReasonUndefined: Self = StObject.set(x, "responseErrorReason", js.undefined)
    
    @scala.inline
    def setResponseHeaders(value: js.Array[HeaderEntry]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    @scala.inline
    def setResponseHeadersVarargs(value: HeaderEntry*): Self = StObject.set(x, "responseHeaders", js.Array(value :_*))
    
    @scala.inline
    def setResponseStatusCode(value: integer): Self = StObject.set(x, "responseStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatusCodeUndefined: Self = StObject.set(x, "responseStatusCode", js.undefined)
  }
}
