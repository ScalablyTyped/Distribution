package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessToken
  extends expoLib.expoMod.GoogleNs.LogInResult {
  var accessToken: java.lang.String
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  var serverAuthCode: js.UndefOr[java.lang.String] = js.undefined
  var `type`: expoLib.expoLibStrings.success
  var user: Anon_Email
}

object Anon_AccessToken {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    `type`: expoLib.expoLibStrings.success,
    user: Anon_Email,
    idToken: java.lang.String = null,
    refreshToken: java.lang.String = null,
    serverAuthCode: java.lang.String = null
  ): Anon_AccessToken = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.updateDynamic("user")(user)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (serverAuthCode != null) __obj.updateDynamic("serverAuthCode")(serverAuthCode)
    __obj.asInstanceOf[Anon_AccessToken]
  }
}

