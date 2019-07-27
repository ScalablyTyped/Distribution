package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesStats extends Generic {
  var completion_fields: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var expand_wildcards: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all
  ] = js.undefined
  var fielddata_fields: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var fields: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var forbid_closed_indices: js.UndefOr[scala.Boolean] = js.undefined
  var groups: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var include_segment_file_sizes: js.UndefOr[scala.Boolean] = js.undefined
  var include_unloaded_segments: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var level: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.cluster | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.indices | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.shards
  ] = js.undefined
  var metric: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var types: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object IndicesStats {
  @scala.inline
  def apply(
    completion_fields: java.lang.String | js.Array[java.lang.String] = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    expand_wildcards: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all = null,
    fielddata_fields: java.lang.String | js.Array[java.lang.String] = null,
    fields: java.lang.String | js.Array[java.lang.String] = null,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    forbid_closed_indices: js.UndefOr[scala.Boolean] = js.undefined,
    groups: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    include_segment_file_sizes: js.UndefOr[scala.Boolean] = js.undefined,
    include_unloaded_segments: js.UndefOr[scala.Boolean] = js.undefined,
    index: java.lang.String | js.Array[java.lang.String] = null,
    level: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.cluster | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.indices | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.shards = null,
    method: java.lang.String = null,
    metric: java.lang.String | js.Array[java.lang.String] = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    types: java.lang.String | js.Array[java.lang.String] = null
  ): IndicesStats = {
    val __obj = js.Dynamic.literal()
    if (completion_fields != null) __obj.updateDynamic("completion_fields")(completion_fields.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (fielddata_fields != null) __obj.updateDynamic("fielddata_fields")(fielddata_fields.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(forbid_closed_indices)) __obj.updateDynamic("forbid_closed_indices")(forbid_closed_indices)
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(include_segment_file_sizes)) __obj.updateDynamic("include_segment_file_sizes")(include_segment_file_sizes)
    if (!js.isUndefined(include_unloaded_segments)) __obj.updateDynamic("include_unloaded_segments")(include_unloaded_segments)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStats]
  }
}

