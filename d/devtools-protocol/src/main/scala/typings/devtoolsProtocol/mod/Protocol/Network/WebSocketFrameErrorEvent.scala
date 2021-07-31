package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketFrameErrorEvent extends StObject {
  
  /**
    * WebSocket error message.
    */
  var errorMessage: String
  
  /**
    * Request identifier.
    */
  var requestId: RequestId
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime
}
object WebSocketFrameErrorEvent {
  
  @scala.inline
  def apply(errorMessage: String, requestId: RequestId, timestamp: MonotonicTime): WebSocketFrameErrorEvent = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketFrameErrorEvent]
  }
  
  @scala.inline
  implicit class WebSocketFrameErrorEventMutableBuilder[Self <: WebSocketFrameErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
