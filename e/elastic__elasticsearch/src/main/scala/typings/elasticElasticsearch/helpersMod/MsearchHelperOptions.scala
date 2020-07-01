package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @elastic/elasticsearch.@elastic/elasticsearch/lib/Helpers.Omit<@elastic/elasticsearch.@elastic/elasticsearch/api/requestParams.Msearch<@elastic/elasticsearch.@elastic/elasticsearch/lib/Transport.RequestNDBody<std.Array<std.Record<string, any>>>>, 'body'> */
trait MsearchHelperOptions extends js.Object {
  var ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.undefined
  var concurrency: js.UndefOr[Double] = js.undefined
  var error_trace: js.UndefOr[Boolean] = js.undefined
  var filter_path: js.UndefOr[String | js.Array[String]] = js.undefined
  var flushInterval: js.UndefOr[Double] = js.undefined
  var human: js.UndefOr[Boolean] = js.undefined
  var ignore: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  var max_concurrent_searches: js.UndefOr[Double] = js.undefined
  var max_concurrent_shard_requests: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var operations: js.UndefOr[Double] = js.undefined
  var pre_filter_shard_size: js.UndefOr[Double] = js.undefined
  var pretty: js.UndefOr[Boolean] = js.undefined
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  var typed_keys: js.UndefOr[Boolean] = js.undefined
  @JSName("wait")
  var wait_FMsearchHelperOptions: js.UndefOr[Double] = js.undefined
}

object MsearchHelperOptions {
  @scala.inline
  def apply(
    ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.undefined,
    concurrency: js.UndefOr[Double] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    flushInterval: js.UndefOr[Double] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    index: String | js.Array[String] = null,
    max_concurrent_searches: js.UndefOr[Double] = js.undefined,
    max_concurrent_shard_requests: js.UndefOr[Double] = js.undefined,
    method: String = null,
    operations: js.UndefOr[Double] = js.undefined,
    pre_filter_shard_size: js.UndefOr[Double] = js.undefined,
    pretty: js.UndefOr[Boolean] = js.undefined,
    rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined,
    retries: js.UndefOr[Double] = js.undefined,
    search_type: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch = null,
    source: String = null,
    `type`: String | js.Array[String] = null,
    typed_keys: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Double] = js.undefined
  ): MsearchHelperOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ccs_minimize_roundtrips)) __obj.updateDynamic("ccs_minimize_roundtrips")(ccs_minimize_roundtrips.get.asInstanceOf[js.Any])
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(flushInterval)) __obj.updateDynamic("flushInterval")(flushInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(max_concurrent_searches)) __obj.updateDynamic("max_concurrent_searches")(max_concurrent_searches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_concurrent_shard_requests)) __obj.updateDynamic("max_concurrent_shard_requests")(max_concurrent_shard_requests.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(operations)) __obj.updateDynamic("operations")(operations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pre_filter_shard_size)) __obj.updateDynamic("pre_filter_shard_size")(pre_filter_shard_size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rest_total_hits_as_int)) __obj.updateDynamic("rest_total_hits_as_int")(rest_total_hits_as_int.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (search_type != null) __obj.updateDynamic("search_type")(search_type.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(typed_keys)) __obj.updateDynamic("typed_keys")(typed_keys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsearchHelperOptions]
  }
}

