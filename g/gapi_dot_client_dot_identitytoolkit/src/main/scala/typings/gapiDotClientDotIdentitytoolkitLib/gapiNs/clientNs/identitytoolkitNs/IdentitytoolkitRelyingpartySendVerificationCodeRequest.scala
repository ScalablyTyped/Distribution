package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySendVerificationCodeRequest extends js.Object {
  /** Receipt of successful app token validation with APNS. */
  var iosReceipt: js.UndefOr[java.lang.String] = js.undefined
  /** Secret delivered to iOS app via APNS. */
  var iosSecret: js.UndefOr[java.lang.String] = js.undefined
  /** The phone number to send the verification code to in E.164 format. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** Recaptcha solution. */
  var recaptchaToken: js.UndefOr[java.lang.String] = js.undefined
}

object IdentitytoolkitRelyingpartySendVerificationCodeRequest {
  @scala.inline
  def apply(
    iosReceipt: java.lang.String = null,
    iosSecret: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    recaptchaToken: java.lang.String = null
  ): IdentitytoolkitRelyingpartySendVerificationCodeRequest = {
    val __obj = js.Dynamic.literal()
    if (iosReceipt != null) __obj.updateDynamic("iosReceipt")(iosReceipt)
    if (iosSecret != null) __obj.updateDynamic("iosSecret")(iosSecret)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (recaptchaToken != null) __obj.updateDynamic("recaptchaToken")(recaptchaToken)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySendVerificationCodeRequest]
  }
}

