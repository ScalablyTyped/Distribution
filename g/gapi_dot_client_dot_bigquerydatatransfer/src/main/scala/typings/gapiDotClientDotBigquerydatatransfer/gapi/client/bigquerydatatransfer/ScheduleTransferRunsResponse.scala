package typings.gapiDotClientDotBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleTransferRunsResponse extends js.Object {
  /** The transfer runs that were scheduled. */
  var runs: js.UndefOr[js.Array[TransferRun]] = js.undefined
}

object ScheduleTransferRunsResponse {
  @scala.inline
  def apply(runs: js.Array[TransferRun] = null): ScheduleTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (runs != null) __obj.updateDynamic("runs")(runs)
    __obj.asInstanceOf[ScheduleTransferRunsResponse]
  }
}

