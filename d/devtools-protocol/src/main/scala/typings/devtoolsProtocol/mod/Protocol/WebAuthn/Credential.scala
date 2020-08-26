package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credential extends js.Object {
  var credentialId: String = js.native
  var isResidentCredential: Boolean = js.native
  /**
    * The ECDSA P-256 private key in PKCS#8 format.
    */
  var privateKey: String = js.native
  /**
    * Relying Party ID the credential is scoped to. Must be set when adding a
    * credential.
    */
  var rpId: js.UndefOr[String] = js.native
  /**
    * Signature counter. This is incremented by one for each successful
    * assertion.
    * See https://w3c.github.io/webauthn/#signature-counter
    */
  var signCount: integer = js.native
  /**
    * An opaque byte sequence with a maximum size of 64 bytes mapping the
    * credential to a specific user.
    */
  var userHandle: js.UndefOr[String] = js.native
}

object Credential {
  @scala.inline
  def apply(credentialId: String, isResidentCredential: Boolean, privateKey: String, signCount: integer): Credential = {
    val __obj = js.Dynamic.literal(credentialId = credentialId.asInstanceOf[js.Any], isResidentCredential = isResidentCredential.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], signCount = signCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
  @scala.inline
  implicit class CredentialOps[Self <: Credential] (val x: Self) extends AnyVal {
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
    def setCredentialId(value: String): Self = this.set("credentialId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsResidentCredential(value: Boolean): Self = this.set("isResidentCredential", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignCount(value: integer): Self = this.set("signCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRpId(value: String): Self = this.set("rpId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRpId: Self = this.set("rpId", js.undefined)
    @scala.inline
    def setUserHandle(value: String): Self = this.set("userHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserHandle: Self = this.set("userHandle", js.undefined)
  }
  
}

