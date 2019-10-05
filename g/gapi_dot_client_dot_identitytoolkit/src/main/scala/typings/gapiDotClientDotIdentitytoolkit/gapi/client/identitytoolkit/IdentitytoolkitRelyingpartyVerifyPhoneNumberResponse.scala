package typings.gapiDotClientDotIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse extends js.Object {
  var expiresIn: js.UndefOr[String] = js.undefined
  var idToken: js.UndefOr[String] = js.undefined
  var isNewUser: js.UndefOr[Boolean] = js.undefined
  var localId: js.UndefOr[String] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
  var refreshToken: js.UndefOr[String] = js.undefined
  var temporaryProof: js.UndefOr[String] = js.undefined
  var temporaryProofExpiresIn: js.UndefOr[String] = js.undefined
  var verificationProof: js.UndefOr[String] = js.undefined
  var verificationProofExpiresIn: js.UndefOr[String] = js.undefined
}

object IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse {
  @scala.inline
  def apply(
    expiresIn: String = null,
    idToken: String = null,
    isNewUser: js.UndefOr[Boolean] = js.undefined,
    localId: String = null,
    phoneNumber: String = null,
    refreshToken: String = null,
    temporaryProof: String = null,
    temporaryProofExpiresIn: String = null,
    verificationProof: String = null,
    verificationProofExpiresIn: String = null
  ): IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (!js.isUndefined(isNewUser)) __obj.updateDynamic("isNewUser")(isNewUser)
    if (localId != null) __obj.updateDynamic("localId")(localId)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (temporaryProof != null) __obj.updateDynamic("temporaryProof")(temporaryProof)
    if (temporaryProofExpiresIn != null) __obj.updateDynamic("temporaryProofExpiresIn")(temporaryProofExpiresIn)
    if (verificationProof != null) __obj.updateDynamic("verificationProof")(verificationProof)
    if (verificationProofExpiresIn != null) __obj.updateDynamic("verificationProofExpiresIn")(verificationProofExpiresIn)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  }
}

