package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Ids
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserProfilesResource extends js.Object {
  /** Gets one account user profile by ID. */
  def get(request: Fields): Request[AccountUserProfile]
  /** Inserts a new account user profile. */
  def insert(request: Key): Request[AccountUserProfile]
  /** Retrieves a list of account user profiles, possibly filtered. This method supports paging. */
  def list(request: Ids): Request[AccountUserProfilesListResponse]
  /** Updates an existing account user profile. This method supports patch semantics. */
  def patch(request: Fields): Request[AccountUserProfile]
  /** Updates an existing account user profile. */
  def update(request: Key): Request[AccountUserProfile]
}

object AccountUserProfilesResource {
  @scala.inline
  def apply(
    get: Fields => Request[AccountUserProfile],
    insert: Key => Request[AccountUserProfile],
    list: Ids => Request[AccountUserProfilesListResponse],
    patch: Fields => Request[AccountUserProfile],
    update: Key => Request[AccountUserProfile]
  ): AccountUserProfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccountUserProfilesResource]
  }
}

