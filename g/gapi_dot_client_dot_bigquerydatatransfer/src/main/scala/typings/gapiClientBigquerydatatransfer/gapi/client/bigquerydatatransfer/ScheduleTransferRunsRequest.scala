package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleTransferRunsRequest extends js.Object {
  /**
    * End time of the range of transfer runs. For example,
    * `"2017-05-30T00:00:00+00:00"`.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Start time of the range of transfer runs. For example,
    * `"2017-05-25T00:00:00+00:00"`.
    */
  var startTime: js.UndefOr[String] = js.native
}

object ScheduleTransferRunsRequest {
  @scala.inline
  def apply(): ScheduleTransferRunsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleTransferRunsRequest]
  }
  @scala.inline
  implicit class ScheduleTransferRunsRequestOps[Self <: ScheduleTransferRunsRequest] (val x: Self) extends AnyVal {
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

