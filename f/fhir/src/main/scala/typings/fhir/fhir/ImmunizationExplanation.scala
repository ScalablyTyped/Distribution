package typings.fhir.fhir

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
  implicit class ImmunizationExplanationOps[Self <: ImmunizationExplanation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReasonVarargs(value: CodeableConcept*): Self = this.set("reason", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: js.Array[CodeableConcept]): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setReasonNotGivenVarargs(value: CodeableConcept*): Self = this.set("reasonNotGiven", js.Array(value :_*))
    
    @scala.inline
    def setReasonNotGiven(value: js.Array[CodeableConcept]): Self = this.set("reasonNotGiven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonNotGiven: Self = this.set("reasonNotGiven", js.undefined)
  }
}
