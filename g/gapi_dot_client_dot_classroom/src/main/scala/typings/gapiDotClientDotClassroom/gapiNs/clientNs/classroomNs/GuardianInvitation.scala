package typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuardianInvitation extends js.Object {
  /**
    * The time that this invitation was created.
    *
    * Read-only.
    */
  var creationTime: js.UndefOr[String] = js.undefined
  /**
    * Unique identifier for this invitation.
    *
    * Read-only.
    */
  var invitationId: js.UndefOr[String] = js.undefined
  /**
    * Email address that the invitation was sent to.
    * This field is only visible to domain administrators.
    */
  var invitedEmailAddress: js.UndefOr[String] = js.undefined
  /** The state that this invitation is in. */
  var state: js.UndefOr[String] = js.undefined
  /** ID of the student (in standard format) */
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

