package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.UserProfile
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.UserProfileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesCollection extends js.Object {
  // Gets one user profile by ID.
  def get(profileId: String): UserProfile
  // Retrieves list of user profiles for a user.
  def list(): UserProfileList
}

object UserProfilesCollection {
  @scala.inline
  def apply(get: String => UserProfile, list: () => UserProfileList): UserProfilesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[UserProfilesCollection]
  }
}

