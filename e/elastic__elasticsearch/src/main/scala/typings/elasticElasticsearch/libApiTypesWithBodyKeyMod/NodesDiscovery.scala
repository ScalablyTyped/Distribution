package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesDiscovery extends StObject {
  
  var cluster_applier_stats: js.UndefOr[NodesClusterAppliedStats] = js.undefined
  
  var cluster_state_queue: js.UndefOr[NodesClusterStateQueue] = js.undefined
  
  var cluster_state_update: js.UndefOr[Record[String, NodesClusterStateUpdate]] = js.undefined
  
  var published_cluster_states: js.UndefOr[NodesPublishedClusterStates] = js.undefined
  
  var serialized_cluster_states: js.UndefOr[NodesSerializedClusterState] = js.undefined
}
object NodesDiscovery {
  
  inline def apply(): NodesDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesDiscovery]
  }
  
  extension [Self <: NodesDiscovery](x: Self) {
    
    inline def setCluster_applier_stats(value: NodesClusterAppliedStats): Self = StObject.set(x, "cluster_applier_stats", value.asInstanceOf[js.Any])
    
    inline def setCluster_applier_statsUndefined: Self = StObject.set(x, "cluster_applier_stats", js.undefined)
    
    inline def setCluster_state_queue(value: NodesClusterStateQueue): Self = StObject.set(x, "cluster_state_queue", value.asInstanceOf[js.Any])
    
    inline def setCluster_state_queueUndefined: Self = StObject.set(x, "cluster_state_queue", js.undefined)
    
    inline def setCluster_state_update(value: Record[String, NodesClusterStateUpdate]): Self = StObject.set(x, "cluster_state_update", value.asInstanceOf[js.Any])
    
    inline def setCluster_state_updateUndefined: Self = StObject.set(x, "cluster_state_update", js.undefined)
    
    inline def setPublished_cluster_states(value: NodesPublishedClusterStates): Self = StObject.set(x, "published_cluster_states", value.asInstanceOf[js.Any])
    
    inline def setPublished_cluster_statesUndefined: Self = StObject.set(x, "published_cluster_states", js.undefined)
    
    inline def setSerialized_cluster_states(value: NodesSerializedClusterState): Self = StObject.set(x, "serialized_cluster_states", value.asInstanceOf[js.Any])
    
    inline def setSerialized_cluster_statesUndefined: Self = StObject.set(x, "serialized_cluster_states", js.undefined)
  }
}
