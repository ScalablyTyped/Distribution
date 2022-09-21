package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentVerification
  extends StObject
     with BackboneElement {
  
  var _verificationDate: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _verified: js.UndefOr[Element] = js.undefined
  
  /**
    * Allows for history of verification/validation.
    */
  var verificationDate: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This allows the verification element to hold multiple use cases including RelatedPerson verification of the Grantee decision and periodic re-validation of the consent.
    */
  var verificationType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Has the instruction been verified.
    */
  var verified: Boolean
  
  /**
    * The person who conducted the verification/validation of the Grantee decision.
    */
  var verifiedBy: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who verified the instruction (Patient, Relative or other Authorized Person).
    */
  var verifiedWith: js.UndefOr[Reference] = js.undefined
}
object ConsentVerification {
  
  inline def apply(verified: Boolean): ConsentVerification = {
    val __obj = js.Dynamic.literal(verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentVerification]
  }
  
  extension [Self <: ConsentVerification](x: Self) {
    
    inline def setVerificationDate(value: js.Array[String]): Self = StObject.set(x, "verificationDate", value.asInstanceOf[js.Any])
    
    inline def setVerificationDateUndefined: Self = StObject.set(x, "verificationDate", js.undefined)
    
    inline def setVerificationDateVarargs(value: String*): Self = StObject.set(x, "verificationDate", js.Array(value*))
    
    inline def setVerificationType(value: CodeableConcept): Self = StObject.set(x, "verificationType", value.asInstanceOf[js.Any])
    
    inline def setVerificationTypeUndefined: Self = StObject.set(x, "verificationType", js.undefined)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    inline def setVerifiedBy(value: Reference): Self = StObject.set(x, "verifiedBy", value.asInstanceOf[js.Any])
    
    inline def setVerifiedByUndefined: Self = StObject.set(x, "verifiedBy", js.undefined)
    
    inline def setVerifiedWith(value: Reference): Self = StObject.set(x, "verifiedWith", value.asInstanceOf[js.Any])
    
    inline def setVerifiedWithUndefined: Self = StObject.set(x, "verifiedWith", js.undefined)
    
    inline def set_verificationDate(value: js.Array[Element]): Self = StObject.set(x, "_verificationDate", value.asInstanceOf[js.Any])
    
    inline def set_verificationDateUndefined: Self = StObject.set(x, "_verificationDate", js.undefined)
    
    inline def set_verificationDateVarargs(value: Element*): Self = StObject.set(x, "_verificationDate", js.Array(value*))
    
    inline def set_verified(value: Element): Self = StObject.set(x, "_verified", value.asInstanceOf[js.Any])
    
    inline def set_verifiedUndefined: Self = StObject.set(x, "_verified", js.undefined)
  }
}
