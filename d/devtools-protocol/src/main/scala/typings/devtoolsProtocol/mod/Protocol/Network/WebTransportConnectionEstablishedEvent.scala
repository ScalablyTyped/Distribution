package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebTransportConnectionEstablishedEvent extends StObject {
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime
  
  /**
    * WebTransport identifier.
    */
  var transportId: RequestId
}
object WebTransportConnectionEstablishedEvent {
  
  inline def apply(timestamp: MonotonicTime, transportId: RequestId): WebTransportConnectionEstablishedEvent = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTransportConnectionEstablishedEvent]
  }
  
  extension [Self <: WebTransportConnectionEstablishedEvent](x: Self) {
    
    inline def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTransportId(value: RequestId): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
  }
}
