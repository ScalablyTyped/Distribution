package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.cluster
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.indices
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import typings.elasticElasticsearch.elasticElasticsearchStrings.shards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesStats extends Generic {
  var completion_fields: js.UndefOr[String | js.Array[String]] = js.native
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.native
  var fielddata_fields: js.UndefOr[String | js.Array[String]] = js.native
  var fields: js.UndefOr[String | js.Array[String]] = js.native
  var forbid_closed_indices: js.UndefOr[Boolean] = js.native
  var groups: js.UndefOr[String | js.Array[String]] = js.native
  var include_segment_file_sizes: js.UndefOr[Boolean] = js.native
  var include_unloaded_segments: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[String | js.Array[String]] = js.native
  var level: js.UndefOr[cluster | indices | shards] = js.native
  var metric: js.UndefOr[String | js.Array[String]] = js.native
  var types: js.UndefOr[String | js.Array[String]] = js.native
}

object IndicesStats {
  @scala.inline
  def apply(): IndicesStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesStats]
  }
  @scala.inline
  implicit class IndicesStatsOps[Self <: IndicesStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompletion_fieldsVarargs(value: String*): Self = this.set("completion_fields", js.Array(value :_*))
    @scala.inline
    def setCompletion_fields(value: String | js.Array[String]): Self = this.set("completion_fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletion_fields: Self = this.set("completion_fields", js.undefined)
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = this.set("expand_wildcards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand_wildcards: Self = this.set("expand_wildcards", js.undefined)
    @scala.inline
    def setFielddata_fieldsVarargs(value: String*): Self = this.set("fielddata_fields", js.Array(value :_*))
    @scala.inline
    def setFielddata_fields(value: String | js.Array[String]): Self = this.set("fielddata_fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFielddata_fields: Self = this.set("fielddata_fields", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: String | js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setForbid_closed_indices(value: Boolean): Self = this.set("forbid_closed_indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForbid_closed_indices: Self = this.set("forbid_closed_indices", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: String | js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setInclude_segment_file_sizes(value: Boolean): Self = this.set("include_segment_file_sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_segment_file_sizes: Self = this.set("include_segment_file_sizes", js.undefined)
    @scala.inline
    def setInclude_unloaded_segments(value: Boolean): Self = this.set("include_unloaded_segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_unloaded_segments: Self = this.set("include_unloaded_segments", js.undefined)
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLevel(value: cluster | indices | shards): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMetricVarargs(value: String*): Self = this.set("metric", js.Array(value :_*))
    @scala.inline
    def setMetric(value: String | js.Array[String]): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: String | js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

