package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guardian extends js.Object {
  /** Identifier for the guardian. */
  var guardianId: js.UndefOr[java.lang.String] = js.undefined
  /** User profile for the guardian. */
  var guardianProfile: js.UndefOr[UserProfile] = js.undefined
  /**
    * The email address to which the initial guardian invitation was sent.
    * This field is only visible to domain administrators.
    */
  var invitedEmailAddress: js.UndefOr[java.lang.String] = js.undefined
  /** Identifier for the student to whom the guardian relationship applies. */
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

