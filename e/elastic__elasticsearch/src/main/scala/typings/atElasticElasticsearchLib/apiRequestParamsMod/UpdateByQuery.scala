package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateByQuery[T] extends Generic {
  var _source: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_exclude: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_excludes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_include: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_includes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined
  var analyze_wildcard: js.UndefOr[scala.Boolean] = js.undefined
  var analyzer: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var conflicts: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.abort | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.proceed
  ] = js.undefined
  var default_operator: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.AND | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.OR
  ] = js.undefined
  var df: js.UndefOr[java.lang.String] = js.undefined
  var expand_wildcards: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all
  ] = js.undefined
  var from: js.UndefOr[scala.Double] = js.undefined
  var ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: java.lang.String | js.Array[java.lang.String]
  var lenient: js.UndefOr[scala.Boolean] = js.undefined
  var pipeline: js.UndefOr[java.lang.String] = js.undefined
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var q: js.UndefOr[java.lang.String] = js.undefined
  var refresh: js.UndefOr[scala.Boolean] = js.undefined
  var request_cache: js.UndefOr[scala.Boolean] = js.undefined
  var requests_per_second: js.UndefOr[scala.Double] = js.undefined
  var routing: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var scroll: js.UndefOr[java.lang.String] = js.undefined
  var scroll_size: js.UndefOr[scala.Double] = js.undefined
  var search_timeout: js.UndefOr[java.lang.String] = js.undefined
  var search_type: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.query_then_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.dfs_query_then_fetch
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var slices: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var stats: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var terminate_after: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var version: js.UndefOr[scala.Boolean] = js.undefined
  var version_type: js.UndefOr[scala.Boolean] = js.undefined
  var wait_for_active_shards: js.UndefOr[java.lang.String] = js.undefined
  var wait_for_completion: js.UndefOr[scala.Boolean] = js.undefined
}

object UpdateByQuery {
  @scala.inline
  def apply[T](
    index: java.lang.String | js.Array[java.lang.String],
    _source: java.lang.String | js.Array[java.lang.String] = null,
    _source_exclude: java.lang.String | js.Array[java.lang.String] = null,
    _source_excludes: java.lang.String | js.Array[java.lang.String] = null,
    _source_include: java.lang.String | js.Array[java.lang.String] = null,
    _source_includes: java.lang.String | js.Array[java.lang.String] = null,
    allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined,
    analyze_wildcard: js.UndefOr[scala.Boolean] = js.undefined,
    analyzer: java.lang.String = null,
    body: T = null,
    conflicts: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.abort | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.proceed = null,
    default_operator: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.AND | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.OR = null,
    df: java.lang.String = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    expand_wildcards: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all = null,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    from: scala.Int | scala.Double = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined,
    lenient: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    pipeline: java.lang.String = null,
    preference: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    q: java.lang.String = null,
    refresh: js.UndefOr[scala.Boolean] = js.undefined,
    request_cache: js.UndefOr[scala.Boolean] = js.undefined,
    requests_per_second: scala.Int | scala.Double = null,
    routing: java.lang.String | js.Array[java.lang.String] = null,
    scroll: java.lang.String = null,
    scroll_size: scala.Int | scala.Double = null,
    search_timeout: java.lang.String = null,
    search_type: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.query_then_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.dfs_query_then_fetch = null,
    size: scala.Int | scala.Double = null,
    slices: scala.Int | scala.Double = null,
    sort: java.lang.String | js.Array[java.lang.String] = null,
    source: java.lang.String = null,
    stats: java.lang.String | js.Array[java.lang.String] = null,
    terminate_after: scala.Int | scala.Double = null,
    timeout: java.lang.String = null,
    `type`: java.lang.String | js.Array[java.lang.String] = null,
    version: js.UndefOr[scala.Boolean] = js.undefined,
    version_type: js.UndefOr[scala.Boolean] = js.undefined,
    wait_for_active_shards: java.lang.String = null,
    wait_for_completion: js.UndefOr[scala.Boolean] = js.undefined
  ): UpdateByQuery[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_source_exclude != null) __obj.updateDynamic("_source_exclude")(_source_exclude.asInstanceOf[js.Any])
    if (_source_excludes != null) __obj.updateDynamic("_source_excludes")(_source_excludes.asInstanceOf[js.Any])
    if (_source_include != null) __obj.updateDynamic("_source_include")(_source_include.asInstanceOf[js.Any])
    if (_source_includes != null) __obj.updateDynamic("_source_includes")(_source_includes.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_no_indices)) __obj.updateDynamic("allow_no_indices")(allow_no_indices)
    if (!js.isUndefined(analyze_wildcard)) __obj.updateDynamic("analyze_wildcard")(analyze_wildcard)
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (conflicts != null) __obj.updateDynamic("conflicts")(conflicts.asInstanceOf[js.Any])
    if (default_operator != null) __obj.updateDynamic("default_operator")(default_operator.asInstanceOf[js.Any])
    if (df != null) __obj.updateDynamic("df")(df)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_unavailable)) __obj.updateDynamic("ignore_unavailable")(ignore_unavailable)
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient)
    if (method != null) __obj.updateDynamic("method")(method)
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline)
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (q != null) __obj.updateDynamic("q")(q)
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh)
    if (!js.isUndefined(request_cache)) __obj.updateDynamic("request_cache")(request_cache)
    if (requests_per_second != null) __obj.updateDynamic("requests_per_second")(requests_per_second.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (scroll_size != null) __obj.updateDynamic("scroll_size")(scroll_size.asInstanceOf[js.Any])
    if (search_timeout != null) __obj.updateDynamic("search_timeout")(search_timeout)
    if (search_type != null) __obj.updateDynamic("search_type")(search_type.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (terminate_after != null) __obj.updateDynamic("terminate_after")(terminate_after.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(version_type)) __obj.updateDynamic("version_type")(version_type)
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards)
    if (!js.isUndefined(wait_for_completion)) __obj.updateDynamic("wait_for_completion")(wait_for_completion)
    __obj.asInstanceOf[UpdateByQuery[T]]
  }
}

