package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesNodesResponseBase extends StObject {
  
  var _nodes: js.UndefOr[NodeStatistics] = js.undefined
}
object NodesNodesResponseBase {
  
  inline def apply(): NodesNodesResponseBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesNodesResponseBase]
  }
  
  extension [Self <: NodesNodesResponseBase](x: Self) {
    
    inline def set_nodes(value: NodeStatistics): Self = StObject.set(x, "_nodes", value.asInstanceOf[js.Any])
    
    inline def set_nodesUndefined: Self = StObject.set(x, "_nodes", js.undefined)
  }
}
