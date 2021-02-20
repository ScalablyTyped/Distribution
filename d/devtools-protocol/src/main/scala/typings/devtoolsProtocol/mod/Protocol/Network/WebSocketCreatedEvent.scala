package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketCreatedEvent extends StObject {
  
  /**
    * Request initiator.
    */
  var initiator: js.UndefOr[Initiator] = js.native
  
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  
  /**
    * WebSocket request URL.
    */
  var url: String = js.native
}
object WebSocketCreatedEvent {
  
  @scala.inline
  def apply(requestId: RequestId, url: String): WebSocketCreatedEvent = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketCreatedEvent]
  }
  
  @scala.inline
  implicit class WebSocketCreatedEventMutableBuilder[Self <: WebSocketCreatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiator(value: Initiator): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
