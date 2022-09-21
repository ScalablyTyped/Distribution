package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationDispenseSubstitution
  extends StObject
     with BackboneElement {
  
  var _wasSubstituted: js.UndefOr[Element] = js.undefined
  
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
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * True if the dispenser dispensed a different drug or product from what was prescribed.
    */
  var wasSubstituted: Boolean
}
object MedicationDispenseSubstitution {
  
  inline def apply(wasSubstituted: Boolean): MedicationDispenseSubstitution = {
    val __obj = js.Dynamic.literal(wasSubstituted = wasSubstituted.asInstanceOf[js.Any])
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
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWasSubstituted(value: Boolean): Self = StObject.set(x, "wasSubstituted", value.asInstanceOf[js.Any])
    
    inline def set_wasSubstituted(value: Element): Self = StObject.set(x, "_wasSubstituted", value.asInstanceOf[js.Any])
    
    inline def set_wasSubstitutedUndefined: Self = StObject.set(x, "_wasSubstituted", js.undefined)
  }
}
