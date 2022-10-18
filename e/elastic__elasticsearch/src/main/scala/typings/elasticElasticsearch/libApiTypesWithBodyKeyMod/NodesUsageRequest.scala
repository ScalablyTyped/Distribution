package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesUsageRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var metric: js.UndefOr[Metrics] = js.undefined
  
  var node_id: js.UndefOr[NodeIds] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object NodesUsageRequest {
  
  inline def apply(): NodesUsageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesUsageRequest]
  }
  
  extension [Self <: NodesUsageRequest](x: Self) {
    
    inline def setMetric(value: Metrics): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value*))
    
    inline def setNode_id(value: NodeIds): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setNode_idVarargs(value: NodeId*): Self = StObject.set(x, "node_id", js.Array(value*))
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
