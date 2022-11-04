package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityQueryApiKeysRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var from: js.UndefOr[integer] = js.undefined
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var search_after: js.UndefOr[SortResults] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var sort: js.UndefOr[Sort] = js.undefined
  
  var with_limited_by: js.UndefOr[Boolean] = js.undefined
}
object SecurityQueryApiKeysRequest {
  
  inline def apply(): SecurityQueryApiKeysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityQueryApiKeysRequest]
  }
  
  extension [Self <: SecurityQueryApiKeysRequest](x: Self) {
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSearch_after(value: SortResults): Self = StObject.set(x, "search_after", value.asInstanceOf[js.Any])
    
    inline def setSearch_afterUndefined: Self = StObject.set(x, "search_after", js.undefined)
    
    inline def setSearch_afterVarargs(value: FieldValue*): Self = StObject.set(x, "search_after", js.Array(value*))
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortCombinations*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setWith_limited_by(value: Boolean): Self = StObject.set(x, "with_limited_by", value.asInstanceOf[js.Any])
    
    inline def setWith_limited_byUndefined: Self = StObject.set(x, "with_limited_by", js.undefined)
  }
}
