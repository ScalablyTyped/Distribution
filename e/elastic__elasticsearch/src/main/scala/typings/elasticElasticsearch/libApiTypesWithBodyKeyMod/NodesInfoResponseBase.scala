package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoResponseBase
  extends StObject
     with NodesNodesResponseBase {
  
  var cluster_name: Name
  
  var nodes: Record[String, NodesInfoNodeInfo]
}
object NodesInfoResponseBase {
  
  inline def apply(cluster_name: Name, nodes: Record[String, NodesInfoNodeInfo]): NodesInfoResponseBase = {
    val __obj = js.Dynamic.literal(cluster_name = cluster_name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoResponseBase]
  }
  
  extension [Self <: NodesInfoResponseBase](x: Self) {
    
    inline def setCluster_name(value: Name): Self = StObject.set(x, "cluster_name", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: Record[String, NodesInfoNodeInfo]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
