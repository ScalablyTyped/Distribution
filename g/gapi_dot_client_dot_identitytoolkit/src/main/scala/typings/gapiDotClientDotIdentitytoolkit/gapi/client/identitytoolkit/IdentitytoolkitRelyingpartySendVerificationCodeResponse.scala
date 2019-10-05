package typings.gapiDotClientDotIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySendVerificationCodeResponse extends js.Object {
  /** Encrypted session information */
  var sessionInfo: js.UndefOr[String] = js.undefined
}

object IdentitytoolkitRelyingpartySendVerificationCodeResponse {
  @scala.inline
  def apply(sessionInfo: String = null): IdentitytoolkitRelyingpartySendVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (sessionInfo != null) __obj.updateDynamic("sessionInfo")(sessionInfo)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySendVerificationCodeResponse]
  }
}

