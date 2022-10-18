package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRerouteCommandAllocateReplicaAction extends StObject {
  
  var index: IndexName
  
  var node: String
  
  var shard: integer
}
object ClusterRerouteCommandAllocateReplicaAction {
  
  inline def apply(index: IndexName, node: String, shard: integer): ClusterRerouteCommandAllocateReplicaAction = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], shard = shard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRerouteCommandAllocateReplicaAction]
  }
  
  extension [Self <: ClusterRerouteCommandAllocateReplicaAction](x: Self) {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setShard(value: integer): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
  }
}
