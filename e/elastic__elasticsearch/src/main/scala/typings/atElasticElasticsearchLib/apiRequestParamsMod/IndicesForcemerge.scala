package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesForcemerge extends Generic {
  var allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined
  var expand_wildcards: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all
  ] = js.undefined
  var flush: js.UndefOr[scala.Boolean] = js.undefined
  var ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var max_num_segments: js.UndefOr[scala.Double] = js.undefined
  var only_expunge_deletes: js.UndefOr[scala.Boolean] = js.undefined
}

object IndicesForcemerge {
  @scala.inline
  def apply(
    allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    expand_wildcards: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all = null,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    flush: js.UndefOr[scala.Boolean] = js.undefined,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined,
    index: java.lang.String | js.Array[java.lang.String] = null,
    max_num_segments: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    only_expunge_deletes: js.UndefOr[scala.Boolean] = js.undefined,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null
  ): IndicesForcemerge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_no_indices)) __obj.updateDynamic("allow_no_indices")(allow_no_indices)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(flush)) __obj.updateDynamic("flush")(flush)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_unavailable)) __obj.updateDynamic("ignore_unavailable")(ignore_unavailable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (max_num_segments != null) __obj.updateDynamic("max_num_segments")(max_num_segments.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(only_expunge_deletes)) __obj.updateDynamic("only_expunge_deletes")(only_expunge_deletes)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[IndicesForcemerge]
  }
}

