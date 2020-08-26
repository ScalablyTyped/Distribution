package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Guardian extends js.Object {
  var guardianId: js.UndefOr[String] = js.native
  var guardianProfile: js.UndefOr[UserProfile] = js.native
  var invitedEmailAddress: js.UndefOr[String] = js.native
  var studentId: js.UndefOr[String] = js.native
}

object Guardian {
  @scala.inline
  def apply(): Guardian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Guardian]
  }
  @scala.inline
  implicit class GuardianOps[Self <: Guardian] (val x: Self) extends AnyVal {
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
    def setGuardianId(value: String): Self = this.set("guardianId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuardianId: Self = this.set("guardianId", js.undefined)
    @scala.inline
    def setGuardianProfile(value: UserProfile): Self = this.set("guardianProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuardianProfile: Self = this.set("guardianProfile", js.undefined)
    @scala.inline
    def setInvitedEmailAddress(value: String): Self = this.set("invitedEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedEmailAddress: Self = this.set("invitedEmailAddress", js.undefined)
    @scala.inline
    def setStudentId(value: String): Self = this.set("studentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStudentId: Self = this.set("studentId", js.undefined)
  }
  
}

