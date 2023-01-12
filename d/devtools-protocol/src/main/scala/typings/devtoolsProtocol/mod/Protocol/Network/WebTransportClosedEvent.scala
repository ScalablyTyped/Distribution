package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebTransportClosedEvent extends StObject {
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime
  
  /**
    * WebTransport identifier.
    */
  var transportId: RequestId
}
object WebTransportClosedEvent {
  
  inline def apply(timestamp: MonotonicTime, transportId: RequestId): WebTransportClosedEvent = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTransportClosedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebTransportClosedEvent] (val x: Self) extends AnyVal {
    
    inline def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTransportId(value: RequestId): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
  }
}
