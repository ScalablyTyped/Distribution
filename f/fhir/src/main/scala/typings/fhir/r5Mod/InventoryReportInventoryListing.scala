package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryReportInventoryListing
  extends StObject
     with BackboneElement {
  
  var _countingDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * The date and time when the items were counted.
    */
  var countingDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The item or items in this listing.
    */
  var item: js.UndefOr[js.Array[InventoryReportInventoryListingItem]] = js.undefined
  
  /**
    * The status of the items.
    */
  var itemStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Location of the inventory items.
    */
  var location: js.UndefOr[Reference] = js.undefined
}
object InventoryReportInventoryListing {
  
  inline def apply(): InventoryReportInventoryListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryReportInventoryListing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryReportInventoryListing] (val x: Self) extends AnyVal {
    
    inline def setCountingDateTime(value: String): Self = StObject.set(x, "countingDateTime", value.asInstanceOf[js.Any])
    
    inline def setCountingDateTimeUndefined: Self = StObject.set(x, "countingDateTime", js.undefined)
    
    inline def setItem(value: js.Array[InventoryReportInventoryListingItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemStatus(value: CodeableConcept): Self = StObject.set(x, "itemStatus", value.asInstanceOf[js.Any])
    
    inline def setItemStatusUndefined: Self = StObject.set(x, "itemStatus", js.undefined)
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: InventoryReportInventoryListingItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def set_countingDateTime(value: Element): Self = StObject.set(x, "_countingDateTime", value.asInstanceOf[js.Any])
    
    inline def set_countingDateTimeUndefined: Self = StObject.set(x, "_countingDateTime", js.undefined)
  }
}
