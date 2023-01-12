package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesClearCacheParams
  extends StObject
     with GenericParams {
  
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var fieldData: js.UndefOr[Boolean] = js.undefined
  
  var fielddata: js.UndefOr[Boolean] = js.undefined
  
  // yes the docs really have both
  var fields: js.UndefOr[NameList] = js.undefined
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[NameList] = js.undefined
  
  var query: js.UndefOr[Boolean] = js.undefined
  
  var recycler: js.UndefOr[Boolean] = js.undefined
  
  var request: js.UndefOr[Boolean] = js.undefined
}
object IndicesClearCacheParams {
  
  inline def apply(): IndicesClearCacheParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesClearCacheParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesClearCacheParams] (val x: Self) extends AnyVal {
    
    inline def setAllowNoIndices(value: Boolean): Self = StObject.set(x, "allowNoIndices", value.asInstanceOf[js.Any])
    
    inline def setAllowNoIndicesUndefined: Self = StObject.set(x, "allowNoIndices", js.undefined)
    
    inline def setExpandWildcards(value: ExpandWildcards): Self = StObject.set(x, "expandWildcards", value.asInstanceOf[js.Any])
    
    inline def setExpandWildcardsUndefined: Self = StObject.set(x, "expandWildcards", js.undefined)
    
    inline def setFieldData(value: Boolean): Self = StObject.set(x, "fieldData", value.asInstanceOf[js.Any])
    
    inline def setFieldDataUndefined: Self = StObject.set(x, "fieldData", js.undefined)
    
    inline def setFields(value: NameList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setIgnoreUnavailable(value: Boolean): Self = StObject.set(x, "ignoreUnavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnavailableUndefined: Self = StObject.set(x, "ignoreUnavailable", js.undefined)
    
    inline def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setQuery(value: Boolean): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRecycler(value: Boolean): Self = StObject.set(x, "recycler", value.asInstanceOf[js.Any])
    
    inline def setRecyclerUndefined: Self = StObject.set(x, "recycler", js.undefined)
    
    inline def setRequest(value: Boolean): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
