package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to start manual transfer runs.
  */
@js.native
trait SchemaStartManualTransferRunsRequest extends js.Object {
  /**
    * Specific run_time for a transfer run to be started. The
    * requested_run_time must not be in the future.
    */
  var requestedRunTime: js.UndefOr[String] = js.native
  /**
    * Time range for the transfer runs that should be started.
    */
  var requestedTimeRange: js.UndefOr[SchemaTimeRange] = js.native
}

object SchemaStartManualTransferRunsRequest {
  @scala.inline
  def apply(requestedRunTime: String = null, requestedTimeRange: SchemaTimeRange = null): SchemaStartManualTransferRunsRequest = {
    val __obj = js.Dynamic.literal()
    if (requestedRunTime != null) __obj.updateDynamic("requestedRunTime")(requestedRunTime.asInstanceOf[js.Any])
    if (requestedTimeRange != null) __obj.updateDynamic("requestedTimeRange")(requestedTimeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStartManualTransferRunsRequest]
  }
}

