package typings.elasticsearch.elasticsearchMod

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
    val __obj = js.Dynamic.literal(_shards = _shards, count = count)
  
    __obj.asInstanceOf[CountResponse]
  }
}

