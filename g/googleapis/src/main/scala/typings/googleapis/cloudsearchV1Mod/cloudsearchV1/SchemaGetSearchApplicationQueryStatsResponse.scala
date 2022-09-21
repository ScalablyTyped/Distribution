package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetSearchApplicationQueryStatsResponse extends StObject {
  
  /**
    * Query stats per date for a search application.
    */
  var stats: js.UndefOr[js.Array[SchemaSearchApplicationQueryStats]] = js.undefined
  
  /**
    * Total successful query count (status code 200) for the given date range.
    */
  var totalQueryCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGetSearchApplicationQueryStatsResponse {
  
  inline def apply(): SchemaGetSearchApplicationQueryStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetSearchApplicationQueryStatsResponse]
  }
  
  extension [Self <: SchemaGetSearchApplicationQueryStatsResponse](x: Self) {
    
    inline def setStats(value: js.Array[SchemaSearchApplicationQueryStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: SchemaSearchApplicationQueryStats*): Self = StObject.set(x, "stats", js.Array(value*))
    
    inline def setTotalQueryCount(value: String): Self = StObject.set(x, "totalQueryCount", value.asInstanceOf[js.Any])
    
    inline def setTotalQueryCountNull: Self = StObject.set(x, "totalQueryCount", null)
    
    inline def setTotalQueryCountUndefined: Self = StObject.set(x, "totalQueryCount", js.undefined)
  }
}
