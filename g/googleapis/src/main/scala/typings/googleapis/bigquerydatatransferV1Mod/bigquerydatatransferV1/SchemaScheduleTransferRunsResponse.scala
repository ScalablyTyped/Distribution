package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to schedule transfer runs for a time range.
  */
@js.native
trait SchemaScheduleTransferRunsResponse extends js.Object {
  /**
    * The transfer runs that were scheduled.
    */
  var runs: js.UndefOr[js.Array[SchemaTransferRun]] = js.native
}

object SchemaScheduleTransferRunsResponse {
  @scala.inline
  def apply(runs: js.Array[SchemaTransferRun] = null): SchemaScheduleTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (runs != null) __obj.updateDynamic("runs")(runs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaScheduleTransferRunsResponse]
  }
}

