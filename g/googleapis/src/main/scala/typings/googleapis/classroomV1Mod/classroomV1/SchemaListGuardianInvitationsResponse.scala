package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing guardian invitations.
  */
@js.native
trait SchemaListGuardianInvitationsResponse extends js.Object {
  /**
    * Guardian invitations that matched the list request.
    */
  var guardianInvitations: js.UndefOr[js.Array[SchemaGuardianInvitation]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListGuardianInvitationsResponse {
  @scala.inline
  def apply(guardianInvitations: js.Array[SchemaGuardianInvitation] = null, nextPageToken: String = null): SchemaListGuardianInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (guardianInvitations != null) __obj.updateDynamic("guardianInvitations")(guardianInvitations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListGuardianInvitationsResponse]
  }
}

