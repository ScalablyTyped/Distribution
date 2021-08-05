package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Whether a substitution was performed on the dispense
  */
trait MedicationDispenseSubstitution
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'wasSubstituted'.
    */
  var _wasSubstituted: js.UndefOr[Element] = js.undefined
  
  /**
    * Why was substitution made
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Who is responsible for the substitution
    */
  var responsibleParty: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Code signifying whether a different drug was dispensed from what was prescribed
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Whether a substitution was or was not performed on the dispense
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
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value :_*))
    
    inline def setResponsibleParty(value: js.Array[Reference]): Self = StObject.set(x, "responsibleParty", value.asInstanceOf[js.Any])
    
    inline def setResponsiblePartyUndefined: Self = StObject.set(x, "responsibleParty", js.undefined)
    
    inline def setResponsiblePartyVarargs(value: Reference*): Self = StObject.set(x, "responsibleParty", js.Array(value :_*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWasSubstituted(value: Boolean): Self = StObject.set(x, "wasSubstituted", value.asInstanceOf[js.Any])
    
    inline def set_wasSubstituted(value: Element): Self = StObject.set(x, "_wasSubstituted", value.asInstanceOf[js.Any])
    
    inline def set_wasSubstitutedUndefined: Self = StObject.set(x, "_wasSubstituted", js.undefined)
  }
}
