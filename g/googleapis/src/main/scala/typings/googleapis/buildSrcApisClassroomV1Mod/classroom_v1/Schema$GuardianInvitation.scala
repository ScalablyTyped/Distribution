package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An invitation to become the guardian of a specified user, sent to a
  * specified email address.
  */
@js.native
trait Schema$GuardianInvitation extends js.Object {
  /**
    * The time that this invitation was created.  Read-only.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * Unique identifier for this invitation.  Read-only.
    */
  var invitationId: js.UndefOr[String] = js.native
  /**
    * Email address that the invitation was sent to. This field is only visible
    * to domain administrators.
    */
  var invitedEmailAddress: js.UndefOr[String] = js.native
  /**
    * The state that this invitation is in.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * ID of the student (in standard format)
    */
  var studentId: js.UndefOr[String] = js.native
}

object Schema$GuardianInvitation {
  @scala.inline
  def apply(
    creationTime: String = null,
    invitationId: String = null,
    invitedEmailAddress: String = null,
    state: String = null,
    studentId: String = null
  ): Schema$GuardianInvitation = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (invitationId != null) __obj.updateDynamic("invitationId")(invitationId.asInstanceOf[js.Any])
    if (invitedEmailAddress != null) __obj.updateDynamic("invitedEmailAddress")(invitedEmailAddress.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (studentId != null) __obj.updateDynamic("studentId")(studentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GuardianInvitation]
  }
}

