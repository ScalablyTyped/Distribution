package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The item that is delivered or supplied
  */
trait SupplyDeliverySuppliedItem
  extends StObject
     with BackboneElement {
  
  /**
    * Medication, Substance, or Device supplied
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Medication, Substance, or Device supplied
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Amount dispensed
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
}
object SupplyDeliverySuppliedItem {
  
  @scala.inline
  def apply(): SupplyDeliverySuppliedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplyDeliverySuppliedItem]
  }
  
  @scala.inline
  implicit class SupplyDeliverySuppliedItemMutableBuilder[Self <: SupplyDeliverySuppliedItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    @scala.inline
    def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
