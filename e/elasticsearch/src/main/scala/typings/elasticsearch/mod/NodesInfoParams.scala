package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoParams
  extends StObject
     with GenericParams {
  
  var flatSettings: js.UndefOr[Boolean] = js.undefined
  
  var human: js.UndefOr[Boolean] = js.undefined
  
  var metric: js.UndefOr[NameList] = js.undefined
  
  var nodeId: NameList
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}
object NodesInfoParams {
  
  inline def apply(nodeId: NameList): NodesInfoParams = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoParams]
  }
  
  extension [Self <: NodesInfoParams](x: Self) {
    
    inline def setFlatSettings(value: Boolean): Self = StObject.set(x, "flatSettings", value.asInstanceOf[js.Any])
    
    inline def setFlatSettingsUndefined: Self = StObject.set(x, "flatSettings", js.undefined)
    
    inline def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    inline def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
    
    inline def setMetric(value: NameList): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value*))
    
    inline def setNodeId(value: NameList): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdVarargs(value: String*): Self = StObject.set(x, "nodeId", js.Array(value*))
    
    inline def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
