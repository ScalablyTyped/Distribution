package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationDispenseSubstitution
  extends StObject
     with BackboneElement {
  
  /**
    * Indicates the reason for the substitution of (or lack of substitution) from what was prescribed.
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The person or organization that has primary responsibility for the substitution.
    */
  var responsibleParty: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A code signifying whether a different drug was dispensed from what was prescribed.
    */
  var `type`: CodeableConcept
}
object MedicationDispenseSubstitution {
  
  inline def apply(`type`: CodeableConcept): MedicationDispenseSubstitution = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationDispenseSubstitution]
  }
  
  extension [Self <: MedicationDispenseSubstitution](x: Self) {
    
    inline def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setResponsibleParty(value: js.Array[Reference]): Self = StObject.set(x, "responsibleParty", value.asInstanceOf[js.Any])
    
    inline def setResponsiblePartyUndefined: Self = StObject.set(x, "responsibleParty", js.undefined)
    
    inline def setResponsiblePartyVarargs(value: Reference*): Self = StObject.set(x, "responsibleParty", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
