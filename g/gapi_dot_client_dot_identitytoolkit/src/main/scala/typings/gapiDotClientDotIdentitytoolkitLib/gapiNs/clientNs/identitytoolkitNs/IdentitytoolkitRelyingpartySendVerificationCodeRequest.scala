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

