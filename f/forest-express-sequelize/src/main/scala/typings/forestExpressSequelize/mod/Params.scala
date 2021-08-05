package typings.forestExpressSequelize.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  var fields: StringDictionary[String]
  
  var filters: Filter | AggregatedFilters
  
  var page: Page
  
  var search: String
  
  var searchExtended: String
  
  var sort: String
  
  var timezone: String
}
object Params {
  
  inline def apply(
    fields: StringDictionary[String],
    filters: Filter | AggregatedFilters,
    page: Page,
    search: String,
    searchExtended: String,
    sort: String,
    timezone: String
  ): Params = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchExtended = searchExtended.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
  
  extension [Self <: Params](x: Self) {
    
    inline def setFields(value: StringDictionary[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: Filter | AggregatedFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchExtended(value: String): Self = StObject.set(x, "searchExtended", value.asInstanceOf[js.Any])
    
    inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
  }
}
