package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchShardsResponse extends StObject {
  
  var indices: Record[IndexName, SearchShardsShardStoreIndex]
  
  var nodes: Record[String, NodeAttributes]
  
  var shards: js.Array[js.Array[NodeShard]]
}
object SearchShardsResponse {
  
  inline def apply(
    indices: Record[IndexName, SearchShardsShardStoreIndex],
    nodes: Record[String, NodeAttributes],
    shards: js.Array[js.Array[NodeShard]]
  ): SearchShardsResponse = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], shards = shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchShardsResponse]
  }
  
  extension [Self <: SearchShardsResponse](x: Self) {
    
    inline def setIndices(value: Record[IndexName, SearchShardsShardStoreIndex]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: Record[String, NodeAttributes]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setShards(value: js.Array[js.Array[NodeShard]]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsVarargs(value: js.Array[NodeShard]*): Self = StObject.set(x, "shards", js.Array(value*))
  }
}
