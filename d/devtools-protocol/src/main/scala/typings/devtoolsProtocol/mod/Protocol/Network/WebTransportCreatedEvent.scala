package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebTransportCreatedEvent extends StObject {
  
  /**
    * Request initiator.
    */
  var initiator: js.UndefOr[Initiator] = js.undefined
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime
  
  /**
    * WebTransport identifier.
    */
  var transportId: RequestId
  
  /**
    * WebTransport request URL.
    */
  var url: String
}
object WebTransportCreatedEvent {
  
  inline def apply(timestamp: MonotonicTime, transportId: RequestId, url: String): WebTransportCreatedEvent = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTransportCreatedEvent]
  }
  
  extension [Self <: WebTransportCreatedEvent](x: Self) {
    
    inline def setInitiator(value: Initiator): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTransportId(value: RequestId): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
