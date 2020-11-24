package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchShardsResponse extends js.Object {
  
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
  implicit class SearchShardsResponseOps[Self <: SearchShardsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNodes(value: js.Any): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardsVarargs(value: js.Array[SearchShardsResponseShard]*): Self = this.set("shards", js.Array(value :_*))
    
    @scala.inline
    def setShards(value: js.Array[js.Array[SearchShardsResponseShard]]): Self = this.set("shards", value.asInstanceOf[js.Any])
  }
}
