package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.KeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesResource extends js.Object {
  /** Gets one user profile by ID. */
  def get(request: Key): Request[UserProfile]
  /** Retrieves list of user profiles for a user. */
  def list(request: KeyOauthtoken): Request[UserProfileList]
}

object UserProfilesResource {
  @scala.inline
  def apply(get: Key => Request[UserProfile], list: KeyOauthtoken => Request[UserProfileList]): UserProfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UserProfilesResource]
  }
}

