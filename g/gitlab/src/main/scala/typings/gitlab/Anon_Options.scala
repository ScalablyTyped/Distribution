package typings.gitlab

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreServicesMod.UserCustomAttributes
import typings.gitlab.distSrcCoreServicesMod.UserEmails
import typings.gitlab.distSrcCoreServicesMod.UserGPGKeys
import typings.gitlab.distSrcCoreServicesMod.UserImpersonationTokens
import typings.gitlab.distSrcCoreServicesMod.UserKeys
import typings.gitlab.distSrcCoreServicesMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var UserCustomAttributes: Instantiable1[
    /* options */ BaseServiceOptions, 
    typings.gitlab.distSrcCoreServicesMod.UserCustomAttributes
  ]
  var UserEmails: Instantiable0[typings.gitlab.distSrcCoreServicesMod.UserEmails]
  var UserGPGKeys: Instantiable0[typings.gitlab.distSrcCoreServicesMod.UserGPGKeys]
  var UserImpersonationTokens: Instantiable0[typings.gitlab.distSrcCoreServicesMod.UserImpersonationTokens]
  var UserKeys: Instantiable0[typings.gitlab.distSrcCoreServicesMod.UserKeys]
  var Users: Instantiable0[typings.gitlab.distSrcCoreServicesMod.Users]
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

