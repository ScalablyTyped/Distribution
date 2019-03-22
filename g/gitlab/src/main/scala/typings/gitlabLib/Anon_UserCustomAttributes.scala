package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UserCustomAttributes extends js.Object {
  var UserCustomAttributes: gitlabLib.distEs5ServicesMod.UserCustomAttributes
  var UserEmails: gitlabLib.distEs5ServicesMod.UserEmails
  var UserGPGKeys: gitlabLib.distEs5ServicesMod.UserGPGKeys
  var UserImpersonationTokens: gitlabLib.distEs5ServicesMod.UserImpersonationTokens
  var UserKeys: gitlabLib.distEs5ServicesMod.UserKeys
  var Users: gitlabLib.distEs5ServicesMod.Users
}

object Anon_UserCustomAttributes {
  @scala.inline
  def apply(
    UserCustomAttributes: gitlabLib.distEs5ServicesMod.UserCustomAttributes,
    UserEmails: gitlabLib.distEs5ServicesMod.UserEmails,
    UserGPGKeys: gitlabLib.distEs5ServicesMod.UserGPGKeys,
    UserImpersonationTokens: gitlabLib.distEs5ServicesMod.UserImpersonationTokens,
    UserKeys: gitlabLib.distEs5ServicesMod.UserKeys,
    Users: gitlabLib.distEs5ServicesMod.Users
  ): Anon_UserCustomAttributes = {
    val __obj = js.Dynamic.literal(UserCustomAttributes = UserCustomAttributes, UserEmails = UserEmails, UserGPGKeys = UserGPGKeys, UserImpersonationTokens = UserImpersonationTokens, UserKeys = UserKeys, Users = Users)
  
    __obj.asInstanceOf[Anon_UserCustomAttributes]
  }
}

