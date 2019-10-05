package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.AccountUserProfile
import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.AccountUserProfilesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUserProfilesCollection extends js.Object {
  // Gets one account user profile by ID.
  def get(profileId: String, id: String): AccountUserProfile = js.native
  // Inserts a new account user profile.
  def insert(resource: AccountUserProfile, profileId: String): AccountUserProfile = js.native
  // Retrieves a list of account user profiles, possibly filtered. This method supports paging.
  def list(profileId: String): AccountUserProfilesListResponse = js.native
  // Retrieves a list of account user profiles, possibly filtered. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): AccountUserProfilesListResponse = js.native
  // Updates an existing account user profile. This method supports patch semantics.
  def patch(resource: AccountUserProfile, profileId: String, id: String): AccountUserProfile = js.native
  // Updates an existing account user profile.
  def update(resource: AccountUserProfile, profileId: String): AccountUserProfile = js.native
}

