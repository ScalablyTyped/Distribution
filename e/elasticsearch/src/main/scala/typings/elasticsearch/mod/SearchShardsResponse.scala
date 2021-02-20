package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchShardsResponse extends StObject {
  
  var nodes: js.Any = js.native
  
  var shards: js.Array[js.Array[SearchShardsResponseShard]] = js.native
}
object SearchShardsResponse {
  
  @scala.inline
  def apply(nodes: js.Any, shards: js.Array[js.Array[SearchShardsResponseShard]]): SearchShardsResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], shards = shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchShardsResponse]
  }
  
  @scala.inline
  implicit class SearchShardsResponseMutableBuilder[Self <: SearchShardsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShards(value: js.Array[js.Array[SearchShardsResponseShard]]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardsVarargs(value: js.Array[SearchShardsResponseShard]*): Self = StObject.set(x, "shards", js.Array(value :_*))
  }
}
