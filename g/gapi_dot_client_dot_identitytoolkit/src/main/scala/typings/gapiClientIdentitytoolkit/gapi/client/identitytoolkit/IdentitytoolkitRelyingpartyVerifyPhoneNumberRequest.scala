package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var idToken: js.UndefOr[String] = js.undefined
  var operation: js.UndefOr[String] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
  /** The session info previously returned by IdentityToolkit-SendVerificationCode. */
  var sessionInfo: js.UndefOr[String] = js.undefined
  var temporaryProof: js.UndefOr[String] = js.undefined
  var verificationProof: js.UndefOr[String] = js.undefined
}

object IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest {
  @scala.inline
  def apply(
    code: String = null,
    idToken: String = null,
    operation: String = null,
    phoneNumber: String = null,
    sessionInfo: String = null,
    temporaryProof: String = null,
    verificationProof: String = null
  ): IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (sessionInfo != null) __obj.updateDynamic("sessionInfo")(sessionInfo.asInstanceOf[js.Any])
    if (temporaryProof != null) __obj.updateDynamic("temporaryProof")(temporaryProof.asInstanceOf[js.Any])
    if (verificationProof != null) __obj.updateDynamic("verificationProof")(verificationProof.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest]
  }
}

