package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesClearCacheParams extends GenericParams {
  
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  
  var fieldData: js.UndefOr[Boolean] = js.native
  
  var fielddata: js.UndefOr[Boolean] = js.native
  
  // yes the docs really have both
  var fields: js.UndefOr[NameList] = js.native
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[NameList] = js.native
  
  var query: js.UndefOr[Boolean] = js.native
  
  var recycler: js.UndefOr[Boolean] = js.native
  
  var request: js.UndefOr[Boolean] = js.native
}
object IndicesClearCacheParams {
  
  @scala.inline
  def apply(): IndicesClearCacheParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesClearCacheParams]
  }
  
  @scala.inline
  implicit class IndicesClearCacheParamsMutableBuilder[Self <: IndicesClearCacheParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNoIndices(value: Boolean): Self = StObject.set(x, "allowNoIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNoIndicesUndefined: Self = StObject.set(x, "allowNoIndices", js.undefined)
    
    @scala.inline
    def setExpandWildcards(value: ExpandWildcards): Self = StObject.set(x, "expandWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandWildcardsUndefined: Self = StObject.set(x, "expandWildcards", js.undefined)
    
    @scala.inline
    def setFieldData(value: Boolean): Self = StObject.set(x, "fieldData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDataUndefined: Self = StObject.set(x, "fieldData", js.undefined)
    
    @scala.inline
    def setFields(value: NameList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = StObject.set(x, "ignoreUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnavailableUndefined: Self = StObject.set(x, "ignoreUnavailable", js.undefined)
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setQuery(value: Boolean): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRecycler(value: Boolean): Self = StObject.set(x, "recycler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecyclerUndefined: Self = StObject.set(x, "recycler", js.undefined)
    
    @scala.inline
    def setRequest(value: Boolean): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
