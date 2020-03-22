package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonIds
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserProfilesResource extends js.Object {
  /** Gets one account user profile by ID. */
  def get(request: AnonFields): Request_[AccountUserProfile]
  /** Inserts a new account user profile. */
  def insert(request: AnonKey): Request_[AccountUserProfile]
  /** Retrieves a list of account user profiles, possibly filtered. This method supports paging. */
  def list(request: AnonIds): Request_[AccountUserProfilesListResponse]
  /** Updates an existing account user profile. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[AccountUserProfile]
  /** Updates an existing account user profile. */
  def update(request: AnonKey): Request_[AccountUserProfile]
}

object AccountUserProfilesResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[AccountUserProfile],
    insert: AnonKey => Request_[AccountUserProfile],
    list: AnonIds => Request_[AccountUserProfilesListResponse],
    patch: AnonFields => Request_[AccountUserProfile],
    update: AnonKey => Request_[AccountUserProfile]
  ): AccountUserProfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountUserProfilesResource]
  }
}

