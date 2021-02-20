package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Any restrictions on medication substitution
  */
@js.native
trait MedicationRequestSubstitution extends BackboneElement {
  
  /**
    * Contains extended information for property 'allowed'.
    */
  var _allowed: js.UndefOr[Element] = js.native
  
  /**
    * Whether substitution is allowed or not
    */
  var allowed: Boolean = js.native
  
  /**
    * Why should (not) substitution be made
    */
  var reason: js.UndefOr[CodeableConcept] = js.native
}
object MedicationRequestSubstitution {
  
  @scala.inline
  def apply(allowed: Boolean): MedicationRequestSubstitution = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationRequestSubstitution]
  }
  
  @scala.inline
  implicit class MedicationRequestSubstitutionMutableBuilder[Self <: MedicationRequestSubstitution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def set_allowed(value: Element): Self = StObject.set(x, "_allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_allowedUndefined: Self = StObject.set(x, "_allowed", js.undefined)
  }
}
