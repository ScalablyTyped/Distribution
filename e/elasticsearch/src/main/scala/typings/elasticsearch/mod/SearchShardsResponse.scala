package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchShardsResponse extends StObject {
  
  var nodes: js.Any
  
  var shards: js.Array[js.Array[SearchShardsResponseShard]]
}
object SearchShardsResponse {
  
  inline def apply(nodes: js.Any, shards: js.Array[js.Array[SearchShardsResponseShard]]): SearchShardsResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], shards = shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchShardsResponse]
  }
  
  extension [Self <: SearchShardsResponse](x: Self) {
    
    inline def setNodes(value: js.Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setShards(value: js.Array[js.Array[SearchShardsResponseShard]]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsVarargs(value: js.Array[SearchShardsResponseShard]*): Self = StObject.set(x, "shards", js.Array(value :_*))
  }
}
