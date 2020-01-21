package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGuardianInvitationsResponse extends js.Object {
  /** Guardian invitations that matched the list request. */
  var guardianInvitations: js.UndefOr[js.Array[GuardianInvitation]] = js.undefined
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListGuardianInvitationsResponse {
  @scala.inline
  def apply(guardianInvitations: js.Array[GuardianInvitation] = null, nextPageToken: String = null): ListGuardianInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (guardianInvitations != null) __obj.updateDynamic("guardianInvitations")(guardianInvitations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGuardianInvitationsResponse]
  }
}

