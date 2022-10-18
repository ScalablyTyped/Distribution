package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterIndicesShardsIndex extends StObject {
  
  var primaries: ClusterStatsClusterShardMetrics
  
  var replication: ClusterStatsClusterShardMetrics
  
  var shards: ClusterStatsClusterShardMetrics
}
object ClusterStatsClusterIndicesShardsIndex {
  
  inline def apply(
    primaries: ClusterStatsClusterShardMetrics,
    replication: ClusterStatsClusterShardMetrics,
    shards: ClusterStatsClusterShardMetrics
  ): ClusterStatsClusterIndicesShardsIndex = {
    val __obj = js.Dynamic.literal(primaries = primaries.asInstanceOf[js.Any], replication = replication.asInstanceOf[js.Any], shards = shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterIndicesShardsIndex]
  }
  
  extension [Self <: ClusterStatsClusterIndicesShardsIndex](x: Self) {
    
    inline def setPrimaries(value: ClusterStatsClusterShardMetrics): Self = StObject.set(x, "primaries", value.asInstanceOf[js.Any])
    
    inline def setReplication(value: ClusterStatsClusterShardMetrics): Self = StObject.set(x, "replication", value.asInstanceOf[js.Any])
    
    inline def setShards(value: ClusterStatsClusterShardMetrics): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
  }
}
