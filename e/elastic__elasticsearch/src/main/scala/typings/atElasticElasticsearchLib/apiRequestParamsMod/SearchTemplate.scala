package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchTemplate[T] extends Generic {
  var allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined
  var body: T
  var ccs_minimize_roundtrips: js.UndefOr[scala.Boolean] = js.undefined
  var expand_wildcards: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all
  ] = js.undefined
  var explain: js.UndefOr[scala.Boolean] = js.undefined
  var ignore_throttled: js.UndefOr[scala.Boolean] = js.undefined
  var ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var profile: js.UndefOr[scala.Boolean] = js.undefined
  var rest_total_hits_as_int: js.UndefOr[scala.Boolean] = js.undefined
  var routing: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var scroll: js.UndefOr[java.lang.String] = js.undefined
  var search_type: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.query_then_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.query_and_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.dfs_query_then_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.dfs_query_and_fetch
  ] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var typed_keys: js.UndefOr[scala.Boolean] = js.undefined
}

object SearchTemplate {
  @scala.inline
  def apply[T](
    body: T,
    allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined,
    ccs_minimize_roundtrips: js.UndefOr[scala.Boolean] = js.undefined,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    expand_wildcards: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all = null,
    explain: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignore_throttled: js.UndefOr[scala.Boolean] = js.undefined,
    ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined,
    index: java.lang.String | js.Array[java.lang.String] = null,
    method: java.lang.String = null,
    preference: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    profile: js.UndefOr[scala.Boolean] = js.undefined,
    rest_total_hits_as_int: js.UndefOr[scala.Boolean] = js.undefined,
    routing: java.lang.String | js.Array[java.lang.String] = null,
    scroll: java.lang.String = null,
    search_type: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.query_then_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.query_and_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.dfs_query_then_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.dfs_query_and_fetch = null,
    source: java.lang.String = null,
    `type`: java.lang.String | js.Array[java.lang.String] = null,
    typed_keys: js.UndefOr[scala.Boolean] = js.undefined
  ): SearchTemplate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_no_indices)) __obj.updateDynamic("allow_no_indices")(allow_no_indices)
    if (!js.isUndefined(ccs_minimize_roundtrips)) __obj.updateDynamic("ccs_minimize_roundtrips")(ccs_minimize_roundtrips)
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

