package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesClearCacheRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var fielddata: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[Fields] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Indices] = js.undefined
  
  var query: js.UndefOr[Boolean] = js.undefined
  
  var request: js.UndefOr[Boolean] = js.undefined
}
object IndicesClearCacheRequest {
  
  inline def apply(): IndicesClearCacheRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesClearCacheRequest]
  }
  
  extension [Self <: IndicesClearCacheRequest](x: Self) {
    
    inline def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setFielddata(value: Boolean): Self = StObject.set(x, "fielddata", value.asInstanceOf[js.Any])
    
    inline def setFielddataUndefined: Self = StObject.set(x, "fielddata", js.undefined)
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setQuery(value: Boolean): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRequest(value: Boolean): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
