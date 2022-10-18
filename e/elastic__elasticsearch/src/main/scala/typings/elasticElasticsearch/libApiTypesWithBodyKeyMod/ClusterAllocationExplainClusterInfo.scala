package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplainClusterInfo extends StObject {
  
  var nodes: Record[String, ClusterAllocationExplainNodeDiskUsage]
  
  var reserved_sizes: js.Array[ClusterAllocationExplainReservedSize]
  
  var shard_data_set_sizes: js.UndefOr[Record[String, String]] = js.undefined
  
  var shard_paths: Record[String, String]
  
  var shard_sizes: Record[String, long]
}
object ClusterAllocationExplainClusterInfo {
  
  inline def apply(
    nodes: Record[String, ClusterAllocationExplainNodeDiskUsage],
    reserved_sizes: js.Array[ClusterAllocationExplainReservedSize],
    shard_paths: Record[String, String],
    shard_sizes: Record[String, long]
  ): ClusterAllocationExplainClusterInfo = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], reserved_sizes = reserved_sizes.asInstanceOf[js.Any], shard_paths = shard_paths.asInstanceOf[js.Any], shard_sizes = shard_sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAllocationExplainClusterInfo]
  }
  
  extension [Self <: ClusterAllocationExplainClusterInfo](x: Self) {
    
    inline def setNodes(value: Record[String, ClusterAllocationExplainNodeDiskUsage]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setReserved_sizes(value: js.Array[ClusterAllocationExplainReservedSize]): Self = StObject.set(x, "reserved_sizes", value.asInstanceOf[js.Any])
    
    inline def setReserved_sizesVarargs(value: ClusterAllocationExplainReservedSize*): Self = StObject.set(x, "reserved_sizes", js.Array(value*))
    
    inline def setShard_data_set_sizes(value: Record[String, String]): Self = StObject.set(x, "shard_data_set_sizes", value.asInstanceOf[js.Any])
    
    inline def setShard_data_set_sizesUndefined: Self = StObject.set(x, "shard_data_set_sizes", js.undefined)
    
    inline def setShard_paths(value: Record[String, String]): Self = StObject.set(x, "shard_paths", value.asInstanceOf[js.Any])
    
    inline def setShard_sizes(value: Record[String, long]): Self = StObject.set(x, "shard_sizes", value.asInstanceOf[js.Any])
  }
}
