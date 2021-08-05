package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.indices
import typings.elasticElasticsearch.elasticElasticsearchStrings.node
import typings.elasticElasticsearch.elasticElasticsearchStrings.shards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesStats
  extends StObject
     with Generic {
  
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
  
  inline def apply(): NodesStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesStats]
  }
  
  extension [Self <: NodesStats](x: Self) {
    
    inline def setCompletion_fields(value: String | js.Array[String]): Self = StObject.set(x, "completion_fields", value.asInstanceOf[js.Any])
    
    inline def setCompletion_fieldsUndefined: Self = StObject.set(x, "completion_fields", js.undefined)
    
    inline def setCompletion_fieldsVarargs(value: String*): Self = StObject.set(x, "completion_fields", js.Array(value :_*))
    
    inline def setFielddata_fields(value: String | js.Array[String]): Self = StObject.set(x, "fielddata_fields", value.asInstanceOf[js.Any])
    
    inline def setFielddata_fieldsUndefined: Self = StObject.set(x, "fielddata_fields", js.undefined)
    
    inline def setFielddata_fieldsVarargs(value: String*): Self = StObject.set(x, "fielddata_fields", js.Array(value :_*))
    
    inline def setFields(value: String | js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setGroups(value: Boolean): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setInclude_segment_file_sizes(value: Boolean): Self = StObject.set(x, "include_segment_file_sizes", value.asInstanceOf[js.Any])
    
    inline def setInclude_segment_file_sizesUndefined: Self = StObject.set(x, "include_segment_file_sizes", js.undefined)
    
    inline def setIndex_metric(value: String | js.Array[String]): Self = StObject.set(x, "index_metric", value.asInstanceOf[js.Any])
    
    inline def setIndex_metricUndefined: Self = StObject.set(x, "index_metric", js.undefined)
    
    inline def setIndex_metricVarargs(value: String*): Self = StObject.set(x, "index_metric", js.Array(value :_*))
    
    inline def setLevel(value: indices | node | shards): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMetric(value: String | js.Array[String]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value :_*))
    
    inline def setNode_id(value: String | js.Array[String]): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setNode_idVarargs(value: String*): Self = StObject.set(x, "node_id", js.Array(value :_*))
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTypes(value: String | js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
