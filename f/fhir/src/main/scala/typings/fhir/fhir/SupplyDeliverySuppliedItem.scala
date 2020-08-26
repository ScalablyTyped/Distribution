package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The item that is delivered or supplied
  */
@js.native
trait SupplyDeliverySuppliedItem extends BackboneElement {
  /**
    * Medication, Substance, or Device supplied
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Medication, Substance, or Device supplied
    */
  var itemReference: js.UndefOr[Reference] = js.native
  /**
    * Amount dispensed
    */
  var quantity: js.UndefOr[Quantity] = js.native
}

object SupplyDeliverySuppliedItem {
  @scala.inline
  def apply(): SupplyDeliverySuppliedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplyDeliverySuppliedItem]
  }
  @scala.inline
  implicit class SupplyDeliverySuppliedItemOps[Self <: SupplyDeliverySuppliedItem] (val x: Self) extends AnyVal {
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
    def setItemCodeableConcept(value: CodeableConcept): Self = this.set("itemCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCodeableConcept: Self = this.set("itemCodeableConcept", js.undefined)
    @scala.inline
    def setItemReference(value: Reference): Self = this.set("itemReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemReference: Self = this.set("itemReference", js.undefined)
    @scala.inline
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
  
}

