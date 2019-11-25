package typings.gitlab

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreServicesMod.UserCustomAttributes
import typings.gitlab.distTypesCoreServicesMod.UserEmails
import typings.gitlab.distTypesCoreServicesMod.UserGPGKeys
import typings.gitlab.distTypesCoreServicesMod.UserImpersonationTokens
import typings.gitlab.distTypesCoreServicesMod.UserKeys
import typings.gitlab.distTypesCoreServicesMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var UserCustomAttributes: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typings.gitlab.distTypesCoreServicesMod.UserCustomAttributes
  ]
  var UserEmails: Instantiable0[typings.gitlab.distTypesCoreServicesMod.UserEmails]
  var UserGPGKeys: Instantiable0[typings.gitlab.distTypesCoreServicesMod.UserGPGKeys]
  var UserImpersonationTokens: Instantiable0[typings.gitlab.distTypesCoreServicesMod.UserImpersonationTokens]
  var UserKeys: Instantiable0[typings.gitlab.distTypesCoreServicesMod.UserKeys]
  var Users: Instantiable0[typings.gitlab.distTypesCoreServicesMod.Users]
}

object Anon_Options {
  @scala.inline
  def apply(
    UserCustomAttributes: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], UserCustomAttributes],
    UserEmails: Instantiable0[UserEmails],
    UserGPGKeys: Instantiable0[UserGPGKeys],
    UserImpersonationTokens: Instantiable0[UserImpersonationTokens],
    UserKeys: Instantiable0[UserKeys],
    Users: Instantiable0[Users]
  ): Anon_Options = {
    val __obj = js.Dynamic.literal(UserCustomAttributes = UserCustomAttributes.asInstanceOf[js.Any], UserEmails = UserEmails.asInstanceOf[js.Any], UserGPGKeys = UserGPGKeys.asInstanceOf[js.Any], UserImpersonationTokens = UserImpersonationTokens.asInstanceOf[js.Any], UserKeys = UserKeys.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Options]
  }
}

