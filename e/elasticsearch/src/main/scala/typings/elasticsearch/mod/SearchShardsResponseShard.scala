package typings.elasticsearch.mod

import typings.elasticsearch.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchShardsResponseShard extends js.Object {
  
  var allocation_id: Id = js.native
  
  var index: String = js.native
  
  var node: String = js.native
  
  var primary: Boolean = js.native
  
  var relocating_node: js.Any = js.native
  
  var share: Double = js.native
  
  var state: String = js.native
}
object SearchShardsResponseShard {
  
  @scala.inline
  def apply(
    allocation_id: Id,
    index: String,
    node: String,
    primary: Boolean,
    relocating_node: js.Any,
    share: Double,
    state: String
  ): SearchShardsResponseShard = {
    val __obj = js.Dynamic.literal(allocation_id = allocation_id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], relocating_node = relocating_node.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchShardsResponseShard]
  }
  
  @scala.inline
  implicit class SearchShardsResponseShardOps[Self <: SearchShardsResponseShard] (val x: Self) extends AnyVal {
    
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
    def setAllocation_id(value: Id): Self = this.set("allocation_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: String): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelocating_node(value: js.Any): Self = this.set("relocating_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare(value: Double): Self = this.set("share", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
