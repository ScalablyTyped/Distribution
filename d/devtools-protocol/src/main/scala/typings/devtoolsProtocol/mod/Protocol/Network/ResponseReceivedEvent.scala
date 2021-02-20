package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseReceivedEvent extends StObject {
  
  /**
    * Frame identifier.
    */
  var frameId: js.UndefOr[FrameId] = js.native
  
  /**
    * Loader identifier. Empty string if the request is fetched from worker.
    */
  var loaderId: LoaderId = js.native
  
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  
  /**
    * Response data.
    */
  var response: Response = js.native
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime = js.native
  
  /**
    * Resource type.
    */
  var `type`: ResourceType = js.native
}
object ResponseReceivedEvent {
  
  @scala.inline
  def apply(
    loaderId: LoaderId,
    requestId: RequestId,
    response: Response,
    timestamp: MonotonicTime,
    `type`: ResourceType
  ): ResponseReceivedEvent = {
    val __obj = js.Dynamic.literal(loaderId = loaderId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseReceivedEvent]
  }
  
  @scala.inline
  implicit class ResponseReceivedEventMutableBuilder[Self <: ResponseReceivedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    @scala.inline
    def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
