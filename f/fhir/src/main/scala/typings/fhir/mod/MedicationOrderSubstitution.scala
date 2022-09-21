package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationOrderSubstitution
  extends StObject
     with BackboneElement {
  
  /**
    * Indicates the reason for the substitution, or why substitution must or must not be performed.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A code signifying whether a different drug should be dispensed from what was prescribed.
    */
  var `type`: CodeableConcept
}
object MedicationOrderSubstitution {
  
  inline def apply(`type`: CodeableConcept): MedicationOrderSubstitution = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationOrderSubstitution]
  }
  
  extension [Self <: MedicationOrderSubstitution](x: Self) {
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
