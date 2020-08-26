package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.KeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfilesResource extends js.Object {
  /** Gets one user profile by ID. */
  def get(request: Key): Request[UserProfile] = js.native
  /** Retrieves list of user profiles for a user. */
  def list(request: KeyOauthtoken): Request[UserProfileList] = js.native
}

object UserProfilesResource {
  @scala.inline
  def apply(get: Key => Request[UserProfile], list: KeyOauthtoken => Request[UserProfileList]): UserProfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UserProfilesResource]
  }
  @scala.inline
  implicit class UserProfilesResourceOps[Self <: UserProfilesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: Key => Request[UserProfile]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: KeyOauthtoken => Request[UserProfileList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

