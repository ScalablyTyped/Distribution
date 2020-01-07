package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for Identitytoolkit-VerifyPhoneNumber
  */
@js.native
trait Schema$IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse extends js.Object {
  var expiresIn: js.UndefOr[String] = js.native
  var idToken: js.UndefOr[String] = js.native
  var isNewUser: js.UndefOr[Boolean] = js.native
  var localId: js.UndefOr[String] = js.native
  var phoneNumber: js.UndefOr[String] = js.native
  var refreshToken: js.UndefOr[String] = js.native
  var temporaryProof: js.UndefOr[String] = js.native
  var temporaryProofExpiresIn: js.UndefOr[String] = js.native
  var verificationProof: js.UndefOr[String] = js.native
  var verificationProofExpiresIn: js.UndefOr[String] = js.native
}

object Schema$IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse {
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
  ): Schema$IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewUser)) __obj.updateDynamic("isNewUser")(isNewUser.asInstanceOf[js.Any])
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (temporaryProof != null) __obj.updateDynamic("temporaryProof")(temporaryProof.asInstanceOf[js.Any])
    if (temporaryProofExpiresIn != null) __obj.updateDynamic("temporaryProofExpiresIn")(temporaryProofExpiresIn.asInstanceOf[js.Any])
    if (verificationProof != null) __obj.updateDynamic("verificationProof")(verificationProof.asInstanceOf[js.Any])
    if (verificationProofExpiresIn != null) __obj.updateDynamic("verificationProofExpiresIn")(verificationProofExpiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  }
}

