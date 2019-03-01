package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchShardsResponse extends js.Object {
  var nodes: js.Any
  var shards: js.Array[js.Array[SearchShardsResponseShard]]
}

object SearchShardsResponse {
  @scala.inline
  def apply(nodes: js.Any, shards: js.Array[js.Array[SearchShardsResponseShard]]): SearchShardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nodes")(nodes)
    __obj.updateDynamic("shards")(shards)
    __obj.asInstanceOf[SearchShardsResponse]
  }
}

