package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.mod.Protocol.Network.ErrorReason
import typings.devtoolsProtocol.mod.Protocol.Network.Request
import typings.devtoolsProtocol.mod.Protocol.Network.ResourceType
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPausedEvent extends StObject {
  
  /**
    * The id of the frame that initiated the request.
    */
  var frameId: FrameId
  
  /**
    * If the intercepted request had a corresponding Network.requestWillBeSent event fired for it,
    * then this networkId will be the same as the requestId present in the requestWillBeSent event.
    */
  var networkId: js.UndefOr[RequestId] = js.undefined
  
  /**
    * The details of the request.
    */
  var request: Request
  
  /**
    * Each request the page makes will have a unique id.
    */
  var requestId: RequestId
  
  /**
    * How the requested resource will be used.
    */
  var resourceType: ResourceType
  
  /**
    * Response error if intercepted at response stage.
    */
  var responseErrorReason: js.UndefOr[ErrorReason] = js.undefined
  
  /**
    * Response headers if intercepted at the response stage.
    */
  var responseHeaders: js.UndefOr[js.Array[HeaderEntry]] = js.undefined
  
  /**
    * Response code if intercepted at response stage.
    */
  var responseStatusCode: js.UndefOr[integer] = js.undefined
  
  /**
    * Response status text if intercepted at response stage.
    */
  var responseStatusText: js.UndefOr[String] = js.undefined
}
object RequestPausedEvent {
  
  inline def apply(frameId: FrameId, request: Request, requestId: RequestId, resourceType: ResourceType): RequestPausedEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPausedEvent]
  }
  
  extension [Self <: RequestPausedEvent](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setNetworkId(value: RequestId): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
    
    inline def setNetworkIdUndefined: Self = StObject.set(x, "networkId", js.undefined)
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResponseErrorReason(value: ErrorReason): Self = StObject.set(x, "responseErrorReason", value.asInstanceOf[js.Any])
    
    inline def setResponseErrorReasonUndefined: Self = StObject.set(x, "responseErrorReason", js.undefined)
    
    inline def setResponseHeaders(value: js.Array[HeaderEntry]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    inline def setResponseHeadersVarargs(value: HeaderEntry*): Self = StObject.set(x, "responseHeaders", js.Array(value*))
    
    inline def setResponseStatusCode(value: integer): Self = StObject.set(x, "responseStatusCode", value.asInstanceOf[js.Any])
    
    inline def setResponseStatusCodeUndefined: Self = StObject.set(x, "responseStatusCode", js.undefined)
    
    inline def setResponseStatusText(value: String): Self = StObject.set(x, "responseStatusText", value.asInstanceOf[js.Any])
    
    inline def setResponseStatusTextUndefined: Self = StObject.set(x, "responseStatusText", js.undefined)
  }
}
