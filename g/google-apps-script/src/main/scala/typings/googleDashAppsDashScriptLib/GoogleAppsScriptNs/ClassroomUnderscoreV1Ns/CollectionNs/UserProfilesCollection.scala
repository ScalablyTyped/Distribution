package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesCollection extends js.Object {
  var GuardianInvitations: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.CollectionNs.UserProfilesNs.GuardianInvitationsCollection
  ] = js.undefined
  var Guardians: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.CollectionNs.UserProfilesNs.GuardiansCollection
  ] = js.undefined
  // Returns a user profile.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access
  // this user profile, if no profile exists with the requested ID, or for
  // access errors.
  def get(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.UserProfile
}

object UserProfilesCollection {
  @scala.inline
  def apply(
    get: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.UserProfile,
    GuardianInvitations: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.CollectionNs.UserProfilesNs.GuardianInvitationsCollection = null,
    Guardians: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.CollectionNs.UserProfilesNs.GuardiansCollection = null
  ): UserProfilesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    if (GuardianInvitations != null) __obj.updateDynamic("GuardianInvitations")(GuardianInvitations)
    if (Guardians != null) __obj.updateDynamic("Guardians")(Guardians)
    __obj.asInstanceOf[UserProfilesCollection]
  }
}

