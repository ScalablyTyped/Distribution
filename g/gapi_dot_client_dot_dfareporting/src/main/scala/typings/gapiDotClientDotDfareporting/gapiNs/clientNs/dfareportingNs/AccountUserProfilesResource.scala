package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_ActiveAlt
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserProfilesResource extends js.Object {
  /** Gets one account user profile by ID. */
  def get(request: Anon_AltFields): Request[AccountUserProfile]
  /** Inserts a new account user profile. */
  def insert(request: Anon_AltFieldsKey): Request[AccountUserProfile]
  /** Retrieves a list of account user profiles, possibly filtered. This method supports paging. */
  def list(request: Anon_ActiveAlt): Request[AccountUserProfilesListResponse]
  /** Updates an existing account user profile. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[AccountUserProfile]
  /** Updates an existing account user profile. */
  def update(request: Anon_AltFieldsKey): Request[AccountUserProfile]
}

object AccountUserProfilesResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[AccountUserProfile],
    insert: Anon_AltFieldsKey => Request[AccountUserProfile],
    list: Anon_ActiveAlt => Request[AccountUserProfilesListResponse],
    patch: Anon_AltFields => Request[AccountUserProfile],
    update: Anon_AltFieldsKey => Request[AccountUserProfile]
  ): AccountUserProfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountUserProfilesResource]
  }
}

