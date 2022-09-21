package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalUseIssueInteractionInteractant
  extends StObject
     with BackboneElement {
  
  /**
    * The specific medication, food or laboratory test that interacts.
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The specific medication, food or laboratory test that interacts.
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
}
object ClinicalUseIssueInteractionInteractant {
  
  inline def apply(): ClinicalUseIssueInteractionInteractant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClinicalUseIssueInteractionInteractant]
  }
  
  extension [Self <: ClinicalUseIssueInteractionInteractant](x: Self) {
    
    inline def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    inline def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    inline def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
  }
}
