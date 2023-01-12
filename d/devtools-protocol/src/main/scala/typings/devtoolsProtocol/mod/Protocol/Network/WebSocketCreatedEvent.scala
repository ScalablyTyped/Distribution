package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketCreatedEvent extends StObject {
  
  /**
    * Request initiator.
    */
  var initiator: js.UndefOr[Initiator] = js.undefined
  
  /**
    * Request identifier.
    */
  var requestId: RequestId
  
  /**
    * WebSocket request URL.
    */
  var url: String
}
object WebSocketCreatedEvent {
  
  inline def apply(requestId: RequestId, url: String): WebSocketCreatedEvent = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketCreatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebSocketCreatedEvent] (val x: Self) extends AnyVal {
    
    inline def setInitiator(value: Initiator): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
