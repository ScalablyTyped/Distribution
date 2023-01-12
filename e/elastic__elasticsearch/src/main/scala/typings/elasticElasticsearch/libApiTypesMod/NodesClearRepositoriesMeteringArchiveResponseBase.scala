package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesClearRepositoriesMeteringArchiveResponseBase
  extends StObject
     with NodesNodesResponseBase {
  
  var cluster_name: Name
  
  var nodes: Record[String, NodesRepositoryMeteringInformation]
}
object NodesClearRepositoriesMeteringArchiveResponseBase {
  
  inline def apply(cluster_name: Name, nodes: Record[String, NodesRepositoryMeteringInformation]): NodesClearRepositoriesMeteringArchiveResponseBase = {
    val __obj = js.Dynamic.literal(cluster_name = cluster_name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesClearRepositoriesMeteringArchiveResponseBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesClearRepositoriesMeteringArchiveResponseBase] (val x: Self) extends AnyVal {
    
    inline def setCluster_name(value: Name): Self = StObject.set(x, "cluster_name", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: Record[String, NodesRepositoryMeteringInformation]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
