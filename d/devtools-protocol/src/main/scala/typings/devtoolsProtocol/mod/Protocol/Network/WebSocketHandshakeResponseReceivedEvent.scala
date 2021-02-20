package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketHandshakeResponseReceivedEvent extends StObject {
  
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  
  /**
    * WebSocket response data.
    */
  var response: WebSocketResponse = js.native
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime = js.native
}
object WebSocketHandshakeResponseReceivedEvent {
  
  @scala.inline
  def apply(requestId: RequestId, response: WebSocketResponse, timestamp: MonotonicTime): WebSocketHandshakeResponseReceivedEvent = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketHandshakeResponseReceivedEvent]
  }
  
  @scala.inline
  implicit class WebSocketHandshakeResponseReceivedEventMutableBuilder[Self <: WebSocketHandshakeResponseReceivedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: WebSocketResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
