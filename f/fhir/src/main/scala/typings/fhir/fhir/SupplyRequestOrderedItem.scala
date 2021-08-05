package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The item being requested
  */
trait SupplyRequestOrderedItem
  extends StObject
     with BackboneElement {
  
  /**
    * Medication, Substance, or Device requested to be supplied
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Medication, Substance, or Device requested to be supplied
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The requested amount of the item indicated
    */
  var quantity: Quantity
}
object SupplyRequestOrderedItem {
  
  inline def apply(quantity: Quantity): SupplyRequestOrderedItem = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupplyRequestOrderedItem]
  }
  
  extension [Self <: SupplyRequestOrderedItem](x: Self) {
    
    inline def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    inline def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    inline def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
  }
}
