package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Composition information about the substance
  */
@js.native
trait SubstanceIngredient extends BackboneElement {
  
  /**
    * Optional amount (concentration)
    */
  var quantity: js.UndefOr[Ratio] = js.native
  
  /**
    * A component of the substance
    */
  var substanceCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * A component of the substance
    */
  var substanceReference: js.UndefOr[Reference] = js.native
}
object SubstanceIngredient {
  
  @scala.inline
  def apply(): SubstanceIngredient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceIngredient]
  }
  
  @scala.inline
  implicit class SubstanceIngredientOps[Self <: SubstanceIngredient] (val x: Self) extends AnyVal {
    
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
    def setQuantity(value: Ratio): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setSubstanceCodeableConcept(value: CodeableConcept): Self = this.set("substanceCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstanceCodeableConcept: Self = this.set("substanceCodeableConcept", js.undefined)
    
    @scala.inline
    def setSubstanceReference(value: Reference): Self = this.set("substanceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstanceReference: Self = this.set("substanceReference", js.undefined)
  }
}
