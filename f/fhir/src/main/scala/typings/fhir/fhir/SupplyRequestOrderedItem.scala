package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The item being requested
  */
@js.native
trait SupplyRequestOrderedItem extends BackboneElement {
  
  /**
    * Medication, Substance, or Device requested to be supplied
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Medication, Substance, or Device requested to be supplied
    */
  var itemReference: js.UndefOr[Reference] = js.native
  
  /**
    * The requested amount of the item indicated
    */
  var quantity: Quantity = js.native
}
object SupplyRequestOrderedItem {
  
  @scala.inline
  def apply(quantity: Quantity): SupplyRequestOrderedItem = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupplyRequestOrderedItem]
  }
  
  @scala.inline
  implicit class SupplyRequestOrderedItemOps[Self <: SupplyRequestOrderedItem] (val x: Self) extends AnyVal {
    
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
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
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
