package typings.gitlab

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesMod.UserCustomAttributes
import typings.gitlab.distServicesMod.UserEmails
import typings.gitlab.distServicesMod.UserGPGKeys
import typings.gitlab.distServicesMod.UserImpersonationTokens
import typings.gitlab.distServicesMod.UserKeys
import typings.gitlab.distServicesMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var UserCustomAttributes: Instantiable1[
    /* options */ BaseServiceOptions, 
    typings.gitlab.distServicesMod.UserCustomAttributes
  ]
  var UserEmails: Instantiable0[typings.gitlab.distServicesMod.UserEmails]
  var UserGPGKeys: Instantiable0[typings.gitlab.distServicesMod.UserGPGKeys]
  var UserImpersonationTokens: Instantiable0[typings.gitlab.distServicesMod.UserImpersonationTokens]
  var UserKeys: Instantiable0[typings.gitlab.distServicesMod.UserKeys]
  var Users: Instantiable0[typings.gitlab.distServicesMod.Users]
}

object Anon_Options {
  @scala.inline
  def apply(
    UserCustomAttributes: Instantiable1[/* options */ BaseServiceOptions, UserCustomAttributes],
    UserEmails: Instantiable0[UserEmails],
    UserGPGKeys: Instantiable0[UserGPGKeys],
    UserImpersonationTokens: Instantiable0[UserImpersonationTokens],
    UserKeys: Instantiable0[UserKeys],
    Users: Instantiable0[Users]
  ): Anon_Options = {
    val __obj = js.Dynamic.literal(UserCustomAttributes = UserCustomAttributes, UserEmails = UserEmails, UserGPGKeys = UserGPGKeys, UserImpersonationTokens = UserImpersonationTokens, UserKeys = UserKeys, Users = Users)
  
    __obj.asInstanceOf[Anon_Options]
  }
}

