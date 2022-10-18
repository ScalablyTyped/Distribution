package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesTransport extends StObject {
  
  var inbound_handling_time_histogram: js.UndefOr[js.Array[NodesTransportHistogram]] = js.undefined
  
  var outbound_handling_time_histogram: js.UndefOr[js.Array[NodesTransportHistogram]] = js.undefined
  
  var rx_count: js.UndefOr[long] = js.undefined
  
  var rx_size: js.UndefOr[String] = js.undefined
  
  var rx_size_in_bytes: js.UndefOr[long] = js.undefined
  
  var server_open: js.UndefOr[integer] = js.undefined
  
  var total_outbound_connections: js.UndefOr[long] = js.undefined
  
  var tx_count: js.UndefOr[long] = js.undefined
  
  var tx_size: js.UndefOr[String] = js.undefined
  
  var tx_size_in_bytes: js.UndefOr[long] = js.undefined
}
object NodesTransport {
  
  inline def apply(): NodesTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesTransport]
  }
  
  extension [Self <: NodesTransport](x: Self) {
    
    inline def setInbound_handling_time_histogram(value: js.Array[NodesTransportHistogram]): Self = StObject.set(x, "inbound_handling_time_histogram", value.asInstanceOf[js.Any])
    
    inline def setInbound_handling_time_histogramUndefined: Self = StObject.set(x, "inbound_handling_time_histogram", js.undefined)
    
    inline def setInbound_handling_time_histogramVarargs(value: NodesTransportHistogram*): Self = StObject.set(x, "inbound_handling_time_histogram", js.Array(value*))
    
    inline def setOutbound_handling_time_histogram(value: js.Array[NodesTransportHistogram]): Self = StObject.set(x, "outbound_handling_time_histogram", value.asInstanceOf[js.Any])
    
    inline def setOutbound_handling_time_histogramUndefined: Self = StObject.set(x, "outbound_handling_time_histogram", js.undefined)
    
    inline def setOutbound_handling_time_histogramVarargs(value: NodesTransportHistogram*): Self = StObject.set(x, "outbound_handling_time_histogram", js.Array(value*))
    
    inline def setRx_count(value: long): Self = StObject.set(x, "rx_count", value.asInstanceOf[js.Any])
    
    inline def setRx_countUndefined: Self = StObject.set(x, "rx_count", js.undefined)
    
    inline def setRx_size(value: String): Self = StObject.set(x, "rx_size", value.asInstanceOf[js.Any])
    
    inline def setRx_sizeUndefined: Self = StObject.set(x, "rx_size", js.undefined)
    
    inline def setRx_size_in_bytes(value: long): Self = StObject.set(x, "rx_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setRx_size_in_bytesUndefined: Self = StObject.set(x, "rx_size_in_bytes", js.undefined)
    
    inline def setServer_open(value: integer): Self = StObject.set(x, "server_open", value.asInstanceOf[js.Any])
    
    inline def setServer_openUndefined: Self = StObject.set(x, "server_open", js.undefined)
    
    inline def setTotal_outbound_connections(value: long): Self = StObject.set(x, "total_outbound_connections", value.asInstanceOf[js.Any])
    
    inline def setTotal_outbound_connectionsUndefined: Self = StObject.set(x, "total_outbound_connections", js.undefined)
    
    inline def setTx_count(value: long): Self = StObject.set(x, "tx_count", value.asInstanceOf[js.Any])
    
    inline def setTx_countUndefined: Self = StObject.set(x, "tx_count", js.undefined)
    
    inline def setTx_size(value: String): Self = StObject.set(x, "tx_size", value.asInstanceOf[js.Any])
    
    inline def setTx_sizeUndefined: Self = StObject.set(x, "tx_size", js.undefined)
    
    inline def setTx_size_in_bytes(value: long): Self = StObject.set(x, "tx_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTx_size_in_bytesUndefined: Self = StObject.set(x, "tx_size_in_bytes", js.undefined)
  }
}
