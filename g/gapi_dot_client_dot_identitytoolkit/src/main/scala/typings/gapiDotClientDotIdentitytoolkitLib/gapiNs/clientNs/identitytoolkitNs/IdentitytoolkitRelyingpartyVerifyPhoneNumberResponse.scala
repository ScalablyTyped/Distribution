package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse extends js.Object {
  var expiresIn: js.UndefOr[java.lang.String] = js.undefined
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  var isNewUser: js.UndefOr[scala.Boolean] = js.undefined
  var localId: js.UndefOr[java.lang.String] = js.undefined
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  var temporaryProof: js.UndefOr[java.lang.String] = js.undefined
  var temporaryProofExpiresIn: js.UndefOr[java.lang.String] = js.undefined
  var verificationProof: js.UndefOr[java.lang.String] = js.undefined
  var verificationProofExpiresIn: js.UndefOr[java.lang.String] = js.undefined
}

object IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse {
  @scala.inline
  def apply(
    expiresIn: java.lang.String = null,
    idToken: java.lang.String = null,
    isNewUser: js.UndefOr[scala.Boolean] = js.undefined,
    localId: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    refreshToken: java.lang.String = null,
    temporaryProof: java.lang.String = null,
    temporaryProofExpiresIn: java.lang.String = null,
    verificationProof: java.lang.String = null,
    verificationProofExpiresIn: java.lang.String = null
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

