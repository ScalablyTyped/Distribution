package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UserCustomAttributesUserEmails extends js.Object {
  var UserCustomAttributes: gitlabLib.distLatestServicesMod.UserCustomAttributes
  var UserEmails: gitlabLib.distLatestServicesMod.UserEmails
  var UserGPGKeys: gitlabLib.distLatestServicesMod.UserGPGKeys
  var UserImpersonationTokens: gitlabLib.distLatestServicesMod.UserImpersonationTokens
  var UserKeys: gitlabLib.distLatestServicesMod.UserKeys
  var Users: gitlabLib.distLatestServicesMod.Users
}

object Anon_UserCustomAttributesUserEmails {
  @scala.inline
  def apply(
    UserCustomAttributes: gitlabLib.distLatestServicesMod.UserCustomAttributes,
    UserEmails: gitlabLib.distLatestServicesMod.UserEmails,
    UserGPGKeys: gitlabLib.distLatestServicesMod.UserGPGKeys,
    UserImpersonationTokens: gitlabLib.distLatestServicesMod.UserImpersonationTokens,
    UserKeys: gitlabLib.distLatestServicesMod.UserKeys,
    Users: gitlabLib.distLatestServicesMod.Users
  ): Anon_UserCustomAttributesUserEmails = {
    val __obj = js.Dynamic.literal(UserCustomAttributes = UserCustomAttributes, UserEmails = UserEmails, UserGPGKeys = UserGPGKeys, UserImpersonationTokens = UserImpersonationTokens, UserKeys = UserKeys, Users = Users)
  
    __obj.asInstanceOf[Anon_UserCustomAttributesUserEmails]
  }
}

