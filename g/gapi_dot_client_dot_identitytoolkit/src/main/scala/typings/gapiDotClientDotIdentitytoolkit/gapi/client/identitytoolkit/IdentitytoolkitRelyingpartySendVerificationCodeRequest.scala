package typings.gapiDotClientDotIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySendVerificationCodeRequest extends js.Object {
  /** Receipt of successful app token validation with APNS. */
  var iosReceipt: js.UndefOr[String] = js.undefined
  /** Secret delivered to iOS app via APNS. */
  var iosSecret: js.UndefOr[String] = js.undefined
  /** The phone number to send the verification code to in E.164 format. */
  var phoneNumber: js.UndefOr[String] = js.undefined
  /** Recaptcha solution. */
  var recaptchaToken: js.UndefOr[String] = js.undefined
}

object IdentitytoolkitRelyingpartySendVerificationCodeRequest {
  @scala.inline
  def apply(
    iosReceipt: String = null,
    iosSecret: String = null,
    phoneNumber: String = null,
    recaptchaToken: String = null
  ): IdentitytoolkitRelyingpartySendVerificationCodeRequest = {
    val __obj = js.Dynamic.literal()
    if (iosReceipt != null) __obj.updateDynamic("iosReceipt")(iosReceipt.asInstanceOf[js.Any])
    if (iosSecret != null) __obj.updateDynamic("iosSecret")(iosSecret.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (recaptchaToken != null) __obj.updateDynamic("recaptchaToken")(recaptchaToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySendVerificationCodeRequest]
  }
}

