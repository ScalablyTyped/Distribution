package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectdValueError extends js.Object {
  /** Records the error status for the value. */
  var error: js.UndefOr[Status] = js.undefined
  /** The zero-based index in CollectdPayload.values within the parent CreateCollectdTimeSeriesRequest.collectd_payloads. */
  var index: js.UndefOr[scala.Double] = js.undefined
}

object CollectdValueError {
  @scala.inline
  def apply(error: Status = null, index: scala.Int | scala.Double = null): CollectdValueError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectdValueError]
  }
}

