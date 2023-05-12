package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryItemAssociation
  extends StObject
     with BackboneElement {
  
  /**
    * This attribute defined the type of association when establishing associations or relations between items, e.g. 'packaged within' or 'used with' or 'to be mixed with.
    */
  var associationType: CodeableConcept
  
  /**
    * The quantity of the related product in this product - Numerator is the quantity of the related product. Denominator is the quantity of the present product. For example a value of 20 means that this product contains 20 units of the related product; a value of 1:20 means the inverse - that the contained product contains 20 units of the present product.
    */
  var quantity: Ratio
  
  /**
    * The related item or product.
    */
  var relatedItem: Reference
}
object InventoryItemAssociation {
  
  inline def apply(associationType: CodeableConcept, quantity: Ratio, relatedItem: Reference): InventoryItemAssociation = {
    val __obj = js.Dynamic.literal(associationType = associationType.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], relatedItem = relatedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItemAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryItemAssociation] (val x: Self) extends AnyVal {
    
    inline def setAssociationType(value: CodeableConcept): Self = StObject.set(x, "associationType", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Ratio): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setRelatedItem(value: Reference): Self = StObject.set(x, "relatedItem", value.asInstanceOf[js.Any])
  }
}
