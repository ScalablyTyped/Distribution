package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Sort
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SortCombinations
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SortResults
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.double
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Searchafter extends StObject {
  
  var from: js.UndefOr[integer] = js.undefined
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var search_after: js.UndefOr[SortResults] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var sort: js.UndefOr[Sort] = js.undefined
}
object Searchafter {
  
  inline def apply(): Searchafter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Searchafter]
  }
  
  extension [Self <: Searchafter](x: Self) {
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSearch_after(value: SortResults): Self = StObject.set(x, "search_after", value.asInstanceOf[js.Any])
    
    inline def setSearch_afterUndefined: Self = StObject.set(x, "search_after", js.undefined)
    
    inline def setSearch_afterVarargs(value: (long | double | String | Null)*): Self = StObject.set(x, "search_after", js.Array(value*))
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortCombinations*): Self = StObject.set(x, "sort", js.Array(value*))
  }
}
