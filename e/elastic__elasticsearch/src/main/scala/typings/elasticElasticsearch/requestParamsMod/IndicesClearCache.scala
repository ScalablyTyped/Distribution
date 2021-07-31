package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesClearCache
  extends StObject
     with Generic {
  
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.undefined
  
  var fielddata: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var query: js.UndefOr[Boolean] = js.undefined
  
  var request: js.UndefOr[Boolean] = js.undefined
}
object IndicesClearCache {
  
  @scala.inline
  def apply(): IndicesClearCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesClearCache]
  }
  
  @scala.inline
  implicit class IndicesClearCacheMutableBuilder[Self <: IndicesClearCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    @scala.inline
    def setFielddata(value: Boolean): Self = StObject.set(x, "fielddata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFielddataUndefined: Self = StObject.set(x, "fielddata", js.undefined)
    
    @scala.inline
    def setFields(value: String | js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setQuery(value: Boolean): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRequest(value: Boolean): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
