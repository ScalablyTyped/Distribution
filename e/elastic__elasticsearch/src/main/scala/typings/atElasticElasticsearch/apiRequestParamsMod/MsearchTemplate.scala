package typings.atElasticElasticsearch.apiRequestParamsMod

import typings.atElasticElasticsearch.atElasticElasticsearchStrings.dfs_query_and_fetch
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.dfs_query_then_fetch
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.query_and_fetch
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsearchTemplate[T] extends Generic {
  var body: T
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  var max_concurrent_searches: js.UndefOr[Double] = js.undefined
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.undefined
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  var typed_keys: js.UndefOr[Boolean] = js.undefined
}

object MsearchTemplate {
  @scala.inline
  def apply[T](
    body: T,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    index: String | js.Array[String] = null,
    max_concurrent_searches: Int | Double = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined,
    search_type: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch = null,
    source: String = null,
    `type`: String | js.Array[String] = null,
    typed_keys: js.UndefOr[Boolean] = js.undefined
  ): MsearchTemplate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (max_concurrent_searches != null) __obj.updateDynamic("max_concurrent_searches")(max_concurrent_searches.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (!js.isUndefined(rest_total_hits_as_int)) __obj.updateDynamic("rest_total_hits_as_int")(rest_total_hits_as_int.asInstanceOf[js.Any])
    if (search_type != null) __obj.updateDynamic("search_type")(search_type.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(typed_keys)) __obj.updateDynamic("typed_keys")(typed_keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsearchTemplate[T]]
  }
}

