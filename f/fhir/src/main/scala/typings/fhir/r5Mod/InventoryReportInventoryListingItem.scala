package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryReportInventoryListingItem
  extends StObject
     with BackboneElement {
  
  /**
    * The inventory category or classification of the items being reported. This is meant not for defining the product, but for inventory categories e.g. 'pending recount' or 'damaged'.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The code or reference to the item type.
    */
  var item: CodeableReference
  
  /**
    * The quantity of the item or items being reported.
    */
  var quantity: Quantity
}
object InventoryReportInventoryListingItem {
  
  inline def apply(item: CodeableReference, quantity: Quantity): InventoryReportInventoryListingItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryReportInventoryListingItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryReportInventoryListingItem] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setItem(value: CodeableReference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
  }
}
