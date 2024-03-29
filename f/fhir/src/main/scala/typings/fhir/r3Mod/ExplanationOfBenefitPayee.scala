package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitPayee
  extends StObject
     with BackboneElement {
  
  /**
    * Party to be reimbursed: Subscriber, provider, other.
    */
  var party: js.UndefOr[Reference] = js.undefined
  
  /**
    * organization | patient | practitioner | relatedperson.
    */
  var resourceType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Type of Party to be reimbursed: Subscriber, provider, other.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ExplanationOfBenefitPayee {
  
  inline def apply(): ExplanationOfBenefitPayee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitPayee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplanationOfBenefitPayee] (val x: Self) extends AnyVal {
    
    inline def setParty(value: Reference): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    inline def setResourceType(value: CodeableConcept): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
