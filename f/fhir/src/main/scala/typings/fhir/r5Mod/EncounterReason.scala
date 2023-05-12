package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounterReason
  extends StObject
     with BackboneElement {
  
  /**
    * What the reason value should be used as e.g. Chief Complaint, Health Concern, Health Maintenance (including screening).
    */
  var use: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Reason the encounter takes place, expressed as a code or a reference to another resource. For admissions, this can be used for a coded admission diagnosis.
    */
  var value: js.UndefOr[js.Array[CodeableReference]] = js.undefined
}
object EncounterReason {
  
  inline def apply(): EncounterReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounterReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncounterReason] (val x: Self) extends AnyVal {
    
    inline def setUse(value: js.Array[CodeableConcept]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setUseVarargs(value: CodeableConcept*): Self = StObject.set(x, "use", js.Array(value*))
    
    inline def setValue(value: js.Array[CodeableReference]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: CodeableReference*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
