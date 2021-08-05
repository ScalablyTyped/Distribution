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
  
  inline def apply(): SupplyDeliverySuppliedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplyDeliverySuppliedItem]
  }
  
  extension [Self <: SupplyDeliverySuppliedItem](x: Self) {
    
    inline def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    inline def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    inline def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
