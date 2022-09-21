package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsParams
  extends StObject
     with GenericParams {
  
  var flatSettings: js.UndefOr[Boolean] = js.undefined
  
  var human: js.UndefOr[Boolean] = js.undefined
  
  var nodeId: js.UndefOr[NameList] = js.undefined
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}
object ClusterStatsParams {
  
  inline def apply(): ClusterStatsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterStatsParams]
  }
  
  extension [Self <: ClusterStatsParams](x: Self) {
    
    inline def setFlatSettings(value: Boolean): Self = StObject.set(x, "flatSettings", value.asInstanceOf[js.Any])
    
    inline def setFlatSettingsUndefined: Self = StObject.set(x, "flatSettings", js.undefined)
    
    inline def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    inline def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
    
    inline def setNodeId(value: NameList): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setNodeIdVarargs(value: String*): Self = StObject.set(x, "nodeId", js.Array(value*))
    
    inline def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
