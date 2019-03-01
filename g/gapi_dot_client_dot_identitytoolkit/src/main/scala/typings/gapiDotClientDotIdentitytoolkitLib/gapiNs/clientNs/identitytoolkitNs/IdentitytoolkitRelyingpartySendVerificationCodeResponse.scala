package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySendVerificationCodeResponse extends js.Object {
  /** Encrypted session information */
  var sessionInfo: js.UndefOr[java.lang.String] = js.undefined
}

object IdentitytoolkitRelyingpartySendVerificationCodeResponse {
  @scala.inline
  def apply(sessionInfo: java.lang.String = null): IdentitytoolkitRelyingpartySendVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (sessionInfo != null) __obj.updateDynamic("sessionInfo")(sessionInfo)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySendVerificationCodeResponse]
  }
}

