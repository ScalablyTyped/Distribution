package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaItemCountByStatus extends StObject {
  
  /**
    * Number of items matching the status code.
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of items matching the status code for which billing is done. This excludes virtual container items from the total count. This count would not be applicable for items with ERROR or NEW_ITEM status code.
    */
  var indexedItemsCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the items.
    */
  var statusCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaItemCountByStatus {
  
  inline def apply(): SchemaItemCountByStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemCountByStatus]
  }
  
  extension [Self <: SchemaItemCountByStatus](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setIndexedItemsCount(value: String): Self = StObject.set(x, "indexedItemsCount", value.asInstanceOf[js.Any])
    
    inline def setIndexedItemsCountNull: Self = StObject.set(x, "indexedItemsCount", null)
    
    inline def setIndexedItemsCountUndefined: Self = StObject.set(x, "indexedItemsCount", js.undefined)
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeNull: Self = StObject.set(x, "statusCode", null)
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
