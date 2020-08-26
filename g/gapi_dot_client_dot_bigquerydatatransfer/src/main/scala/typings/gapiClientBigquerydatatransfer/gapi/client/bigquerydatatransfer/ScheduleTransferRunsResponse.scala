package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleTransferRunsResponse extends js.Object {
  /** The transfer runs that were scheduled. */
  var runs: js.UndefOr[js.Array[TransferRun]] = js.native
}

object ScheduleTransferRunsResponse {
  @scala.inline
  def apply(): ScheduleTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleTransferRunsResponse]
  }
  @scala.inline
  implicit class ScheduleTransferRunsResponseOps[Self <: ScheduleTransferRunsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRunsVarargs(value: TransferRun*): Self = this.set("runs", js.Array(value :_*))
    @scala.inline
    def setRuns(value: js.Array[TransferRun]): Self = this.set("runs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuns: Self = this.set("runs", js.undefined)
  }
  
}

