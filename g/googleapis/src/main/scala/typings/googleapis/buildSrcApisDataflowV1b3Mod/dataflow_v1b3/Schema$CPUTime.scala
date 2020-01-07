package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Modeled after information exposed by /proc/stat.
  */
@js.native
trait Schema$CPUTime extends js.Object {
  /**
    * Average CPU utilization rate (% non-idle cpu / second) since previous
    * sample.
    */
  var rate: js.UndefOr[Double] = js.native
  /**
    * Timestamp of the measurement.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Total active CPU time across all cores (ie., non-idle) in milliseconds
    * since start-up.
    */
  var totalMs: js.UndefOr[String] = js.native
}

object Schema$CPUTime {
  @scala.inline
  def apply(rate: Int | Double = null, timestamp: String = null, totalMs: String = null): Schema$CPUTime = {
    val __obj = js.Dynamic.literal()
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (totalMs != null) __obj.updateDynamic("totalMs")(totalMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CPUTime]
  }
}

