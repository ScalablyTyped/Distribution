package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest extends js.Object {
  var code: js.UndefOr[String] = js.native
  var idToken: js.UndefOr[String] = js.native
  var operation: js.UndefOr[String] = js.native
  var phoneNumber: js.UndefOr[String] = js.native
  /** The session info previously returned by IdentityToolkit-SendVerificationCode. */
  var sessionInfo: js.UndefOr[String] = js.native
  var temporaryProof: js.UndefOr[String] = js.native
  var verificationProof: js.UndefOr[String] = js.native
}

object IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest {
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest]
  }
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyVerifyPhoneNumberRequestOps[Self <: IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setSessionInfo(value: String): Self = this.set("sessionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionInfo: Self = this.set("sessionInfo", js.undefined)
    @scala.inline
    def setTemporaryProof(value: String): Self = this.set("temporaryProof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemporaryProof: Self = this.set("temporaryProof", js.undefined)
    @scala.inline
    def setVerificationProof(value: String): Self = this.set("verificationProof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerificationProof: Self = this.set("verificationProof", js.undefined)
  }
  
}

