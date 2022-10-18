package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesStatsResponseBase
  extends StObject
     with NodesNodesResponseBase {
  
  var cluster_name: js.UndefOr[Name] = js.undefined
  
  var nodes: Record[String, NodesStats]
}
object NodesStatsResponseBase {
  
  inline def apply(nodes: Record[String, NodesStats]): NodesStatsResponseBase = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesStatsResponseBase]
  }
  
  extension [Self <: NodesStatsResponseBase](x: Self) {
    
    inline def setCluster_name(value: Name): Self = StObject.set(x, "cluster_name", value.asInstanceOf[js.Any])
    
    inline def setCluster_nameUndefined: Self = StObject.set(x, "cluster_name", js.undefined)
    
    inline def setNodes(value: Record[String, NodesStats]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
