package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInvitationsResponse extends js.Object {
  var invitations: js.UndefOr[js.Array[Invitation]] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListInvitationsResponse {
  @scala.inline
  def apply(invitations: js.Array[Invitation] = null, nextPageToken: java.lang.String = null): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (invitations != null) __obj.updateDynamic("invitations")(invitations)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListInvitationsResponse]
  }
}

