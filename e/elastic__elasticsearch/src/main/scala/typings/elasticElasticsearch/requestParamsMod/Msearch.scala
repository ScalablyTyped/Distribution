package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Msearch[T] extends Generic {
  
  var body: T = js.native
  
  var ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String | js.Array[String]] = js.native
  
  var max_concurrent_searches: js.UndefOr[Double] = js.native
  
  var max_concurrent_shard_requests: js.UndefOr[Double] = js.native
  
  var pre_filter_shard_size: js.UndefOr[Double] = js.native
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.native
  
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.native
  
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  
  var typed_keys: js.UndefOr[Boolean] = js.native
}
object Msearch {
  
  @scala.inline
  def apply[T](body: T): Msearch[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msearch[T]]
  }
  
  @scala.inline
  implicit class MsearchOps[Self <: Msearch[_], T] (val x: Self with Msearch[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcs_minimize_roundtrips(value: Boolean): Self = this.set("ccs_minimize_roundtrips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCcs_minimize_roundtrips: Self = this.set("ccs_minimize_roundtrips", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setMax_concurrent_searches(value: Double): Self = this.set("max_concurrent_searches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_concurrent_searches: Self = this.set("max_concurrent_searches", js.undefined)
    
    @scala.inline
    def setMax_concurrent_shard_requests(value: Double): Self = this.set("max_concurrent_shard_requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_concurrent_shard_requests: Self = this.set("max_concurrent_shard_requests", js.undefined)
    
    @scala.inline
    def setPre_filter_shard_size(value: Double): Self = this.set("pre_filter_shard_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePre_filter_shard_size: Self = this.set("pre_filter_shard_size", js.undefined)
    
    @scala.inline
    def setRest_total_hits_as_int(value: Boolean): Self = this.set("rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRest_total_hits_as_int: Self = this.set("rest_total_hits_as_int", js.undefined)
    
    @scala.inline
    def setSearch_type(value: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch): Self = this.set("search_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch_type: Self = this.set("search_type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTyped_keys(value: Boolean): Self = this.set("typed_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTyped_keys: Self = this.set("typed_keys", js.undefined)
  }
}
