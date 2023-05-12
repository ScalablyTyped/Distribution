package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitRelated
  extends StObject
     with BackboneElement {
  
  /**
    * Reference to a related claim.
    */
  var claim: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example, Property/Casualty insurer claim number or Workers Compensation case number.
    */
  var reference: js.UndefOr[Identifier] = js.undefined
  
  /**
    * For example, prior claim or umbrella.
    */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
}
object ExplanationOfBenefitRelated {
  
  inline def apply(): ExplanationOfBenefitRelated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitRelated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplanationOfBenefitRelated] (val x: Self) extends AnyVal {
    
    inline def setClaim(value: Reference): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
    
    inline def setClaimUndefined: Self = StObject.set(x, "claim", js.undefined)
    
    inline def setReference(value: Identifier): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
  }
}
