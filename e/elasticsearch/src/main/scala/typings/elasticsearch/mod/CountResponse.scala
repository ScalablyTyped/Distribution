package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountResponse extends js.Object {
  var _shards: ShardsResponse
  var count: Double
}

object CountResponse {
  @scala.inline
  def apply(_shards: ShardsResponse, count: Double): CountResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountResponse]
  }
}

