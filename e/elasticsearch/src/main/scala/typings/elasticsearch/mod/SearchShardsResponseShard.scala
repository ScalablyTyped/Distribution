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
  
  var relocating_node: Any
  
  var shard: Double
  
  var state: String
}
object SearchShardsResponseShard {
  
  inline def apply(
    allocation_id: Id,
    index: String,
    node: String,
    primary: Boolean,
    relocating_node: Any,
    shard: Double,
    state: String
  ): SearchShardsResponseShard = {
    val __obj = js.Dynamic.literal(allocation_id = allocation_id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], relocating_node = relocating_node.asInstanceOf[js.Any], shard = shard.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchShardsResponseShard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchShardsResponseShard] (val x: Self) extends AnyVal {
    
    inline def setAllocation_id(value: Id): Self = StObject.set(x, "allocation_id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setRelocating_node(value: Any): Self = StObject.set(x, "relocating_node", value.asInstanceOf[js.Any])
    
    inline def setShard(value: Double): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
