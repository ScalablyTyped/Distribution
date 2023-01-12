package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.dfs_query_and_fetch
import typings.elasticsearch.elasticsearchStrings.dfs_query_then_fetch
import typings.elasticsearch.elasticsearchStrings.query_and_fetch
import typings.elasticsearch.elasticsearchStrings.query_then_fetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSearchParams
  extends StObject
     with GenericParams {
  
  var index: js.UndefOr[NameList] = js.undefined
  
  var maxConcurrentSearches: js.UndefOr[Double] = js.undefined
  
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.undefined
  
  var `type`: js.UndefOr[NameList] = js.undefined
}
object MSearchParams {
  
  inline def apply(): MSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSearchParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MSearchParams] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setMaxConcurrentSearches(value: Double): Self = StObject.set(x, "maxConcurrentSearches", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentSearchesUndefined: Self = StObject.set(x, "maxConcurrentSearches", js.undefined)
    
    inline def setSearch_type(value: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch): Self = StObject.set(x, "search_type", value.asInstanceOf[js.Any])
    
    inline def setSearch_typeUndefined: Self = StObject.set(x, "search_type", js.undefined)
    
    inline def setType(value: NameList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
