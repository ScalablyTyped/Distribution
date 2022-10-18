package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsShardRouting extends StObject {
  
  var node: String
  
  var primary: Boolean
  
  var relocating_node: js.UndefOr[String | Null] = js.undefined
  
  var state: IndicesStatsShardRoutingState
}
object IndicesStatsShardRouting {
  
  inline def apply(node: String, primary: Boolean, state: IndicesStatsShardRoutingState): IndicesStatsShardRouting = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsShardRouting]
  }
  
  extension [Self <: IndicesStatsShardRouting](x: Self) {
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setRelocating_node(value: String): Self = StObject.set(x, "relocating_node", value.asInstanceOf[js.Any])
    
    inline def setRelocating_nodeNull: Self = StObject.set(x, "relocating_node", null)
    
    inline def setRelocating_nodeUndefined: Self = StObject.set(x, "relocating_node", js.undefined)
    
    inline def setState(value: IndicesStatsShardRoutingState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
