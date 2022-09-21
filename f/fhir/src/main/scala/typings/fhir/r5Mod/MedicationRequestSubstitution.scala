package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationRequestSubstitution
  extends StObject
     with BackboneElement {
  
  var _allowedBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * This element is labeled as a modifier because whether substitution is allow or not, it cannot be ignored.
    */
  var allowedBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This element is labeled as a modifier because whether substitution is allow or not, it cannot be ignored.
    */
  var allowedCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates the reason for the substitution, or why substitution must or must not be performed.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicationRequestSubstitution {
  
  inline def apply(): MedicationRequestSubstitution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationRequestSubstitution]
  }
  
  extension [Self <: MedicationRequestSubstitution](x: Self) {
    
    inline def setAllowedBoolean(value: Boolean): Self = StObject.set(x, "allowedBoolean", value.asInstanceOf[js.Any])
    
    inline def setAllowedBooleanUndefined: Self = StObject.set(x, "allowedBoolean", js.undefined)
    
    inline def setAllowedCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "allowedCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setAllowedCodeableConceptUndefined: Self = StObject.set(x, "allowedCodeableConcept", js.undefined)
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def set_allowedBoolean(value: Element): Self = StObject.set(x, "_allowedBoolean", value.asInstanceOf[js.Any])
    
    inline def set_allowedBooleanUndefined: Self = StObject.set(x, "_allowedBoolean", js.undefined)
  }
}
