package typings.googleAppsScript.GoogleAppsScript.Classroom.Collection

import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfiles.GuardianInvitationsCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfiles.GuardiansCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.UserProfile
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
    if (GuardianInvitations != null) __obj.updateDynamic("GuardianInvitations")(GuardianInvitations.asInstanceOf[js.Any])
    if (Guardians != null) __obj.updateDynamic("Guardians")(Guardians.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfilesCollection]
  }
}

