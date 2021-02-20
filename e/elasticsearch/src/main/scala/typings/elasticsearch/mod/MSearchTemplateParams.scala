package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.dfs_query_and_fetch
import typings.elasticsearch.elasticsearchStrings.dfs_query_then_fetch
import typings.elasticsearch.elasticsearchStrings.query_and_fetch
import typings.elasticsearch.elasticsearchStrings.query_then_fetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSearchTemplateParams extends GenericParams {
  
  var index: js.UndefOr[NameList] = js.native
  
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.native
  
  var `type`: js.UndefOr[NameList] = js.native
}
object MSearchTemplateParams {
  
  @scala.inline
  def apply(): MSearchTemplateParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSearchTemplateParams]
  }
  
  @scala.inline
  implicit class MSearchTemplateParamsMutableBuilder[Self <: MSearchTemplateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setSearch_type(value: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch): Self = StObject.set(x, "search_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_typeUndefined: Self = StObject.set(x, "search_type", js.undefined)
    
    @scala.inline
    def setType(value: NameList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
