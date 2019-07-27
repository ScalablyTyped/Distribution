package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesStats extends Generic {
  var completion_fields: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var fielddata_fields: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var fields: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var groups: js.UndefOr[scala.Boolean] = js.undefined
  var include_segment_file_sizes: js.UndefOr[scala.Boolean] = js.undefined
  var index_metric: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var level: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.indices | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.node | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.shards
  ] = js.undefined
  var metric: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var node_id: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var timeout: js.UndefOr[java.lang.String] = js.undefined
  var types: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object NodesStats {
  @scala.inline
  def apply(
    completion_fields: java.lang.String | js.Array[java.lang.String] = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    fielddata_fields: java.lang.String | js.Array[java.lang.String] = null,
    fields: java.lang.String | js.Array[java.lang.String] = null,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    groups: js.UndefOr[scala.Boolean] = js.undefined,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    include_segment_file_sizes: js.UndefOr[scala.Boolean] = js.undefined,
    index_metric: java.lang.String | js.Array[java.lang.String] = null,
    level: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.indices | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.node | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.shards = null,
    method: java.lang.String = null,
    metric: java.lang.String | js.Array[java.lang.String] = null,
    node_id: java.lang.String | js.Array[java.lang.String] = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    timeout: java.lang.String = null,
    types: java.lang.String | js.Array[java.lang.String] = null
  ): NodesStats = {
    val __obj = js.Dynamic.literal()
    if (completion_fields != null) __obj.updateDynamic("completion_fields")(completion_fields.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (fielddata_fields != null) __obj.updateDynamic("fielddata_fields")(fielddata_fields.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(groups)) __obj.updateDynamic("groups")(groups)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(include_segment_file_sizes)) __obj.updateDynamic("include_segment_file_sizes")(include_segment_file_sizes)
    if (index_metric != null) __obj.updateDynamic("index_metric")(index_metric.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (node_id != null) __obj.updateDynamic("node_id")(node_id.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesStats]
  }
}

