package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Related Claims which may be revelant to processing this claim
  */
@js.native
trait ExplanationOfBenefitRelated extends BackboneElement {
  
  /**
    * Reference to the related claim
    */
  var claim: js.UndefOr[Reference] = js.native
  
  /**
    * Related file or case reference
    */
  var reference: js.UndefOr[Identifier] = js.native
  
  /**
    * How the reference claim is related
    */
  var relationship: js.UndefOr[CodeableConcept] = js.native
}
object ExplanationOfBenefitRelated {
  
  @scala.inline
  def apply(): ExplanationOfBenefitRelated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitRelated]
  }
  
  @scala.inline
  implicit class ExplanationOfBenefitRelatedOps[Self <: ExplanationOfBenefitRelated] (val x: Self) extends AnyVal {
    
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
    def setClaim(value: Reference): Self = this.set("claim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaim: Self = this.set("claim", js.undefined)
    
    @scala.inline
    def setReference(value: Identifier): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    
    @scala.inline
    def setRelationship(value: CodeableConcept): Self = this.set("relationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationship: Self = this.set("relationship", js.undefined)
  }
}
