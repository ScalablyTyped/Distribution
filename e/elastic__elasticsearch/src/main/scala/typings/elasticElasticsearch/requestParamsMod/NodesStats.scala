package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.indices
import typings.elasticElasticsearch.elasticElasticsearchStrings.node
import typings.elasticElasticsearch.elasticElasticsearchStrings.shards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesStats extends Generic {
  var completion_fields: js.UndefOr[String | js.Array[String]] = js.undefined
  var fielddata_fields: js.UndefOr[String | js.Array[String]] = js.undefined
  var fields: js.UndefOr[String | js.Array[String]] = js.undefined
  var groups: js.UndefOr[Boolean] = js.undefined
  var include_segment_file_sizes: js.UndefOr[Boolean] = js.undefined
  var index_metric: js.UndefOr[String | js.Array[String]] = js.undefined
  var level: js.UndefOr[indices | node | shards] = js.undefined
  var metric: js.UndefOr[String | js.Array[String]] = js.undefined
  var node_id: js.UndefOr[String | js.Array[String]] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
  var types: js.UndefOr[String | js.Array[String]] = js.undefined
}

object NodesStats {
  @scala.inline
  def apply(
    completion_fields: String | js.Array[String] = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    fielddata_fields: String | js.Array[String] = null,
    fields: String | js.Array[String] = null,
    filter_path: String | js.Array[String] = null,
    groups: js.UndefOr[Boolean] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    include_segment_file_sizes: js.UndefOr[Boolean] = js.undefined,
    index_metric: String | js.Array[String] = null,
    level: indices | node | shards = null,
    method: String = null,
    metric: String | js.Array[String] = null,
    node_id: String | js.Array[String] = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    timeout: String = null,
    types: String | js.Array[String] = null
  ): NodesStats = {
    val __obj = js.Dynamic.literal()
    if (completion_fields != null) __obj.updateDynamic("completion_fields")(completion_fields.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (fielddata_fields != null) __obj.updateDynamic("fielddata_fields")(fielddata_fields.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(groups)) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(include_segment_file_sizes)) __obj.updateDynamic("include_segment_file_sizes")(include_segment_file_sizes.asInstanceOf[js.Any])
    if (index_metric != null) __obj.updateDynamic("index_metric")(index_metric.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (node_id != null) __obj.updateDynamic("node_id")(node_id.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesStats]
  }
}

