package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MsearchTemplate[T] extends Generic {
  
  var body: T = js.native
  
  var ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String | js.Array[String]] = js.native
  
  var max_concurrent_searches: js.UndefOr[Double] = js.native
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.native
  
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.native
  
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  
  var typed_keys: js.UndefOr[Boolean] = js.native
}
object MsearchTemplate {
  
  @scala.inline
  def apply[T](body: T): MsearchTemplate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsearchTemplate[T]]
  }
  
  @scala.inline
  implicit class MsearchTemplateMutableBuilder[Self <: MsearchTemplate[_], T] (val x: Self with MsearchTemplate[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcs_minimize_roundtrips(value: Boolean): Self = StObject.set(x, "ccs_minimize_roundtrips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcs_minimize_roundtripsUndefined: Self = StObject.set(x, "ccs_minimize_roundtrips", js.undefined)
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setMax_concurrent_searches(value: Double): Self = StObject.set(x, "max_concurrent_searches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_concurrent_searchesUndefined: Self = StObject.set(x, "max_concurrent_searches", js.undefined)
    
    @scala.inline
    def setRest_total_hits_as_int(value: Boolean): Self = StObject.set(x, "rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRest_total_hits_as_intUndefined: Self = StObject.set(x, "rest_total_hits_as_int", js.undefined)
    
    @scala.inline
    def setSearch_type(value: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch): Self = StObject.set(x, "search_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_typeUndefined: Self = StObject.set(x, "search_type", js.undefined)
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def setTyped_keys(value: Boolean): Self = StObject.set(x, "typed_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTyped_keysUndefined: Self = StObject.set(x, "typed_keys", js.undefined)
  }
}
