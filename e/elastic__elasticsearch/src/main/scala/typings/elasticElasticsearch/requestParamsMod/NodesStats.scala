package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.indices
import typings.elasticElasticsearch.elasticElasticsearchStrings.node
import typings.elasticElasticsearch.elasticElasticsearchStrings.shards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesStats extends Generic {
  
  var completion_fields: js.UndefOr[String | js.Array[String]] = js.native
  
  var fielddata_fields: js.UndefOr[String | js.Array[String]] = js.native
  
  var fields: js.UndefOr[String | js.Array[String]] = js.native
  
  var groups: js.UndefOr[Boolean] = js.native
  
  var include_segment_file_sizes: js.UndefOr[Boolean] = js.native
  
  var index_metric: js.UndefOr[String | js.Array[String]] = js.native
  
  var level: js.UndefOr[indices | node | shards] = js.native
  
  var metric: js.UndefOr[String | js.Array[String]] = js.native
  
  var node_id: js.UndefOr[String | js.Array[String]] = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var types: js.UndefOr[String | js.Array[String]] = js.native
}
object NodesStats {
  
  @scala.inline
  def apply(): NodesStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesStats]
  }
  
  @scala.inline
  implicit class NodesStatsOps[Self <: NodesStats] (val x: Self) extends AnyVal {
    
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
    def setGroups(value: Boolean): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setInclude_segment_file_sizes(value: Boolean): Self = this.set("include_segment_file_sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_segment_file_sizes: Self = this.set("include_segment_file_sizes", js.undefined)
    
    @scala.inline
    def setIndex_metricVarargs(value: String*): Self = this.set("index_metric", js.Array(value :_*))
    
    @scala.inline
    def setIndex_metric(value: String | js.Array[String]): Self = this.set("index_metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex_metric: Self = this.set("index_metric", js.undefined)
    
    @scala.inline
    def setLevel(value: indices | node | shards): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMetricVarargs(value: String*): Self = this.set("metric", js.Array(value :_*))
    
    @scala.inline
    def setMetric(value: String | js.Array[String]): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    
    @scala.inline
    def setNode_idVarargs(value: String*): Self = this.set("node_id", js.Array(value :_*))
    
    @scala.inline
    def setNode_id(value: String | js.Array[String]): Self = this.set("node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode_id: Self = this.set("node_id", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: String | js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
