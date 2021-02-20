package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Whether a substitution was performed on the dispense
  */
@js.native
trait MedicationDispenseSubstitution extends BackboneElement {
  
  /**
    * Contains extended information for property 'wasSubstituted'.
    */
  var _wasSubstituted: js.UndefOr[Element] = js.native
  
  /**
    * Why was substitution made
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Who is responsible for the substitution
    */
  var responsibleParty: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Code signifying whether a different drug was dispensed from what was prescribed
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Whether a substitution was or was not performed on the dispense
    */
  var wasSubstituted: Boolean = js.native
}
object MedicationDispenseSubstitution {
  
  @scala.inline
  def apply(wasSubstituted: Boolean): MedicationDispenseSubstitution = {
    val __obj = js.Dynamic.literal(wasSubstituted = wasSubstituted.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationDispenseSubstitution]
  }
  
  @scala.inline
  implicit class MedicationDispenseSubstitutionMutableBuilder[Self <: MedicationDispenseSubstitution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value :_*))
    
    @scala.inline
    def setResponsibleParty(value: js.Array[Reference]): Self = StObject.set(x, "responsibleParty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiblePartyUndefined: Self = StObject.set(x, "responsibleParty", js.undefined)
    
    @scala.inline
    def setResponsiblePartyVarargs(value: Reference*): Self = StObject.set(x, "responsibleParty", js.Array(value :_*))
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWasSubstituted(value: Boolean): Self = StObject.set(x, "wasSubstituted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_wasSubstituted(value: Element): Self = StObject.set(x, "_wasSubstituted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_wasSubstitutedUndefined: Self = StObject.set(x, "_wasSubstituted", js.undefined)
  }
}
