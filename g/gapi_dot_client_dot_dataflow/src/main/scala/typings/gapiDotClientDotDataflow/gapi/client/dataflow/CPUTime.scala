package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUTime extends js.Object {
  /**
    * Average CPU utilization rate (% non-idle cpu / second) since previous
    * sample.
    */
  var rate: js.UndefOr[Double] = js.undefined
  /** Timestamp of the measurement. */
  var timestamp: js.UndefOr[String] = js.undefined
  /**
    * Total active CPU time across all cores (ie., non-idle) in milliseconds
    * since start-up.
    */
  var totalMs: js.UndefOr[String] = js.undefined
}

object CPUTime {
  @scala.inline
  def apply(rate: Int | Double = null, timestamp: String = null, totalMs: String = null): CPUTime = {
    val __obj = js.Dynamic.literal()
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (totalMs != null) __obj.updateDynamic("totalMs")(totalMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUTime]
  }
}

