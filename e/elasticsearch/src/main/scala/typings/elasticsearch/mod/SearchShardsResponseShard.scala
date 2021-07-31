package typings.elasticsearch.mod

import typings.elasticsearch.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchShardsResponseShard extends StObject {
  
  var allocation_id: Id
  
  var index: String
  
  var node: String
  
  var primary: Boolean
  
  var relocating_node: js.Any
  
  var share: Double
  
  var state: String
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
  implicit class SearchShardsResponseShardMutableBuilder[Self <: SearchShardsResponseShard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocation_id(value: Id): Self = StObject.set(x, "allocation_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelocating_node(value: js.Any): Self = StObject.set(x, "relocating_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare(value: Double): Self = StObject.set(x, "share", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
