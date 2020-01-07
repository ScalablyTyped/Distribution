package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for Identitytoolkit-SendVerificationCode
  */
@js.native
trait Schema$IdentitytoolkitRelyingpartySendVerificationCodeRequest extends js.Object {
  /**
    * Receipt of successful app token validation with APNS.
    */
  var iosReceipt: js.UndefOr[String] = js.native
  /**
    * Secret delivered to iOS app via APNS.
    */
  var iosSecret: js.UndefOr[String] = js.native
  /**
    * The phone number to send the verification code to in E.164 format.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * Recaptcha solution.
    */
  var recaptchaToken: js.UndefOr[String] = js.native
}

object Schema$IdentitytoolkitRelyingpartySendVerificationCodeRequest {
  @scala.inline
  def apply(
    iosReceipt: String = null,
    iosSecret: String = null,
    phoneNumber: String = null,
    recaptchaToken: String = null
  ): Schema$IdentitytoolkitRelyingpartySendVerificationCodeRequest = {
    val __obj = js.Dynamic.literal()
    if (iosReceipt != null) __obj.updateDynamic("iosReceipt")(iosReceipt.asInstanceOf[js.Any])
    if (iosSecret != null) __obj.updateDynamic("iosSecret")(iosSecret.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (recaptchaToken != null) __obj.updateDynamic("recaptchaToken")(recaptchaToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IdentitytoolkitRelyingpartySendVerificationCodeRequest]
  }
}

