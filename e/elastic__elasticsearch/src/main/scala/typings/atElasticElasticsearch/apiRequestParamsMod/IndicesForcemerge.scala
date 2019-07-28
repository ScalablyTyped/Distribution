package typings.atElasticElasticsearch.apiRequestParamsMod

import typings.atElasticElasticsearch.atElasticElasticsearchStrings.all
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.closed
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.none
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesForcemerge extends Generic {
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  var expand_wildcards: js.UndefOr[open | closed | none | all] = js.undefined
  var flush: js.UndefOr[Boolean] = js.undefined
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  var max_num_segments: js.UndefOr[Double] = js.undefined
  var only_expunge_deletes: js.UndefOr[Boolean] = js.undefined
}

object IndicesForcemerge {
  @scala.inline
  def apply(
    allow_no_indices: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    expand_wildcards: open | closed | none | all = null,
    filter_path: String | js.Array[String] = null,
    flush: js.UndefOr[Boolean] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    ignore_unavailable: js.UndefOr[Boolean] = js.undefined,
    index: String | js.Array[String] = null,
    max_num_segments: Int | Double = null,
    method: String = null,
    only_expunge_deletes: js.UndefOr[Boolean] = js.undefined,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null
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

