package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShardsResponse extends js.Object {
  var failed: Double = js.native
  var skipped: Double = js.native
  var successful: Double = js.native
  var total: Double = js.native
}

object ShardsResponse {
  @scala.inline
  def apply(failed: Double, skipped: Double, successful: Double, total: Double): ShardsResponse = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShardsResponse]
  }
  @scala.inline
  implicit class ShardsResponseOps[Self <: ShardsResponse] (val x: Self) extends AnyVal {
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
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipped(value: Double): Self = this.set("skipped", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessful(value: Double): Self = this.set("successful", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

