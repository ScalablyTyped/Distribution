package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count[T] extends Generic {
  var allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined
  var analyze_wildcard: js.UndefOr[scala.Boolean] = js.undefined
  var analyzer: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var default_operator: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.AND | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.OR
  ] = js.undefined
  var df: js.UndefOr[java.lang.String] = js.undefined
  var expand_wildcards: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all
  ] = js.undefined
  var ignore_throttled: js.UndefOr[scala.Boolean] = js.undefined
  var ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var lenient: js.UndefOr[scala.Boolean] = js.undefined
  var min_score: js.UndefOr[scala.Double] = js.undefined
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var q: js.UndefOr[java.lang.String] = js.undefined
  var routing: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var terminate_after: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Count {
  @scala.inline
  def apply[T](
    allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined,
    analyze_wildcard: js.UndefOr[scala.Boolean] = js.undefined,
    analyzer: java.lang.String = null,
    body: T = null,
    default_operator: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.AND | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.OR = null,
    df: java.lang.String = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    expand_wildcards: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all = null,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignore_throttled: js.UndefOr[scala.Boolean] = js.undefined,
    ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined,
    index: java.lang.String | js.Array[java.lang.String] = null,
    lenient: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    min_score: scala.Int | scala.Double = null,
    preference: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    q: java.lang.String = null,
    routing: java.lang.String | js.Array[java.lang.String] = null,
    source: java.lang.String = null,
    terminate_after: scala.Int | scala.Double = null,
    `type`: java.lang.String | js.Array[java.lang.String] = null
  ): Count[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_no_indices)) __obj.updateDynamic("allow_no_indices")(allow_no_indices)
    if (!js.isUndefined(analyze_wildcard)) __obj.updateDynamic("analyze_wildcard")(analyze_wildcard)
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (default_operator != null) __obj.updateDynamic("default_operator")(default_operator.asInstanceOf[js.Any])
    if (df != null) __obj.updateDynamic("df")(df)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_throttled)) __obj.updateDynamic("ignore_throttled")(ignore_throttled)
    if (!js.isUndefined(ignore_unavailable)) __obj.updateDynamic("ignore_unavailable")(ignore_unavailable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient)
    if (method != null) __obj.updateDynamic("method")(method)
    if (min_score != null) __obj.updateDynamic("min_score")(min_score.asInstanceOf[js.Any])
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (q != null) __obj.updateDynamic("q")(q)
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (terminate_after != null) __obj.updateDynamic("terminate_after")(terminate_after.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count[T]]
  }
}

