package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlTranslateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var fetch_size: js.UndefOr[integer] = js.undefined
  
  var filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var query: String
  
  var time_zone: js.UndefOr[TimeZone] = js.undefined
}
object SqlTranslateRequest {
  
  inline def apply(query: String): SqlTranslateRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlTranslateRequest]
  }
  
  extension [Self <: SqlTranslateRequest](x: Self) {
    
    inline def setFetch_size(value: integer): Self = StObject.set(x, "fetch_size", value.asInstanceOf[js.Any])
    
    inline def setFetch_sizeUndefined: Self = StObject.set(x, "fetch_size", js.undefined)
    
    inline def setFilter(value: QueryDslQueryContainer): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setTime_zone(value: TimeZone): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
  }
}
