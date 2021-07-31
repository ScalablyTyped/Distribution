package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credential extends StObject {
  
  var credentialId: String
  
  var isResidentCredential: Boolean
  
  /**
    * The ECDSA P-256 private key in PKCS#8 format.
    */
  var privateKey: String
  
  /**
    * Relying Party ID the credential is scoped to. Must be set when adding a
    * credential.
    */
  var rpId: js.UndefOr[String] = js.undefined
  
  /**
    * Signature counter. This is incremented by one for each successful
    * assertion.
    * See https://w3c.github.io/webauthn/#signature-counter
    */
  var signCount: integer
  
  /**
    * An opaque byte sequence with a maximum size of 64 bytes mapping the
    * credential to a specific user.
    */
  var userHandle: js.UndefOr[String] = js.undefined
}
object Credential {
  
  @scala.inline
  def apply(credentialId: String, isResidentCredential: Boolean, privateKey: String, signCount: integer): Credential = {
    val __obj = js.Dynamic.literal(credentialId = credentialId.asInstanceOf[js.Any], isResidentCredential = isResidentCredential.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], signCount = signCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
  
  @scala.inline
  implicit class CredentialMutableBuilder[Self <: Credential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentialId(value: String): Self = StObject.set(x, "credentialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResidentCredential(value: Boolean): Self = StObject.set(x, "isResidentCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRpId(value: String): Self = StObject.set(x, "rpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRpIdUndefined: Self = StObject.set(x, "rpId", js.undefined)
    
    @scala.inline
    def setSignCount(value: integer): Self = StObject.set(x, "signCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserHandle(value: String): Self = StObject.set(x, "userHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserHandleUndefined: Self = StObject.set(x, "userHandle", js.undefined)
  }
}
