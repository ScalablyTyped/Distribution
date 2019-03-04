package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchShardsResponseShard extends js.Object {
  var allocation_id: elasticsearchLib.Anon_Id
  var index: java.lang.String
  var node: java.lang.String
  var primary: scala.Boolean
  var relocating_node: js.Any
  var share: scala.Double
  var state: java.lang.String
}

object SearchShardsResponseShard {
  @scala.inline
  def apply(
    allocation_id: elasticsearchLib.Anon_Id,
    index: java.lang.String,
    node: java.lang.String,
    primary: scala.Boolean,
    relocating_node: js.Any,
    share: scala.Double,
    state: java.lang.String
  ): SearchShardsResponseShard = {
    val __obj = js.Dynamic.literal(allocation_id = allocation_id, index = index, node = node, primary = primary, relocating_node = relocating_node, share = share, state = state)
  
    __obj.asInstanceOf[SearchShardsResponseShard]
  }
}

