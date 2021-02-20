package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Administration/non-administration reasons
  */
@js.native
trait ImmunizationExplanation extends BackboneElement {
  
  /**
    * Why immunization occurred
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Why immunization did not occur
    */
  var reasonNotGiven: js.UndefOr[js.Array[CodeableConcept]] = js.native
}
object ImmunizationExplanation {
  
  @scala.inline
  def apply(): ImmunizationExplanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmunizationExplanation]
  }
  
  @scala.inline
  implicit class ImmunizationExplanationMutableBuilder[Self <: ImmunizationExplanation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonNotGiven(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonNotGiven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonNotGivenUndefined: Self = StObject.set(x, "reasonNotGiven", js.undefined)
    
    @scala.inline
    def setReasonNotGivenVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonNotGiven", js.Array(value :_*))
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value :_*))
  }
}
