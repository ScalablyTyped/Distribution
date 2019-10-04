package typings.atElasticElasticsearch.apiRequestParamsMod

import typings.atElasticElasticsearch.atElasticElasticsearchStrings.all
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.closed
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.dfs_query_and_fetch
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.dfs_query_then_fetch
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.none
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.open
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.query_and_fetch
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchTemplate[T] extends Generic {
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  var body: T
  var expand_wildcards: js.UndefOr[open | closed | none | all] = js.undefined
  var explain: js.UndefOr[Boolean] = js.undefined
  var ignore_throttled: js.UndefOr[Boolean] = js.undefined
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  var preference: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[Boolean] = js.undefined
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined
  var routing: js.UndefOr[String | js.Array[String]] = js.undefined
  var scroll: js.UndefOr[String] = js.undefined
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.undefined
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  var typed_keys: js.UndefOr[Boolean] = js.undefined
}

object SearchTemplate {
  @scala.inline
  def apply[T](
    body: T,
    allow_no_indices: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    expand_wildcards: open | closed | none | all = null,
    explain: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    ignore_throttled: js.UndefOr[Boolean] = js.undefined,
    ignore_unavailable: js.UndefOr[Boolean] = js.undefined,
    index: String | js.Array[String] = null,
    method: String = null,
    preference: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    profile: js.UndefOr[Boolean] = js.undefined,
    rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined,
    routing: String | js.Array[String] = null,
    scroll: String = null,
    search_type: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch = null,
    source: String = null,
    `type`: String | js.Array[String] = null,
    typed_keys: js.UndefOr[Boolean] = js.undefined
  ): SearchTemplate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_no_indices)) __obj.updateDynamic("allow_no_indices")(allow_no_indices)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_throttled)) __obj.updateDynamic("ignore_throttled")(ignore_throttled)
    if (!js.isUndefined(ignore_unavailable)) __obj.updateDynamic("ignore_unavailable")(ignore_unavailable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (!js.isUndefined(profile)) __obj.updateDynamic("profile")(profile)
    if (!js.isUndefined(rest_total_hits_as_int)) __obj.updateDynamic("rest_total_hits_as_int")(rest_total_hits_as_int)
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (search_type != null) __obj.updateDynamic("search_type")(search_type.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(typed_keys)) __obj.updateDynamic("typed_keys")(typed_keys)
    __obj.asInstanceOf[SearchTemplate[T]]
  }
}

