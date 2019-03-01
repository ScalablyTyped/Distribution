package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUTime extends js.Object {
  /**
    * Average CPU utilization rate (% non-idle cpu / second) since previous
    * sample.
    */
  var rate: js.UndefOr[scala.Double] = js.undefined
  /** Timestamp of the measurement. */
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Total active CPU time across all cores (ie., non-idle) in milliseconds
    * since start-up.
    */
  var totalMs: js.UndefOr[java.lang.String] = js.undefined
}

object CPUTime {
  @scala.inline
  def apply(
    rate: scala.Int | scala.Double = null,
    timestamp: java.lang.String = null,
    totalMs: java.lang.String = null
  ): CPUTime = {
    val __obj = js.Dynamic.literal()
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (totalMs != null) __obj.updateDynamic("totalMs")(totalMs)
    __obj.asInstanceOf[CPUTime]
  }
}

