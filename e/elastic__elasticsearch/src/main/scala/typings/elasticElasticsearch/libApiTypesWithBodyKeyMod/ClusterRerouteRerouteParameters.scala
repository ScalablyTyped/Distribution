package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRerouteRerouteParameters extends StObject {
  
  var allow_primary: Boolean
  
  var from_node: js.UndefOr[NodeName] = js.undefined
  
  var index: IndexName
  
  var node: NodeName
  
  var shard: integer
  
  var to_node: js.UndefOr[NodeName] = js.undefined
}
object ClusterRerouteRerouteParameters {
  
  inline def apply(allow_primary: Boolean, index: IndexName, node: NodeName, shard: integer): ClusterRerouteRerouteParameters = {
    val __obj = js.Dynamic.literal(allow_primary = allow_primary.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], shard = shard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRerouteRerouteParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterRerouteRerouteParameters] (val x: Self) extends AnyVal {
    
    inline def setAllow_primary(value: Boolean): Self = StObject.set(x, "allow_primary", value.asInstanceOf[js.Any])
    
    inline def setFrom_node(value: NodeName): Self = StObject.set(x, "from_node", value.asInstanceOf[js.Any])
    
    inline def setFrom_nodeUndefined: Self = StObject.set(x, "from_node", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setNode(value: NodeName): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setShard(value: integer): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
    
    inline def setTo_node(value: NodeName): Self = StObject.set(x, "to_node", value.asInstanceOf[js.Any])
    
    inline def setTo_nodeUndefined: Self = StObject.set(x, "to_node", js.undefined)
  }
}
