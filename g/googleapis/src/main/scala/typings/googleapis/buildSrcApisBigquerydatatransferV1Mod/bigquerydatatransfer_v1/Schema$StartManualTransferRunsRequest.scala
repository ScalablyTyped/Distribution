package typings.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to start manual transfer runs.
  */
@js.native
trait Schema$StartManualTransferRunsRequest extends js.Object {
  /**
    * Specific run_time for a transfer run to be started. The
    * requested_run_time must not be in the future.
    */
  var requestedRunTime: js.UndefOr[String] = js.native
  /**
    * Time range for the transfer runs that should be started.
    */
  var requestedTimeRange: js.UndefOr[Schema$TimeRange] = js.native
}

object Schema$StartManualTransferRunsRequest {
  @scala.inline
  def apply(requestedRunTime: String = null, requestedTimeRange: Schema$TimeRange = null): Schema$StartManualTransferRunsRequest = {
    val __obj = js.Dynamic.literal()
    if (requestedRunTime != null) __obj.updateDynamic("requestedRunTime")(requestedRunTime.asInstanceOf[js.Any])
    if (requestedTimeRange != null) __obj.updateDynamic("requestedTimeRange")(requestedTimeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StartManualTransferRunsRequest]
  }
}

