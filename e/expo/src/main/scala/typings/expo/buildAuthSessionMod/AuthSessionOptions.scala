package typings.expo.buildAuthSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSessionOptions extends js.Object {
  var authUrl: String
  var returnUrl: js.UndefOr[String] = js.undefined
}

object AuthSessionOptions {
  @scala.inline
  def apply(authUrl: String, returnUrl: String = null): AuthSessionOptions = {
    val __obj = js.Dynamic.literal(authUrl = authUrl.asInstanceOf[js.Any])
    if (returnUrl != null) __obj.updateDynamic("returnUrl")(returnUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSessionOptions]
  }
}

