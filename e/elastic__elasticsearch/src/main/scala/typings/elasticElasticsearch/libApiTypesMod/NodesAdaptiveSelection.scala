package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesAdaptiveSelection extends StObject {
  
  var avg_queue_size: js.UndefOr[long] = js.undefined
  
  var avg_response_time: js.UndefOr[long] = js.undefined
  
  var avg_response_time_ns: js.UndefOr[long] = js.undefined
  
  var avg_service_time: js.UndefOr[String] = js.undefined
  
  var avg_service_time_ns: js.UndefOr[long] = js.undefined
  
  var outgoing_searches: js.UndefOr[long] = js.undefined
  
  var rank: js.UndefOr[String] = js.undefined
}
object NodesAdaptiveSelection {
  
  inline def apply(): NodesAdaptiveSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesAdaptiveSelection]
  }
  
  extension [Self <: NodesAdaptiveSelection](x: Self) {
    
    inline def setAvg_queue_size(value: long): Self = StObject.set(x, "avg_queue_size", value.asInstanceOf[js.Any])
    
    inline def setAvg_queue_sizeUndefined: Self = StObject.set(x, "avg_queue_size", js.undefined)
    
    inline def setAvg_response_time(value: long): Self = StObject.set(x, "avg_response_time", value.asInstanceOf[js.Any])
    
    inline def setAvg_response_timeUndefined: Self = StObject.set(x, "avg_response_time", js.undefined)
    
    inline def setAvg_response_time_ns(value: long): Self = StObject.set(x, "avg_response_time_ns", value.asInstanceOf[js.Any])
    
    inline def setAvg_response_time_nsUndefined: Self = StObject.set(x, "avg_response_time_ns", js.undefined)
    
    inline def setAvg_service_time(value: String): Self = StObject.set(x, "avg_service_time", value.asInstanceOf[js.Any])
    
    inline def setAvg_service_timeUndefined: Self = StObject.set(x, "avg_service_time", js.undefined)
    
    inline def setAvg_service_time_ns(value: long): Self = StObject.set(x, "avg_service_time_ns", value.asInstanceOf[js.Any])
    
    inline def setAvg_service_time_nsUndefined: Self = StObject.set(x, "avg_service_time_ns", js.undefined)
    
    inline def setOutgoing_searches(value: long): Self = StObject.set(x, "outgoing_searches", value.asInstanceOf[js.Any])
    
    inline def setOutgoing_searchesUndefined: Self = StObject.set(x, "outgoing_searches", js.undefined)
    
    inline def setRank(value: String): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
  }
}
