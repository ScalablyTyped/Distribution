package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetCustomerSearchApplicationStatsResponse extends StObject {
  
  /**
    * Average search application count for the given date range.
    */
  var averageSearchApplicationCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Search application stats by date.
    */
  var stats: js.UndefOr[js.Array[SchemaCustomerSearchApplicationStats]] = js.undefined
}
object SchemaGetCustomerSearchApplicationStatsResponse {
  
  inline def apply(): SchemaGetCustomerSearchApplicationStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetCustomerSearchApplicationStatsResponse]
  }
  
  extension [Self <: SchemaGetCustomerSearchApplicationStatsResponse](x: Self) {
    
    inline def setAverageSearchApplicationCount(value: String): Self = StObject.set(x, "averageSearchApplicationCount", value.asInstanceOf[js.Any])
    
    inline def setAverageSearchApplicationCountNull: Self = StObject.set(x, "averageSearchApplicationCount", null)
    
    inline def setAverageSearchApplicationCountUndefined: Self = StObject.set(x, "averageSearchApplicationCount", js.undefined)
    
    inline def setStats(value: js.Array[SchemaCustomerSearchApplicationStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: SchemaCustomerSearchApplicationStats*): Self = StObject.set(x, "stats", js.Array(value*))
  }
}
