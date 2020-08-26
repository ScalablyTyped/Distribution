package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure containing additional user information from a federated identity
  * provider.
  */
@js.native
trait AdditionalUserInfo extends js.Object {
  var isNewUser: Boolean = js.native
  var profile: js.Object | Null = js.native
  var providerId: String = js.native
  var username: js.UndefOr[String | Null] = js.native
}

object AdditionalUserInfo {
  @scala.inline
  def apply(isNewUser: Boolean, providerId: String): AdditionalUserInfo = {
    val __obj = js.Dynamic.literal(isNewUser = isNewUser.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalUserInfo]
  }
  @scala.inline
  implicit class AdditionalUserInfoOps[Self <: AdditionalUserInfo] (val x: Self) extends AnyVal {
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
    def setIsNewUser(value: Boolean): Self = this.set("isNewUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfile(value: js.Object): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfileNull: Self = this.set("profile", null)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    @scala.inline
    def setUsernameNull: Self = this.set("username", null)
  }
  
}

