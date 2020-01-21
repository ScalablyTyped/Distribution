package typings.gitlab

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.servicesMod.UserCustomAttributes
import typings.gitlab.servicesMod.UserEmails
import typings.gitlab.servicesMod.UserGPGKeys
import typings.gitlab.servicesMod.UserImpersonationTokens
import typings.gitlab.servicesMod.UserKeys
import typings.gitlab.servicesMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var UserCustomAttributes: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typings.gitlab.servicesMod.UserCustomAttributes
  ]
  var UserEmails: Instantiable0[typings.gitlab.servicesMod.UserEmails]
  var UserGPGKeys: Instantiable0[typings.gitlab.servicesMod.UserGPGKeys]
  var UserImpersonationTokens: Instantiable0[typings.gitlab.servicesMod.UserImpersonationTokens]
  var UserKeys: Instantiable0[typings.gitlab.servicesMod.UserKeys]
  var Users: Instantiable0[typings.gitlab.servicesMod.Users]
}

object AnonOptions {
  @scala.inline
  def apply(
    UserCustomAttributes: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], UserCustomAttributes],
    UserEmails: Instantiable0[UserEmails],
    UserGPGKeys: Instantiable0[UserGPGKeys],
    UserImpersonationTokens: Instantiable0[UserImpersonationTokens],
    UserKeys: Instantiable0[UserKeys],
    Users: Instantiable0[Users]
  ): AnonOptions = {
    val __obj = js.Dynamic.literal(UserCustomAttributes = UserCustomAttributes.asInstanceOf[js.Any], UserEmails = UserEmails.asInstanceOf[js.Any], UserGPGKeys = UserGPGKeys.asInstanceOf[js.Any], UserImpersonationTokens = UserImpersonationTokens.asInstanceOf[js.Any], UserKeys = UserKeys.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOptions]
  }
}

