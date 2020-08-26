package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConferenceRequest extends js.Object {
  var conferenceSolutionKey: js.UndefOr[ConferenceSolutionKey] = js.native
  var requestId: js.UndefOr[String] = js.native
  var status: js.UndefOr[ConferenceRequestStatus] = js.native
}

object CreateConferenceRequest {
  @scala.inline
  def apply(): CreateConferenceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConferenceRequest]
  }
  @scala.inline
  implicit class CreateConferenceRequestOps[Self <: CreateConferenceRequest] (val x: Self) extends AnyVal {
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
    def setConferenceSolutionKey(value: ConferenceSolutionKey): Self = this.set("conferenceSolutionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConferenceSolutionKey: Self = this.set("conferenceSolutionKey", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    @scala.inline
    def setStatus(value: ConferenceRequestStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

