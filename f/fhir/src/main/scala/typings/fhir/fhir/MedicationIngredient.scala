package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Active or inactive ingredient
  */
@js.native
trait MedicationIngredient extends BackboneElement {
  /**
    * Contains extended information for property 'isActive'.
    */
  var _isActive: js.UndefOr[Element] = js.native
  /**
    * Quantity of ingredient present
    */
  var amount: js.UndefOr[Ratio] = js.native
  /**
    * Active ingredient indicator
    */
  var isActive: js.UndefOr[Boolean] = js.native
  /**
    * The product contained
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * The product contained
    */
  var itemReference: js.UndefOr[Reference] = js.native
}

object MedicationIngredient {
  @scala.inline
  def apply(): MedicationIngredient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationIngredient]
  }
  @scala.inline
  implicit class MedicationIngredientOps[Self <: MedicationIngredient] (val x: Self) extends AnyVal {
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
    def set_isActive(value: Element): Self = this.set("_isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_isActive: Self = this.set("_isActive", js.undefined)
    @scala.inline
    def setAmount(value: Ratio): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    @scala.inline
    def setItemCodeableConcept(value: CodeableConcept): Self = this.set("itemCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCodeableConcept: Self = this.set("itemCodeableConcept", js.undefined)
    @scala.inline
    def setItemReference(value: Reference): Self = this.set("itemReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemReference: Self = this.set("itemReference", js.undefined)
  }
  
}

