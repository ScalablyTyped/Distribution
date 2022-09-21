package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpointid extends StObject {
  
  var endpoint_id: js.UndefOr[String] = js.undefined
  
  // not used on linux
  var instance_id: js.UndefOr[String] = js.undefined
  
  var rx_bytes: Double
  
  var rx_dropped: Double
  
  var rx_errors: Double
  
  var rx_packets: Double
  
  var tx_bytes: Double
  
  var tx_dropped: Double
  
  var tx_errors: Double
  
  var tx_packets: Double
}
object Endpointid {
  
  inline def apply(
    rx_bytes: Double,
    rx_dropped: Double,
    rx_errors: Double,
    rx_packets: Double,
    tx_bytes: Double,
    tx_dropped: Double,
    tx_errors: Double,
    tx_packets: Double
  ): Endpointid = {
    val __obj = js.Dynamic.literal(rx_bytes = rx_bytes.asInstanceOf[js.Any], rx_dropped = rx_dropped.asInstanceOf[js.Any], rx_errors = rx_errors.asInstanceOf[js.Any], rx_packets = rx_packets.asInstanceOf[js.Any], tx_bytes = tx_bytes.asInstanceOf[js.Any], tx_dropped = tx_dropped.asInstanceOf[js.Any], tx_errors = tx_errors.asInstanceOf[js.Any], tx_packets = tx_packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpointid]
  }
  
  extension [Self <: Endpointid](x: Self) {
    
    inline def setEndpoint_id(value: String): Self = StObject.set(x, "endpoint_id", value.asInstanceOf[js.Any])
    
    inline def setEndpoint_idUndefined: Self = StObject.set(x, "endpoint_id", js.undefined)
    
    inline def setInstance_id(value: String): Self = StObject.set(x, "instance_id", value.asInstanceOf[js.Any])
    
    inline def setInstance_idUndefined: Self = StObject.set(x, "instance_id", js.undefined)
    
    inline def setRx_bytes(value: Double): Self = StObject.set(x, "rx_bytes", value.asInstanceOf[js.Any])
    
    inline def setRx_dropped(value: Double): Self = StObject.set(x, "rx_dropped", value.asInstanceOf[js.Any])
    
    inline def setRx_errors(value: Double): Self = StObject.set(x, "rx_errors", value.asInstanceOf[js.Any])
    
    inline def setRx_packets(value: Double): Self = StObject.set(x, "rx_packets", value.asInstanceOf[js.Any])
    
    inline def setTx_bytes(value: Double): Self = StObject.set(x, "tx_bytes", value.asInstanceOf[js.Any])
    
    inline def setTx_dropped(value: Double): Self = StObject.set(x, "tx_dropped", value.asInstanceOf[js.Any])
    
    inline def setTx_errors(value: Double): Self = StObject.set(x, "tx_errors", value.asInstanceOf[js.Any])
    
    inline def setTx_packets(value: Double): Self = StObject.set(x, "tx_packets", value.asInstanceOf[js.Any])
  }
}
