package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestWillBeSentEvent extends StObject {
  
  /**
    * URL of the document this request is loaded for.
    */
  var documentURL: String
  
  /**
    * Frame identifier.
    */
  var frameId: js.UndefOr[FrameId] = js.undefined
  
  /**
    * Whether the request is initiated by a user gesture. Defaults to false.
    */
  var hasUserGesture: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request initiator.
    */
  var initiator: Initiator
  
  /**
    * Loader identifier. Empty string if the request is fetched from worker.
    */
  var loaderId: LoaderId
  
  /**
    * In the case that redirectResponse is populated, this flag indicates whether
    * requestWillBeSentExtraInfo and responseReceivedExtraInfo events will be or were emitted
    * for the request which was just redirected.
    */
  var redirectHasExtraInfo: Boolean
  
  /**
    * Redirect response data.
    */
  var redirectResponse: js.UndefOr[Response] = js.undefined
  
  /**
    * Request data.
    */
  var request: Request
  
  /**
    * Request identifier.
    */
  var requestId: RequestId
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime
  
  /**
    * Type of this resource.
    */
  var `type`: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * Timestamp.
    */
  var wallTime: TimeSinceEpoch
}
object RequestWillBeSentEvent {
  
  inline def apply(
    documentURL: String,
    initiator: Initiator,
    loaderId: LoaderId,
    redirectHasExtraInfo: Boolean,
    request: Request,
    requestId: RequestId,
    timestamp: MonotonicTime,
    wallTime: TimeSinceEpoch
  ): RequestWillBeSentEvent = {
    val __obj = js.Dynamic.literal(documentURL = documentURL.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], redirectHasExtraInfo = redirectHasExtraInfo.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], wallTime = wallTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestWillBeSentEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestWillBeSentEvent] (val x: Self) extends AnyVal {
    
    inline def setDocumentURL(value: String): Self = StObject.set(x, "documentURL", value.asInstanceOf[js.Any])
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setHasUserGesture(value: Boolean): Self = StObject.set(x, "hasUserGesture", value.asInstanceOf[js.Any])
    
    inline def setHasUserGestureUndefined: Self = StObject.set(x, "hasUserGesture", js.undefined)
    
    inline def setInitiator(value: Initiator): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    inline def setRedirectHasExtraInfo(value: Boolean): Self = StObject.set(x, "redirectHasExtraInfo", value.asInstanceOf[js.Any])
    
    inline def setRedirectResponse(value: Response): Self = StObject.set(x, "redirectResponse", value.asInstanceOf[js.Any])
    
    inline def setRedirectResponseUndefined: Self = StObject.set(x, "redirectResponse", js.undefined)
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWallTime(value: TimeSinceEpoch): Self = StObject.set(x, "wallTime", value.asInstanceOf[js.Any])
  }
}
