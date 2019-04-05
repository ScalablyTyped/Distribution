package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGuardianInvitationsResponse extends js.Object {
  var guardianInvitations: js.UndefOr[js.Array[GuardianInvitation]] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListGuardianInvitationsResponse {
  @scala.inline
  def apply(guardianInvitations: js.Array[GuardianInvitation] = null, nextPageToken: java.lang.String = null): ListGuardianInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (guardianInvitations != null) __obj.updateDynamic("guardianInvitations")(guardianInvitations)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListGuardianInvitationsResponse]
  }
}

