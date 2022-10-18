package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRerouteCommandMoveAction extends StObject {
  
  var from_node: String
  
  var index: IndexName
  
  var shard: integer
  
  var to_node: String
}
object ClusterRerouteCommandMoveAction {
  
  inline def apply(from_node: String, index: IndexName, shard: integer, to_node: String): ClusterRerouteCommandMoveAction = {
    val __obj = js.Dynamic.literal(from_node = from_node.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], shard = shard.asInstanceOf[js.Any], to_node = to_node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRerouteCommandMoveAction]
  }
  
  extension [Self <: ClusterRerouteCommandMoveAction](x: Self) {
    
    inline def setFrom_node(value: String): Self = StObject.set(x, "from_node", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setShard(value: integer): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
    
    inline def setTo_node(value: String): Self = StObject.set(x, "to_node", value.asInstanceOf[js.Any])
  }
}
