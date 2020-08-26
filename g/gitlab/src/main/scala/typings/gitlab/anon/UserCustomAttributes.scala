package typings.gitlab.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.servicesMod.UserGPGKeys
import typings.gitlab.servicesMod.UserImpersonationTokens
import typings.gitlab.servicesMod.UserKeys
import typings.gitlab.servicesMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserCustomAttributes extends js.Object {
  var UserCustomAttributes: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.UserCustomAttributes] = js.native
  var UserEmails: Instantiable0[typings.gitlab.servicesMod.UserEmails] = js.native
  var UserGPGKeys: Instantiable0[typings.gitlab.servicesMod.UserGPGKeys] = js.native
  var UserImpersonationTokens: Instantiable0[typings.gitlab.servicesMod.UserImpersonationTokens] = js.native
  var UserKeys: Instantiable0[typings.gitlab.servicesMod.UserKeys] = js.native
  var Users: Instantiable0[typings.gitlab.servicesMod.Users] = js.native
}

object UserCustomAttributes {
  @scala.inline
  def apply(
    UserCustomAttributes: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.UserCustomAttributes],
    UserEmails: Instantiable0[typings.gitlab.servicesMod.UserEmails],
    UserGPGKeys: Instantiable0[UserGPGKeys],
    UserImpersonationTokens: Instantiable0[UserImpersonationTokens],
    UserKeys: Instantiable0[UserKeys],
    Users: Instantiable0[Users]
  ): UserCustomAttributes = {
    val __obj = js.Dynamic.literal(UserCustomAttributes = UserCustomAttributes.asInstanceOf[js.Any], UserEmails = UserEmails.asInstanceOf[js.Any], UserGPGKeys = UserGPGKeys.asInstanceOf[js.Any], UserImpersonationTokens = UserImpersonationTokens.asInstanceOf[js.Any], UserKeys = UserKeys.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCustomAttributes]
  }
  @scala.inline
  implicit class UserCustomAttributesOps[Self <: UserCustomAttributes] (val x: Self) extends AnyVal {
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
    def setUserCustomAttributes(
      value: Instantiable1[/* options */ BaseServiceOptions, typings.gitlab.servicesMod.UserCustomAttributes]
    ): Self = this.set("UserCustomAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserEmails(value: Instantiable0[typings.gitlab.servicesMod.UserEmails]): Self = this.set("UserEmails", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserGPGKeys(value: Instantiable0[UserGPGKeys]): Self = this.set("UserGPGKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserImpersonationTokens(value: Instantiable0[UserImpersonationTokens]): Self = this.set("UserImpersonationTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserKeys(value: Instantiable0[UserKeys]): Self = this.set("UserKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsers(value: Instantiable0[Users]): Self = this.set("Users", value.asInstanceOf[js.Any])
  }
  
}

