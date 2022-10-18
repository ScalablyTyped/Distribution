package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var flat_settings: js.UndefOr[Boolean] = js.undefined
  
  var node_id: js.UndefOr[NodeIds] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object ClusterStatsRequest {
  
  inline def apply(): ClusterStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterStatsRequest]
  }
  
  extension [Self <: ClusterStatsRequest](x: Self) {
    
    inline def setFlat_settings(value: Boolean): Self = StObject.set(x, "flat_settings", value.asInstanceOf[js.Any])
    
    inline def setFlat_settingsUndefined: Self = StObject.set(x, "flat_settings", js.undefined)
    
    inline def setNode_id(value: NodeIds): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setNode_idVarargs(value: NodeId*): Self = StObject.set(x, "node_id", js.Array(value*))
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
