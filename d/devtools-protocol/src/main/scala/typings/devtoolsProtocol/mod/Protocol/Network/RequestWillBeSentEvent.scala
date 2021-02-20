package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestWillBeSentEvent extends StObject {
  
  /**
    * URL of the document this request is loaded for.
    */
  var documentURL: String = js.native
  
  /**
    * Frame identifier.
    */
  var frameId: js.UndefOr[FrameId] = js.native
  
  /**
    * Whether the request is initiated by a user gesture. Defaults to false.
    */
  var hasUserGesture: js.UndefOr[Boolean] = js.native
  
  /**
    * Request initiator.
    */
  var initiator: Initiator = js.native
  
  /**
    * Loader identifier. Empty string if the request is fetched from worker.
    */
  var loaderId: LoaderId = js.native
  
  /**
    * Redirect response data.
    */
  var redirectResponse: js.UndefOr[Response] = js.native
  
  /**
    * Request data.
    */
  var request: Request = js.native
  
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime = js.native
  
  /**
    * Type of this resource.
    */
  var `type`: js.UndefOr[ResourceType] = js.native
  
  /**
    * Timestamp.
    */
  var wallTime: TimeSinceEpoch = js.native
}
object RequestWillBeSentEvent {
  
  @scala.inline
  def apply(
    documentURL: String,
    initiator: Initiator,
    loaderId: LoaderId,
    request: Request,
    requestId: RequestId,
    timestamp: MonotonicTime,
    wallTime: TimeSinceEpoch
  ): RequestWillBeSentEvent = {
    val __obj = js.Dynamic.literal(documentURL = documentURL.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], wallTime = wallTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestWillBeSentEvent]
  }
  
  @scala.inline
  implicit class RequestWillBeSentEventMutableBuilder[Self <: RequestWillBeSentEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentURL(value: String): Self = StObject.set(x, "documentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    @scala.inline
    def setHasUserGesture(value: Boolean): Self = StObject.set(x, "hasUserGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasUserGestureUndefined: Self = StObject.set(x, "hasUserGesture", js.undefined)
    
    @scala.inline
    def setInitiator(value: Initiator): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectResponse(value: Response): Self = StObject.set(x, "redirectResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectResponseUndefined: Self = StObject.set(x, "redirectResponse", js.undefined)
    
    @scala.inline
    def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWallTime(value: TimeSinceEpoch): Self = StObject.set(x, "wallTime", value.asInstanceOf[js.Any])
  }
}
