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
    * The status of the items.
    */
  var itemStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The item or items in this listing.
    */
  var items: js.UndefOr[js.Array[InventoryReportInventoryListingItems]] = js.undefined
  
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
  
  extension [Self <: InventoryReportInventoryListing](x: Self) {
    
    inline def setCountingDateTime(value: String): Self = StObject.set(x, "countingDateTime", value.asInstanceOf[js.Any])
    
    inline def setCountingDateTimeUndefined: Self = StObject.set(x, "countingDateTime", js.undefined)
    
    inline def setItemStatus(value: CodeableConcept): Self = StObject.set(x, "itemStatus", value.asInstanceOf[js.Any])
    
    inline def setItemStatusUndefined: Self = StObject.set(x, "itemStatus", js.undefined)
    
    inline def setItems(value: js.Array[InventoryReportInventoryListingItems]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InventoryReportInventoryListingItems*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def set_countingDateTime(value: Element): Self = StObject.set(x, "_countingDateTime", value.asInstanceOf[js.Any])
    
    inline def set_countingDateTimeUndefined: Self = StObject.set(x, "_countingDateTime", js.undefined)
  }
}
