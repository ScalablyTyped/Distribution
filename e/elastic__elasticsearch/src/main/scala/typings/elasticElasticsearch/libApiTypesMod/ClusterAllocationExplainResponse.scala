package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplainResponse extends StObject {
  
  var allocate_explanation: js.UndefOr[String] = js.undefined
  
  var allocation_delay: js.UndefOr[Duration] = js.undefined
  
  var allocation_delay_in_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var can_allocate: js.UndefOr[ClusterAllocationExplainDecision] = js.undefined
  
  var can_move_to_other_node: js.UndefOr[ClusterAllocationExplainDecision] = js.undefined
  
  var can_rebalance_cluster: js.UndefOr[ClusterAllocationExplainDecision] = js.undefined
  
  var can_rebalance_cluster_decisions: js.UndefOr[js.Array[ClusterAllocationExplainAllocationDecision]] = js.undefined
  
  var can_rebalance_to_other_node: js.UndefOr[ClusterAllocationExplainDecision] = js.undefined
  
  var can_remain_decisions: js.UndefOr[js.Array[ClusterAllocationExplainAllocationDecision]] = js.undefined
  
  var can_remain_on_current_node: js.UndefOr[ClusterAllocationExplainDecision] = js.undefined
  
  var cluster_info: js.UndefOr[ClusterAllocationExplainClusterInfo] = js.undefined
  
  var configured_delay: js.UndefOr[Duration] = js.undefined
  
  var configured_delay_in_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var current_node: js.UndefOr[ClusterAllocationExplainCurrentNode] = js.undefined
  
  var current_state: String
  
  var index: IndexName
  
  var move_explanation: js.UndefOr[String] = js.undefined
  
  var node_allocation_decisions: js.UndefOr[js.Array[ClusterAllocationExplainNodeAllocationExplanation]] = js.undefined
  
  var note: js.UndefOr[String] = js.undefined
  
  var primary: Boolean
  
  var rebalance_explanation: js.UndefOr[String] = js.undefined
  
  var remaining_delay: js.UndefOr[Duration] = js.undefined
  
  var remaining_delay_in_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var shard: integer
  
  var unassigned_info: js.UndefOr[ClusterAllocationExplainUnassignedInformation] = js.undefined
}
object ClusterAllocationExplainResponse {
  
  inline def apply(current_state: String, index: IndexName, primary: Boolean, shard: integer): ClusterAllocationExplainResponse = {
    val __obj = js.Dynamic.literal(current_state = current_state.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], shard = shard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAllocationExplainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterAllocationExplainResponse] (val x: Self) extends AnyVal {
    
    inline def setAllocate_explanation(value: String): Self = StObject.set(x, "allocate_explanation", value.asInstanceOf[js.Any])
    
    inline def setAllocate_explanationUndefined: Self = StObject.set(x, "allocate_explanation", js.undefined)
    
    inline def setAllocation_delay(value: Duration): Self = StObject.set(x, "allocation_delay", value.asInstanceOf[js.Any])
    
    inline def setAllocation_delayUndefined: Self = StObject.set(x, "allocation_delay", js.undefined)
    
    inline def setAllocation_delay_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "allocation_delay_in_millis", value.asInstanceOf[js.Any])
    
    inline def setAllocation_delay_in_millisUndefined: Self = StObject.set(x, "allocation_delay_in_millis", js.undefined)
    
    inline def setCan_allocate(value: ClusterAllocationExplainDecision): Self = StObject.set(x, "can_allocate", value.asInstanceOf[js.Any])
    
    inline def setCan_allocateUndefined: Self = StObject.set(x, "can_allocate", js.undefined)
    
    inline def setCan_move_to_other_node(value: ClusterAllocationExplainDecision): Self = StObject.set(x, "can_move_to_other_node", value.asInstanceOf[js.Any])
    
    inline def setCan_move_to_other_nodeUndefined: Self = StObject.set(x, "can_move_to_other_node", js.undefined)
    
    inline def setCan_rebalance_cluster(value: ClusterAllocationExplainDecision): Self = StObject.set(x, "can_rebalance_cluster", value.asInstanceOf[js.Any])
    
    inline def setCan_rebalance_clusterUndefined: Self = StObject.set(x, "can_rebalance_cluster", js.undefined)
    
    inline def setCan_rebalance_cluster_decisions(value: js.Array[ClusterAllocationExplainAllocationDecision]): Self = StObject.set(x, "can_rebalance_cluster_decisions", value.asInstanceOf[js.Any])
    
    inline def setCan_rebalance_cluster_decisionsUndefined: Self = StObject.set(x, "can_rebalance_cluster_decisions", js.undefined)
    
    inline def setCan_rebalance_cluster_decisionsVarargs(value: ClusterAllocationExplainAllocationDecision*): Self = StObject.set(x, "can_rebalance_cluster_decisions", js.Array(value*))
    
    inline def setCan_rebalance_to_other_node(value: ClusterAllocationExplainDecision): Self = StObject.set(x, "can_rebalance_to_other_node", value.asInstanceOf[js.Any])
    
    inline def setCan_rebalance_to_other_nodeUndefined: Self = StObject.set(x, "can_rebalance_to_other_node", js.undefined)
    
    inline def setCan_remain_decisions(value: js.Array[ClusterAllocationExplainAllocationDecision]): Self = StObject.set(x, "can_remain_decisions", value.asInstanceOf[js.Any])
    
    inline def setCan_remain_decisionsUndefined: Self = StObject.set(x, "can_remain_decisions", js.undefined)
    
    inline def setCan_remain_decisionsVarargs(value: ClusterAllocationExplainAllocationDecision*): Self = StObject.set(x, "can_remain_decisions", js.Array(value*))
    
    inline def setCan_remain_on_current_node(value: ClusterAllocationExplainDecision): Self = StObject.set(x, "can_remain_on_current_node", value.asInstanceOf[js.Any])
    
    inline def setCan_remain_on_current_nodeUndefined: Self = StObject.set(x, "can_remain_on_current_node", js.undefined)
    
    inline def setCluster_info(value: ClusterAllocationExplainClusterInfo): Self = StObject.set(x, "cluster_info", value.asInstanceOf[js.Any])
    
    inline def setCluster_infoUndefined: Self = StObject.set(x, "cluster_info", js.undefined)
    
    inline def setConfigured_delay(value: Duration): Self = StObject.set(x, "configured_delay", value.asInstanceOf[js.Any])
    
    inline def setConfigured_delayUndefined: Self = StObject.set(x, "configured_delay", js.undefined)
    
    inline def setConfigured_delay_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "configured_delay_in_millis", value.asInstanceOf[js.Any])
    
    inline def setConfigured_delay_in_millisUndefined: Self = StObject.set(x, "configured_delay_in_millis", js.undefined)
    
    inline def setCurrent_node(value: ClusterAllocationExplainCurrentNode): Self = StObject.set(x, "current_node", value.asInstanceOf[js.Any])
    
    inline def setCurrent_nodeUndefined: Self = StObject.set(x, "current_node", js.undefined)
    
    inline def setCurrent_state(value: String): Self = StObject.set(x, "current_state", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMove_explanation(value: String): Self = StObject.set(x, "move_explanation", value.asInstanceOf[js.Any])
    
    inline def setMove_explanationUndefined: Self = StObject.set(x, "move_explanation", js.undefined)
    
    inline def setNode_allocation_decisions(value: js.Array[ClusterAllocationExplainNodeAllocationExplanation]): Self = StObject.set(x, "node_allocation_decisions", value.asInstanceOf[js.Any])
    
    inline def setNode_allocation_decisionsUndefined: Self = StObject.set(x, "node_allocation_decisions", js.undefined)
    
    inline def setNode_allocation_decisionsVarargs(value: ClusterAllocationExplainNodeAllocationExplanation*): Self = StObject.set(x, "node_allocation_decisions", js.Array(value*))
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setRebalance_explanation(value: String): Self = StObject.set(x, "rebalance_explanation", value.asInstanceOf[js.Any])
    
    inline def setRebalance_explanationUndefined: Self = StObject.set(x, "rebalance_explanation", js.undefined)
    
    inline def setRemaining_delay(value: Duration): Self = StObject.set(x, "remaining_delay", value.asInstanceOf[js.Any])
    
    inline def setRemaining_delayUndefined: Self = StObject.set(x, "remaining_delay", js.undefined)
    
    inline def setRemaining_delay_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "remaining_delay_in_millis", value.asInstanceOf[js.Any])
    
    inline def setRemaining_delay_in_millisUndefined: Self = StObject.set(x, "remaining_delay_in_millis", js.undefined)
    
    inline def setShard(value: integer): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
    
    inline def setUnassigned_info(value: ClusterAllocationExplainUnassignedInformation): Self = StObject.set(x, "unassigned_info", value.asInstanceOf[js.Any])
    
    inline def setUnassigned_infoUndefined: Self = StObject.set(x, "unassigned_info", js.undefined)
  }
}
