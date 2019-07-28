package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuardianInvitation extends js.Object {
  var creationTime: js.UndefOr[String] = js.undefined
  var invitationId: js.UndefOr[String] = js.undefined
  var invitedEmailAddress: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var studentId: js.UndefOr[String] = js.undefined
}

object GuardianInvitation {
  @scala.inline
  def apply(
    creationTime: String = null,
    invitationId: String = null,
    invitedEmailAddress: String = null,
    state: String = null,
    studentId: String = null
  ): GuardianInvitation = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (invitationId != null) __obj.updateDynamic("invitationId")(invitationId)
    if (invitedEmailAddress != null) __obj.updateDynamic("invitedEmailAddress")(invitedEmailAddress)
    if (state != null) __obj.updateDynamic("state")(state)
    if (studentId != null) __obj.updateDynamic("studentId")(studentId)
    __obj.asInstanceOf[GuardianInvitation]
  }
}

