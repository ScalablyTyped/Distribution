package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  var operation: js.UndefOr[java.lang.String] = js.undefined
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The session info previously returned by IdentityToolkit-SendVerificationCode. */
  var sessionInfo: js.UndefOr[java.lang.String] = js.undefined
  var temporaryProof: js.UndefOr[java.lang.String] = js.undefined
  var verificationProof: js.UndefOr[java.lang.String] = js.undefined
}

object IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    idToken: java.lang.String = null,
    operation: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    sessionInfo: java.lang.String = null,
    temporaryProof: java.lang.String = null,
    verificationProof: java.lang.String = null
  ): IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (sessionInfo != null) __obj.updateDynamic("sessionInfo")(sessionInfo)
    if (temporaryProof != null) __obj.updateDynamic("temporaryProof")(temporaryProof)
    if (verificationProof != null) __obj.updateDynamic("verificationProof")(verificationProof)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest]
  }
}

