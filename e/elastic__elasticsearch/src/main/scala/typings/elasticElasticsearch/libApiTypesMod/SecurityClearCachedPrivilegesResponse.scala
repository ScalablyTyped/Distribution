package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityClearCachedPrivilegesResponse extends StObject {
  
  var _nodes: NodeStatistics
  
  var cluster_name: Name
  
  var nodes: Record[String, SecurityClusterNode]
}
object SecurityClearCachedPrivilegesResponse {
  
  inline def apply(_nodes: NodeStatistics, cluster_name: Name, nodes: Record[String, SecurityClusterNode]): SecurityClearCachedPrivilegesResponse = {
    val __obj = js.Dynamic.literal(_nodes = _nodes.asInstanceOf[js.Any], cluster_name = cluster_name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedPrivilegesResponse]
  }
  
  extension [Self <: SecurityClearCachedPrivilegesResponse](x: Self) {
    
    inline def setCluster_name(value: Name): Self = StObject.set(x, "cluster_name", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: Record[String, SecurityClusterNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def set_nodes(value: NodeStatistics): Self = StObject.set(x, "_nodes", value.asInstanceOf[js.Any])
  }
}
