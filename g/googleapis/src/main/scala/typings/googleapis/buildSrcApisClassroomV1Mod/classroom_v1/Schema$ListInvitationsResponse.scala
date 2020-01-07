package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing invitations.
  */
@js.native
trait Schema$ListInvitationsResponse extends js.Object {
  /**
    * Invitations that match the list request.
    */
  var invitations: js.UndefOr[js.Array[Schema$Invitation]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListInvitationsResponse {
  @scala.inline
  def apply(invitations: js.Array[Schema$Invitation] = null, nextPageToken: String = null): Schema$ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (invitations != null) __obj.updateDynamic("invitations")(invitations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListInvitationsResponse]
  }
}

