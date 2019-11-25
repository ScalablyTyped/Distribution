package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchShardsResponseShard extends js.Object {
  var allocation_id: Anon_Id
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
    allocation_id: Anon_Id,
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
}

