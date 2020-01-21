package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing invitations.
  */
@js.native
trait SchemaListInvitationsResponse extends js.Object {
  /**
    * Invitations that match the list request.
    */
  var invitations: js.UndefOr[js.Array[SchemaInvitation]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListInvitationsResponse {
  @scala.inline
  def apply(invitations: js.Array[SchemaInvitation] = null, nextPageToken: String = null): SchemaListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (invitations != null) __obj.updateDynamic("invitations")(invitations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListInvitationsResponse]
  }
}

