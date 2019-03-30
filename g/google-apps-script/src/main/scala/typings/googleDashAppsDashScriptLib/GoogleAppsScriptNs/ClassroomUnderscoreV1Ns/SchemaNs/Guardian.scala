package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guardian extends js.Object {
  var guardianId: js.UndefOr[java.lang.String] = js.undefined
  var guardianProfile: js.UndefOr[UserProfile] = js.undefined
  var invitedEmailAddress: js.UndefOr[java.lang.String] = js.undefined
  var studentId: js.UndefOr[java.lang.String] = js.undefined
}

object Guardian {
  @scala.inline
  def apply(
    guardianId: java.lang.String = null,
    guardianProfile: UserProfile = null,
    invitedEmailAddress: java.lang.String = null,
    studentId: java.lang.String = null
  ): Guardian = {
    val __obj = js.Dynamic.literal()
    if (guardianId != null) __obj.updateDynamic("guardianId")(guardianId)
    if (guardianProfile != null) __obj.updateDynamic("guardianProfile")(guardianProfile)
    if (invitedEmailAddress != null) __obj.updateDynamic("invitedEmailAddress")(invitedEmailAddress)
    if (studentId != null) __obj.updateDynamic("studentId")(studentId)
    __obj.asInstanceOf[Guardian]
  }
}

