package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationResultValidator
  extends StObject
     with BackboneElement {
  
  var _identityCertificate: js.UndefOr[Element] = js.undefined
  
  /**
    * Signed assertion by the validator that they have validated the information.
    */
  var attestationSignature: js.UndefOr[Signature] = js.undefined
  
  /**
    * A digital identity certificate associated with the validator.
    */
  var identityCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * Reference to the organization validating information.
    */
  var organization: Reference
}
object VerificationResultValidator {
  
  inline def apply(organization: Reference): VerificationResultValidator = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationResultValidator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerificationResultValidator] (val x: Self) extends AnyVal {
    
    inline def setAttestationSignature(value: Signature): Self = StObject.set(x, "attestationSignature", value.asInstanceOf[js.Any])
    
    inline def setAttestationSignatureUndefined: Self = StObject.set(x, "attestationSignature", js.undefined)
    
    inline def setIdentityCertificate(value: String): Self = StObject.set(x, "identityCertificate", value.asInstanceOf[js.Any])
    
    inline def setIdentityCertificateUndefined: Self = StObject.set(x, "identityCertificate", js.undefined)
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def set_identityCertificate(value: Element): Self = StObject.set(x, "_identityCertificate", value.asInstanceOf[js.Any])
    
    inline def set_identityCertificateUndefined: Self = StObject.set(x, "_identityCertificate", js.undefined)
  }
}
