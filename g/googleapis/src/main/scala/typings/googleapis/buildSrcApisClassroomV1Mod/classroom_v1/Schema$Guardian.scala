package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Association between a student and a guardian of that student. The guardian
  * may receive information about the student&#39;s course work.
  */
@js.native
trait Schema$Guardian extends js.Object {
  /**
    * Identifier for the guardian.
    */
  var guardianId: js.UndefOr[String] = js.native
  /**
    * User profile for the guardian.
    */
  var guardianProfile: js.UndefOr[Schema$UserProfile] = js.native
  /**
    * The email address to which the initial guardian invitation was sent. This
    * field is only visible to domain administrators.
    */
  var invitedEmailAddress: js.UndefOr[String] = js.native
  /**
    * Identifier for the student to whom the guardian relationship applies.
    */
  var studentId: js.UndefOr[String] = js.native
}

object Schema$Guardian {
  @scala.inline
  def apply(
    guardianId: String = null,
    guardianProfile: Schema$UserProfile = null,
    invitedEmailAddress: String = null,
    studentId: String = null
  ): Schema$Guardian = {
    val __obj = js.Dynamic.literal()
    if (guardianId != null) __obj.updateDynamic("guardianId")(guardianId.asInstanceOf[js.Any])
    if (guardianProfile != null) __obj.updateDynamic("guardianProfile")(guardianProfile.asInstanceOf[js.Any])
    if (invitedEmailAddress != null) __obj.updateDynamic("invitedEmailAddress")(invitedEmailAddress.asInstanceOf[js.Any])
    if (studentId != null) __obj.updateDynamic("studentId")(studentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Guardian]
  }
}

