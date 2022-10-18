package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsStatsResponseBase
  extends StObject
     with NodesNodesResponseBase {
  
  var cluster_name: Name
  
  var cluster_uuid: Uuid
  
  var indices: ClusterStatsClusterIndices
  
  var nodes: ClusterStatsClusterNodes
  
  var status: HealthStatus
  
  var timestamp: long
}
object ClusterStatsStatsResponseBase {
  
  inline def apply(
    cluster_name: Name,
    cluster_uuid: Uuid,
    indices: ClusterStatsClusterIndices,
    nodes: ClusterStatsClusterNodes,
    status: HealthStatus,
    timestamp: long
  ): ClusterStatsStatsResponseBase = {
    val __obj = js.Dynamic.literal(cluster_name = cluster_name.asInstanceOf[js.Any], cluster_uuid = cluster_uuid.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsStatsResponseBase]
  }
  
  extension [Self <: ClusterStatsStatsResponseBase](x: Self) {
    
    inline def setCluster_name(value: Name): Self = StObject.set(x, "cluster_name", value.asInstanceOf[js.Any])
    
    inline def setCluster_uuid(value: Uuid): Self = StObject.set(x, "cluster_uuid", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: ClusterStatsClusterIndices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: ClusterStatsClusterNodes): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: HealthStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: long): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
