package typings.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitJobRequest extends js.Object {
  /** Required. The job resource. */
  var job: js.UndefOr[Job] = js.native
}

object SubmitJobRequest {
  @scala.inline
  def apply(): SubmitJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitJobRequest]
  }
  @scala.inline
  implicit class SubmitJobRequestOps[Self <: SubmitJobRequest] (val x: Self) extends AnyVal {
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
    def setJob(value: Job): Self = this.set("job", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJob: Self = this.set("job", js.undefined)
  }
  
}

