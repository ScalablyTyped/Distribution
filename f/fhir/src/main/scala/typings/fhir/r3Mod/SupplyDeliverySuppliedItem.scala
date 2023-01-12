package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupplyDeliverySuppliedItem
  extends StObject
     with BackboneElement {
  
  /**
    * Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list.
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list.
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The amount of supply that has been dispensed. Includes unit of measure.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
}
object SupplyDeliverySuppliedItem {
  
  inline def apply(): SupplyDeliverySuppliedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplyDeliverySuppliedItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupplyDeliverySuppliedItem] (val x: Self) extends AnyVal {
    
    inline def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    inline def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    inline def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
