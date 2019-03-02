package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthCredential extends AuthCredential {
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  var secret: js.UndefOr[java.lang.String] = js.undefined
}

object OAuthCredential {
  @scala.inline
  def apply(
    providerId: java.lang.String,
    signInMethod: java.lang.String,
    accessToken: java.lang.String = null,
    idToken: java.lang.String = null,
    secret: java.lang.String = null
  ): OAuthCredential = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("providerId")(providerId)
    __obj.updateDynamic("signInMethod")(signInMethod)
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    __obj.asInstanceOf[OAuthCredential]
  }
}

