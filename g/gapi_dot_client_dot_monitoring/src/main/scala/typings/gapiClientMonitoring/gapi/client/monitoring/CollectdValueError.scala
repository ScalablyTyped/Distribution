package typings.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectdValueError extends js.Object {
  /** Records the error status for the value. */
  var error: js.UndefOr[Status] = js.native
  /** The zero-based index in CollectdPayload.values within the parent CreateCollectdTimeSeriesRequest.collectd_payloads. */
  var index: js.UndefOr[Double] = js.native
}

object CollectdValueError {
  @scala.inline
  def apply(): CollectdValueError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectdValueError]
  }
  @scala.inline
  implicit class CollectdValueErrorOps[Self <: CollectdValueError] (val x: Self) extends AnyVal {
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
    def setError(value: Status): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

