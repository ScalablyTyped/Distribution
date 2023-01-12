package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeShard extends StObject {
  
  var allocation_id: js.UndefOr[Record[String, Id]] = js.undefined
  
  var index: IndexName
  
  var node: js.UndefOr[NodeName] = js.undefined
  
  var primary: Boolean
  
  var recovery_source: js.UndefOr[Record[String, Id]] = js.undefined
  
  var relocating_node: js.UndefOr[NodeId | Null] = js.undefined
  
  var shard: integer
  
  var state: IndicesStatsShardRoutingState
  
  var unassigned_info: js.UndefOr[ClusterAllocationExplainUnassignedInformation] = js.undefined
}
object NodeShard {
  
  inline def apply(index: IndexName, primary: Boolean, shard: integer, state: IndicesStatsShardRoutingState): NodeShard = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], shard = shard.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeShard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeShard] (val x: Self) extends AnyVal {
    
    inline def setAllocation_id(value: Record[String, Id]): Self = StObject.set(x, "allocation_id", value.asInstanceOf[js.Any])
    
    inline def setAllocation_idUndefined: Self = StObject.set(x, "allocation_id", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setNode(value: NodeName): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setRecovery_source(value: Record[String, Id]): Self = StObject.set(x, "recovery_source", value.asInstanceOf[js.Any])
    
    inline def setRecovery_sourceUndefined: Self = StObject.set(x, "recovery_source", js.undefined)
    
    inline def setRelocating_node(value: NodeId): Self = StObject.set(x, "relocating_node", value.asInstanceOf[js.Any])
    
    inline def setRelocating_nodeNull: Self = StObject.set(x, "relocating_node", null)
    
    inline def setRelocating_nodeUndefined: Self = StObject.set(x, "relocating_node", js.undefined)
    
    inline def setShard(value: integer): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
    
    inline def setState(value: IndicesStatsShardRoutingState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUnassigned_info(value: ClusterAllocationExplainUnassignedInformation): Self = StObject.set(x, "unassigned_info", value.asInstanceOf[js.Any])
    
    inline def setUnassigned_infoUndefined: Self = StObject.set(x, "unassigned_info", js.undefined)
  }
}
