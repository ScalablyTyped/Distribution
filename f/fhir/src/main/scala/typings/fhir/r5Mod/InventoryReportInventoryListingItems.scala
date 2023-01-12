package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryReportInventoryListingItems
  extends StObject
     with BackboneElement {
  
  var _expiry: js.UndefOr[Element] = js.undefined
  
  var _lot: js.UndefOr[Element] = js.undefined
  
  var _manufacturingDate: js.UndefOr[Element] = js.undefined
  
  var _serial: js.UndefOr[Element] = js.undefined
  
  /**
    * The category of the item or items.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The expiry date of the item or items.
    */
  var expiry: js.UndefOr[String] = js.undefined
  
  /**
    * The code or reference to the item type.
    */
  var item: CodeableReference
  
  /**
    * The lot number of the item or items.
    */
  var lot: js.UndefOr[String] = js.undefined
  
  /**
    * The manufacturingDate of the item or items.
    */
  var manufacturingDate: js.UndefOr[String] = js.undefined
  
  /**
    * The quantity of the item or items.
    */
  var quantity: Quantity
  
  /**
    * The serial number of the item.
    */
  var serial: js.UndefOr[String] = js.undefined
}
object InventoryReportInventoryListingItems {
  
  inline def apply(item: CodeableReference, quantity: Quantity): InventoryReportInventoryListingItems = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryReportInventoryListingItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryReportInventoryListingItems] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setItem(value: CodeableReference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setLot(value: String): Self = StObject.set(x, "lot", value.asInstanceOf[js.Any])
    
    inline def setLotUndefined: Self = StObject.set(x, "lot", js.undefined)
    
    inline def setManufacturingDate(value: String): Self = StObject.set(x, "manufacturingDate", value.asInstanceOf[js.Any])
    
    inline def setManufacturingDateUndefined: Self = StObject.set(x, "manufacturingDate", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
    
    inline def set_expiry(value: Element): Self = StObject.set(x, "_expiry", value.asInstanceOf[js.Any])
    
    inline def set_expiryUndefined: Self = StObject.set(x, "_expiry", js.undefined)
    
    inline def set_lot(value: Element): Self = StObject.set(x, "_lot", value.asInstanceOf[js.Any])
    
    inline def set_lotUndefined: Self = StObject.set(x, "_lot", js.undefined)
    
    inline def set_manufacturingDate(value: Element): Self = StObject.set(x, "_manufacturingDate", value.asInstanceOf[js.Any])
    
    inline def set_manufacturingDateUndefined: Self = StObject.set(x, "_manufacturingDate", js.undefined)
    
    inline def set_serial(value: Element): Self = StObject.set(x, "_serial", value.asInstanceOf[js.Any])
    
    inline def set_serialUndefined: Self = StObject.set(x, "_serial", js.undefined)
  }
}
