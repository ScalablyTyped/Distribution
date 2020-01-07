package typings.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specification for a time range, this will request transfer runs with
  * run_time between start_time (inclusive) and end_time (exclusive).
  */
@js.native
trait Schema$TimeRange extends js.Object {
  /**
    * End time of the range of transfer runs. For example,
    * `&quot;2017-05-30T00:00:00+00:00&quot;`. The end_time must not be in the
    * future. Creates transfer runs where run_time is in the range betwen
    * start_time (inclusive) and end_time (exlusive).
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Start time of the range of transfer runs. For example,
    * `&quot;2017-05-25T00:00:00+00:00&quot;`. The start_time must be strictly
    * less than the end_time. Creates transfer runs where run_time is in the
    * range betwen start_time (inclusive) and end_time (exlusive).
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$TimeRange {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): Schema$TimeRange = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimeRange]
  }
}

