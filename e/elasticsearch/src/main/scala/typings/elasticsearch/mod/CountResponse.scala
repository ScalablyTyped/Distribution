package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountResponse extends js.Object {
  var _shards: ShardsResponse = js.native
  var count: Double = js.native
}

object CountResponse {
  @scala.inline
  def apply(_shards: ShardsResponse, count: Double): CountResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountResponse]
  }
  @scala.inline
  implicit class CountResponseOps[Self <: CountResponse] (val x: Self) extends AnyVal {
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
    def set_shards(value: ShardsResponse): Self = this.set("_shards", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
  }
  
}

