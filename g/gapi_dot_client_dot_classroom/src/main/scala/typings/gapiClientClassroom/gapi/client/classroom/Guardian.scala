package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guardian extends js.Object {
  /** Identifier for the guardian. */
  var guardianId: js.UndefOr[String] = js.undefined
  /** User profile for the guardian. */
  var guardianProfile: js.UndefOr[UserProfile] = js.undefined
  /**
    * The email address to which the initial guardian invitation was sent.
    * This field is only visible to domain administrators.
    */
  var invitedEmailAddress: js.UndefOr[String] = js.undefined
  /** Identifier for the student to whom the guardian relationship applies. */
  var studentId: js.UndefOr[String] = js.undefined
}

object Guardian {
  @scala.inline
  def apply(
    guardianId: String = null,
    guardianProfile: UserProfile = null,
    invitedEmailAddress: String = null,
    studentId: String = null
  ): Guardian = {
    val __obj = js.Dynamic.literal()
    if (guardianId != null) __obj.updateDynamic("guardianId")(guardianId.asInstanceOf[js.Any])
    if (guardianProfile != null) __obj.updateDynamic("guardianProfile")(guardianProfile.asInstanceOf[js.Any])
    if (invitedEmailAddress != null) __obj.updateDynamic("invitedEmailAddress")(invitedEmailAddress.asInstanceOf[js.Any])
    if (studentId != null) __obj.updateDynamic("studentId")(studentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guardian]
  }
}

