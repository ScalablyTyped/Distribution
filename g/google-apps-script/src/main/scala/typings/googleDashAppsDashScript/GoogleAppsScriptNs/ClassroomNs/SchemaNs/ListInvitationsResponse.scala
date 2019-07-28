package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInvitationsResponse extends js.Object {
  var invitations: js.UndefOr[js.Array[Invitation]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListInvitationsResponse {
  @scala.inline
  def apply(invitations: js.Array[Invitation] = null, nextPageToken: String = null): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (invitations != null) __obj.updateDynamic("invitations")(invitations)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListInvitationsResponse]
  }
}

