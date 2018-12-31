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

