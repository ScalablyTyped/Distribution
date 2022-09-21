package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitPayee
  extends StObject
     with BackboneElement {
  
  /**
    * Not required if the payee is 'subscriber' or 'provider'.
    */
  var party: js.UndefOr[Reference] = js.undefined
  
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
  
  extension [Self <: ExplanationOfBenefitPayee](x: Self) {
    
    inline def setParty(value: Reference): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
