package typings.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to schedule transfer runs for a time range.
  */
@js.native
trait Schema$ScheduleTransferRunsResponse extends js.Object {
  /**
    * The transfer runs that were scheduled.
    */
  var runs: js.UndefOr[js.Array[Schema$TransferRun]] = js.native
}

object Schema$ScheduleTransferRunsResponse {
  @scala.inline
  def apply(runs: js.Array[Schema$TransferRun] = null): Schema$ScheduleTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (runs != null) __obj.updateDynamic("runs")(runs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ScheduleTransferRunsResponse]
  }
}

