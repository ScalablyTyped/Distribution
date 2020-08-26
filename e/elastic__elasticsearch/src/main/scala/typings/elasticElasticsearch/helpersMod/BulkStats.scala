package typings.elasticElasticsearch.helpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkStats extends js.Object {
  var aborted: Boolean = js.native
  var bytes: Double = js.native
  var failed: Double = js.native
  var retry: Double = js.native
  var successful: Double = js.native
  var time: Double = js.native
  var total: Double = js.native
}

object BulkStats {
  @scala.inline
  def apply(
    aborted: Boolean,
    bytes: Double,
    failed: Double,
    retry: Double,
    successful: Double,
    time: Double,
    total: Double
  ): BulkStats = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkStats]
  }
  @scala.inline
  implicit class BulkStatsOps[Self <: BulkStats] (val x: Self) extends AnyVal {
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
    def setAborted(value: Boolean): Self = this.set("aborted", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytes(value: Double): Self = this.set("bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetry(value: Double): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessful(value: Double): Self = this.set("successful", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

