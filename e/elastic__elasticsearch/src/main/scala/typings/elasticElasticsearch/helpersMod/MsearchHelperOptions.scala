package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @elastic/elasticsearch.@elastic/elasticsearch/lib/Helpers.Omit<@elastic/elasticsearch.@elastic/elasticsearch/api/requestParams.Msearch<@elastic/elasticsearch.@elastic/elasticsearch/lib/Transport.RequestNDBody<std.Array<std.Record<string, any>>>>, 'body'> */
@js.native
trait MsearchHelperOptions extends js.Object {
  var ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.native
  var concurrency: js.UndefOr[Double] = js.native
  var error_trace: js.UndefOr[Boolean] = js.native
  var filter_path: js.UndefOr[String | js.Array[String]] = js.native
  var flushInterval: js.UndefOr[Double] = js.native
  var human: js.UndefOr[Boolean] = js.native
  var ignore: js.UndefOr[Double | js.Array[Double]] = js.native
  var index: js.UndefOr[String | js.Array[String]] = js.native
  var max_concurrent_searches: js.UndefOr[Double] = js.native
  var max_concurrent_shard_requests: js.UndefOr[Double] = js.native
  var method: js.UndefOr[String] = js.native
  var operations: js.UndefOr[Double] = js.native
  var pre_filter_shard_size: js.UndefOr[Double] = js.native
  var pretty: js.UndefOr[Boolean] = js.native
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.native
  var retries: js.UndefOr[Double] = js.native
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.native
  var source: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  var typed_keys: js.UndefOr[Boolean] = js.native
  @JSName("wait")
  var wait_FMsearchHelperOptions: js.UndefOr[Double] = js.native
}

object MsearchHelperOptions {
  @scala.inline
  def apply(): MsearchHelperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsearchHelperOptions]
  }
  @scala.inline
  implicit class MsearchHelperOptionsOps[Self <: MsearchHelperOptions] (val x: Self) extends AnyVal {
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
    def setCcs_minimize_roundtrips(value: Boolean): Self = this.set("ccs_minimize_roundtrips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCcs_minimize_roundtrips: Self = this.set("ccs_minimize_roundtrips", js.undefined)
    @scala.inline
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    @scala.inline
    def setError_trace(value: Boolean): Self = this.set("error_trace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_trace: Self = this.set("error_trace", js.undefined)
    @scala.inline
    def setFilter_pathVarargs(value: String*): Self = this.set("filter_path", js.Array(value :_*))
    @scala.inline
    def setFilter_path(value: String | js.Array[String]): Self = this.set("filter_path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_path: Self = this.set("filter_path", js.undefined)
    @scala.inline
    def setFlushInterval(value: Double): Self = this.set("flushInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlushInterval: Self = this.set("flushInterval", js.undefined)
    @scala.inline
    def setHuman(value: Boolean): Self = this.set("human", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHuman: Self = this.set("human", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: Double*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: Double | js.Array[Double]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOperations(value: Double): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    @scala.inline
    def setPre_filter_shard_size(value: Double): Self = this.set("pre_filter_shard_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePre_filter_shard_size: Self = this.set("pre_filter_shard_size", js.undefined)
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    @scala.inline
    def setRest_total_hits_as_int(value: Boolean): Self = this.set("rest_total_hits_as_int", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRest_total_hits_as_int: Self = this.set("rest_total_hits_as_int", js.undefined)
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    @scala.inline
    def setSearch_type(value: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch): Self = this.set("search_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch_type: Self = this.set("search_type", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
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
    @scala.inline
    def setWait(value: Double): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
  
}

