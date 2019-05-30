package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var UserCustomAttributes: org.scalablytyped.runtime.Instantiable1[/* options */ BaseServiceOptions, gitlabLib.distServicesMod.UserCustomAttributes]
  var UserEmails: org.scalablytyped.runtime.Instantiable0[gitlabLib.distServicesMod.UserEmails]
  var UserGPGKeys: org.scalablytyped.runtime.Instantiable0[gitlabLib.distServicesMod.UserGPGKeys]
  var UserImpersonationTokens: org.scalablytyped.runtime.Instantiable0[gitlabLib.distServicesMod.UserImpersonationTokens]
  var UserKeys: org.scalablytyped.runtime.Instantiable0[gitlabLib.distServicesMod.UserKeys]
  var Users: org.scalablytyped.runtime.Instantiable0[gitlabLib.distServicesMod.Users]
}

object Anon_Options {
  @scala.inline
  def apply(
    UserCustomAttributes: org.scalablytyped.runtime.Instantiable1[/* options */ BaseServiceOptions, gitlabLib.distServicesMod.UserCustomAttributes],
    UserEmails: org.scalablytyped.runtime.Instantiable0[gitlabLib.distServicesMod.UserEmails],
    UserGPGKeys: org.scalablytyped.runtime.Instantiable0[gitlabLib.distServicesMod.UserGPGKeys],
    UserImpersonationTokens: org.scalablytyped.runtime.Instantiable0[gitlabLib.distServicesMod.UserImpersonationTokens],
    UserKeys: org.scalablytyped.runtime.Instantiable0[gitlabLib.distServicesMod.UserKeys],
    Users: org.scalablytyped.runtime.Instantiable0[gitlabLib.distServicesMod.Users]
  ): Anon_Options = {
    val __obj = js.Dynamic.literal(UserCustomAttributes = UserCustomAttributes, UserEmails = UserEmails, UserGPGKeys = UserGPGKeys, UserImpersonationTokens = UserImpersonationTokens, UserKeys = UserKeys, Users = Users)
  
    __obj.asInstanceOf[Anon_Options]
  }
}

