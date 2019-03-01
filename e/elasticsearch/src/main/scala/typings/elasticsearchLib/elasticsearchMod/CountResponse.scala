package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountResponse extends js.Object {
  var _shards: ShardsResponse
  var count: scala.Double
}

object CountResponse {
  @scala.inline
  def apply(_shards: ShardsResponse, count: scala.Double): CountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_shards")(_shards)
    __obj.updateDynamic("count")(count)
    __obj.asInstanceOf[CountResponse]
  }
}

