package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.indices
import typings.elasticElasticsearch.elasticElasticsearchStrings.node
import typings.elasticElasticsearch.elasticElasticsearchStrings.shards
import org.scalablytyped.runtime.StObject
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
  implicit class NodesStatsMutableBuilder[Self <: NodesStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletion_fields(value: String | js.Array[String]): Self = StObject.set(x, "completion_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletion_fieldsUndefined: Self = StObject.set(x, "completion_fields", js.undefined)
    
    @scala.inline
    def setCompletion_fieldsVarargs(value: String*): Self = StObject.set(x, "completion_fields", js.Array(value :_*))
    
    @scala.inline
    def setFielddata_fields(value: String | js.Array[String]): Self = StObject.set(x, "fielddata_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFielddata_fieldsUndefined: Self = StObject.set(x, "fielddata_fields", js.undefined)
    
    @scala.inline
    def setFielddata_fieldsVarargs(value: String*): Self = StObject.set(x, "fielddata_fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: String | js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: Boolean): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setInclude_segment_file_sizes(value: Boolean): Self = StObject.set(x, "include_segment_file_sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_segment_file_sizesUndefined: Self = StObject.set(x, "include_segment_file_sizes", js.undefined)
    
    @scala.inline
    def setIndex_metric(value: String | js.Array[String]): Self = StObject.set(x, "index_metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex_metricUndefined: Self = StObject.set(x, "index_metric", js.undefined)
    
    @scala.inline
    def setIndex_metricVarargs(value: String*): Self = StObject.set(x, "index_metric", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: indices | node | shards): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMetric(value: String | js.Array[String]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value :_*))
    
    @scala.inline
    def setNode_id(value: String | js.Array[String]): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    @scala.inline
    def setNode_idVarargs(value: String*): Self = StObject.set(x, "node_id", js.Array(value :_*))
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTypes(value: String | js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
