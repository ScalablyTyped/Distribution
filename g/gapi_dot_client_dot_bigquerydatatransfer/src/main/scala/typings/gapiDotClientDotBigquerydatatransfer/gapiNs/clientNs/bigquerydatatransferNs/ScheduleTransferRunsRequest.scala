package typings.gapiDotClientDotBigquerydatatransfer.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleTransferRunsRequest extends js.Object {
  /**
    * End time of the range of transfer runs. For example,
    * `"2017-05-30T00:00:00+00:00"`.
    */
  var endTime: js.UndefOr[String] = js.undefined
  /**
    * Start time of the range of transfer runs. For example,
    * `"2017-05-25T00:00:00+00:00"`.
    */
  var startTime: js.UndefOr[String] = js.undefined
}

object ScheduleTransferRunsRequest {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): ScheduleTransferRunsRequest = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[ScheduleTransferRunsRequest]
  }
}

