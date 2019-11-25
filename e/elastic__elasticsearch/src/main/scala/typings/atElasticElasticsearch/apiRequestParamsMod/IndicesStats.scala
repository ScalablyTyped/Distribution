package typings.atElasticElasticsearch.apiRequestParamsMod

import typings.atElasticElasticsearch.atElasticElasticsearchStrings.all
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.closed
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.cluster
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.indices
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.none
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.open
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.shards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesStats extends Generic {
  var completion_fields: js.UndefOr[String | js.Array[String]] = js.undefined
  var expand_wildcards: js.UndefOr[open | closed | none | all] = js.undefined
  var fielddata_fields: js.UndefOr[String | js.Array[String]] = js.undefined
  var fields: js.UndefOr[String | js.Array[String]] = js.undefined
  var forbid_closed_indices: js.UndefOr[Boolean] = js.undefined
  var groups: js.UndefOr[String | js.Array[String]] = js.undefined
  var include_segment_file_sizes: js.UndefOr[Boolean] = js.undefined
  var include_unloaded_segments: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  var level: js.UndefOr[cluster | indices | shards] = js.undefined
  var metric: js.UndefOr[String | js.Array[String]] = js.undefined
  var types: js.UndefOr[String | js.Array[String]] = js.undefined
}

object IndicesStats {
  @scala.inline
  def apply(
    completion_fields: String | js.Array[String] = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    expand_wildcards: open | closed | none | all = null,
    fielddata_fields: String | js.Array[String] = null,
    fields: String | js.Array[String] = null,
    filter_path: String | js.Array[String] = null,
    forbid_closed_indices: js.UndefOr[Boolean] = js.undefined,
    groups: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    include_segment_file_sizes: js.UndefOr[Boolean] = js.undefined,
    include_unloaded_segments: js.UndefOr[Boolean] = js.undefined,
    index: String | js.Array[String] = null,
    level: cluster | indices | shards = null,
    method: String = null,
    metric: String | js.Array[String] = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    types: String | js.Array[String] = null
  ): IndicesStats = {
    val __obj = js.Dynamic.literal()
    if (completion_fields != null) __obj.updateDynamic("completion_fields")(completion_fields.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (fielddata_fields != null) __obj.updateDynamic("fielddata_fields")(fielddata_fields.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(forbid_closed_indices)) __obj.updateDynamic("forbid_closed_indices")(forbid_closed_indices.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(include_segment_file_sizes)) __obj.updateDynamic("include_segment_file_sizes")(include_segment_file_sizes.asInstanceOf[js.Any])
    if (!js.isUndefined(include_unloaded_segments)) __obj.updateDynamic("include_unloaded_segments")(include_unloaded_segments.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStats]
  }
}

