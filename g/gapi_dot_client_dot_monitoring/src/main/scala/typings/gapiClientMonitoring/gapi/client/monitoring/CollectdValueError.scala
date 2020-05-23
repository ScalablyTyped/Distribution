package typings.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectdValueError extends js.Object {
  /** Records the error status for the value. */
  var error: js.UndefOr[Status] = js.undefined
  /** The zero-based index in CollectdPayload.values within the parent CreateCollectdTimeSeriesRequest.collectd_payloads. */
  var index: js.UndefOr[Double] = js.undefined
}

object CollectdValueError {
  @scala.inline
  def apply(error: Status = null, index: js.UndefOr[Double] = js.undefined): CollectdValueError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectdValueError]
  }
}

