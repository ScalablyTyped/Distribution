package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuardianInvitation extends js.Object {
  /**
    * The time that this invitation was created.
    *
    * Read-only.
    */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Unique identifier for this invitation.
    *
    * Read-only.
    */
  var invitationId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Email address that the invitation was sent to.
    * This field is only visible to domain administrators.
    */
  var invitedEmailAddress: js.UndefOr[java.lang.String] = js.undefined
  /** The state that this invitation is in. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the student (in standard format) */
  var studentId: js.UndefOr[java.lang.String] = js.undefined
}

