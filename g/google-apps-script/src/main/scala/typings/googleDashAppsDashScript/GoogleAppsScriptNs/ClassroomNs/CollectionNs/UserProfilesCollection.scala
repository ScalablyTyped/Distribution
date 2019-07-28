package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.CollectionNs.UserProfilesNs.GuardianInvitationsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.CollectionNs.UserProfilesNs.GuardiansCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs.UserProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesCollection extends js.Object {
  var GuardianInvitations: js.UndefOr[GuardianInvitationsCollection] = js.undefined
  var Guardians: js.UndefOr[GuardiansCollection] = js.undefined
  // Returns a user profile.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access
  // this user profile, if no profile exists with the requested ID, or for
  // access errors.
  def get(userId: String): UserProfile
}

object UserProfilesCollection {
  @scala.inline
  def apply(
    get: String => UserProfile,
    GuardianInvitations: GuardianInvitationsCollection = null,
    Guardians: GuardiansCollection = null
  ): UserProfilesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    if (GuardianInvitations != null) __obj.updateDynamic("GuardianInvitations")(GuardianInvitations)
    if (Guardians != null) __obj.updateDynamic("Guardians")(Guardians)
    __obj.asInstanceOf[UserProfilesCollection]
  }
}

