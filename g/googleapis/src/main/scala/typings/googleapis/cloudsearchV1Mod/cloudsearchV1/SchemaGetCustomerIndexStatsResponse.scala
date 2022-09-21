package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetCustomerIndexStatsResponse extends StObject {
  
  /**
    * Average item count for the given date range for which billing is done.
    */
  var averageIndexedItemCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Summary of indexed item counts, one for each day in the requested range.
    */
  var stats: js.UndefOr[js.Array[SchemaCustomerIndexStats]] = js.undefined
}
object SchemaGetCustomerIndexStatsResponse {
  
  inline def apply(): SchemaGetCustomerIndexStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetCustomerIndexStatsResponse]
  }
  
  extension [Self <: SchemaGetCustomerIndexStatsResponse](x: Self) {
    
    inline def setAverageIndexedItemCount(value: String): Self = StObject.set(x, "averageIndexedItemCount", value.asInstanceOf[js.Any])
    
    inline def setAverageIndexedItemCountNull: Self = StObject.set(x, "averageIndexedItemCount", null)
    
    inline def setAverageIndexedItemCountUndefined: Self = StObject.set(x, "averageIndexedItemCount", js.undefined)
    
    inline def setStats(value: js.Array[SchemaCustomerIndexStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: SchemaCustomerIndexStats*): Self = StObject.set(x, "stats", js.Array(value*))
  }
}
