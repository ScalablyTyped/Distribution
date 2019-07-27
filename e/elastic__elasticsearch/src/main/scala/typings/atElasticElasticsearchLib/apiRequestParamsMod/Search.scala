package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Search[T] extends Generic {
  var _source: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_exclude: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_excludes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_include: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_includes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined
  var allow_partial_search_results: js.UndefOr[scala.Boolean] = js.undefined
  var analyze_wildcard: js.UndefOr[scala.Boolean] = js.undefined
  var analyzer: js.UndefOr[java.lang.String] = js.undefined
  var batched_reduce_size: js.UndefOr[scala.Double] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var ccs_minimize_roundtrips: js.UndefOr[scala.Boolean] = js.undefined
  var default_operator: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.AND | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.OR
  ] = js.undefined
  var df: js.UndefOr[java.lang.String] = js.undefined
  var docvalue_fields: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var expand_wildcards: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all
  ] = js.undefined
  var explain: js.UndefOr[scala.Boolean] = js.undefined
  var from: js.UndefOr[scala.Double] = js.undefined
  var ignore_throttled: js.UndefOr[scala.Boolean] = js.undefined
  var ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var lenient: js.UndefOr[scala.Boolean] = js.undefined
  var max_concurrent_shard_requests: js.UndefOr[scala.Double] = js.undefined
  var pre_filter_shard_size: js.UndefOr[scala.Double] = js.undefined
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var q: js.UndefOr[java.lang.String] = js.undefined
  var request_cache: js.UndefOr[scala.Boolean] = js.undefined
  var rest_total_hits_as_int: js.UndefOr[scala.Boolean] = js.undefined
  var routing: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var scroll: js.UndefOr[java.lang.String] = js.undefined
  var search_type: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.query_then_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.dfs_query_then_fetch
  ] = js.undefined
  var seq_no_primary_term: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var stats: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var stored_fields: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var suggest_field: js.UndefOr[java.lang.String] = js.undefined
  var suggest_mode: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.missing | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.popular | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.always
  ] = js.undefined
  var suggest_size: js.UndefOr[scala.Double] = js.undefined
  var suggest_text: js.UndefOr[java.lang.String] = js.undefined
  var terminate_after: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[java.lang.String] = js.undefined
  var track_scores: js.UndefOr[scala.Boolean] = js.undefined
  var track_total_hits: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var typed_keys: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[scala.Boolean] = js.undefined
}

object Search {
  @scala.inline
  def apply[T](
    _source: java.lang.String | js.Array[java.lang.String] = null,
    _source_exclude: java.lang.String | js.Array[java.lang.String] = null,
    _source_excludes: java.lang.String | js.Array[java.lang.String] = null,
    _source_include: java.lang.String | js.Array[java.lang.String] = null,
    _source_includes: java.lang.String | js.Array[java.lang.String] = null,
    allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined,
    allow_partial_search_results: js.UndefOr[scala.Boolean] = js.undefined,
    analyze_wildcard: js.UndefOr[scala.Boolean] = js.undefined,
    analyzer: java.lang.String = null,
    batched_reduce_size: scala.Int | scala.Double = null,
    body: T = null,
    ccs_minimize_roundtrips: js.UndefOr[scala.Boolean] = js.undefined,
    default_operator: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.AND | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.OR = null,
    df: java.lang.String = null,
    docvalue_fields: java.lang.String | js.Array[java.lang.String] = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    expand_wildcards: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all = null,
    explain: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    from: scala.Int | scala.Double = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignore_throttled: js.UndefOr[scala.Boolean] = js.undefined,
    ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined,
    index: java.lang.String | js.Array[java.lang.String] = null,
    lenient: js.UndefOr[scala.Boolean] = js.undefined,
    max_concurrent_shard_requests: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    pre_filter_shard_size: scala.Int | scala.Double = null,
    preference: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    q: java.lang.String = null,
    request_cache: js.UndefOr[scala.Boolean] = js.undefined,
    rest_total_hits_as_int: js.UndefOr[scala.Boolean] = js.undefined,
    routing: java.lang.String | js.Array[java.lang.String] = null,
    scroll: java.lang.String = null,
    search_type: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.query_then_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.dfs_query_then_fetch = null,
    seq_no_primary_term: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    sort: java.lang.String | js.Array[java.lang.String] = null,
    source: java.lang.String = null,
    stats: java.lang.String | js.Array[java.lang.String] = null,
    stored_fields: java.lang.String | js.Array[java.lang.String] = null,
    suggest_field: java.lang.String = null,
    suggest_mode: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.missing | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.popular | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.always = null,
    suggest_size: scala.Int | scala.Double = null,
    suggest_text: java.lang.String = null,
    terminate_after: scala.Int | scala.Double = null,
    timeout: java.lang.String = null,
    track_scores: js.UndefOr[scala.Boolean] = js.undefined,
    track_total_hits: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String | js.Array[java.lang.String] = null,
    typed_keys: js.UndefOr[scala.Boolean] = js.undefined,
    version: js.UndefOr[scala.Boolean] = js.undefined
  ): Search[T] = {
    val __obj = js.Dynamic.literal()
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_source_exclude != null) __obj.updateDynamic("_source_exclude")(_source_exclude.asInstanceOf[js.Any])
    if (_source_excludes != null) __obj.updateDynamic("_source_excludes")(_source_excludes.asInstanceOf[js.Any])
    if (_source_include != null) __obj.updateDynamic("_source_include")(_source_include.asInstanceOf[js.Any])
    if (_source_includes != null) __obj.updateDynamic("_source_includes")(_source_includes.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_no_indices)) __obj.updateDynamic("allow_no_indices")(allow_no_indices)
    if (!js.isUndefined(allow_partial_search_results)) __obj.updateDynamic("allow_partial_search_results")(allow_partial_search_results)
    if (!js.isUndefined(analyze_wildcard)) __obj.updateDynamic("analyze_wildcard")(analyze_wildcard)
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer)
    if (batched_reduce_size != null) __obj.updateDynamic("batched_reduce_size")(batched_reduce_size.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(ccs_minimize_roundtrips)) __obj.updateDynamic("ccs_minimize_roundtrips")(ccs_minimize_roundtrips)
    if (default_operator != null) __obj.updateDynamic("default_operator")(default_operator.asInstanceOf[js.Any])
    if (df != null) __obj.updateDynamic("df")(df)
    if (docvalue_fields != null) __obj.updateDynamic("docvalue_fields")(docvalue_fields.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_throttled)) __obj.updateDynamic("ignore_throttled")(ignore_throttled)
    if (!js.isUndefined(ignore_unavailable)) __obj.updateDynamic("ignore_unavailable")(ignore_unavailable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient)
    if (max_concurrent_shard_requests != null) __obj.updateDynamic("max_concurrent_shard_requests")(max_concurrent_shard_requests.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (pre_filter_shard_size != null) __obj.updateDynamic("pre_filter_shard_size")(pre_filter_shard_size.asInstanceOf[js.Any])
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (q != null) __obj.updateDynamic("q")(q)
    if (!js.isUndefined(request_cache)) __obj.updateDynamic("request_cache")(request_cache)
    if (!js.isUndefined(rest_total_hits_as_int)) __obj.updateDynamic("rest_total_hits_as_int")(rest_total_hits_as_int)
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (search_type != null) __obj.updateDynamic("search_type")(search_type.asInstanceOf[js.Any])
    if (!js.isUndefined(seq_no_primary_term)) __obj.updateDynamic("seq_no_primary_term")(seq_no_primary_term)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (stored_fields != null) __obj.updateDynamic("stored_fields")(stored_fields.asInstanceOf[js.Any])
    if (suggest_field != null) __obj.updateDynamic("suggest_field")(suggest_field)
    if (suggest_mode != null) __obj.updateDynamic("suggest_mode")(suggest_mode.asInstanceOf[js.Any])
    if (suggest_size != null) __obj.updateDynamic("suggest_size")(suggest_size.asInstanceOf[js.Any])
    if (suggest_text != null) __obj.updateDynamic("suggest_text")(suggest_text)
    if (terminate_after != null) __obj.updateDynamic("terminate_after")(terminate_after.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (!js.isUndefined(track_scores)) __obj.updateDynamic("track_scores")(track_scores)
    if (!js.isUndefined(track_total_hits)) __obj.updateDynamic("track_total_hits")(track_total_hits)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(typed_keys)) __obj.updateDynamic("typed_keys")(typed_keys)
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Search[T]]
  }
}

