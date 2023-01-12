package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var completion_fields: js.UndefOr[Fields] = js.undefined
  
  var fielddata_fields: js.UndefOr[Fields] = js.undefined
  
  var fields: js.UndefOr[Fields] = js.undefined
  
  var groups: js.UndefOr[Boolean] = js.undefined
  
  var include_segment_file_sizes: js.UndefOr[Boolean] = js.undefined
  
  var include_unloaded_segments: js.UndefOr[Boolean] = js.undefined
  
  var index_metric: js.UndefOr[Metrics] = js.undefined
  
  var level: js.UndefOr[Level] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var metric: js.UndefOr[Metrics] = js.undefined
  
  var node_id: js.UndefOr[NodeIds] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var types: js.UndefOr[js.Array[String]] = js.undefined
}
object NodesStatsRequest {
  
  inline def apply(): NodesStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesStatsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesStatsRequest] (val x: Self) extends AnyVal {
    
    inline def setCompletion_fields(value: Fields): Self = StObject.set(x, "completion_fields", value.asInstanceOf[js.Any])
    
    inline def setCompletion_fieldsUndefined: Self = StObject.set(x, "completion_fields", js.undefined)
    
    inline def setCompletion_fieldsVarargs(value: Field*): Self = StObject.set(x, "completion_fields", js.Array(value*))
    
    inline def setFielddata_fields(value: Fields): Self = StObject.set(x, "fielddata_fields", value.asInstanceOf[js.Any])
    
    inline def setFielddata_fieldsUndefined: Self = StObject.set(x, "fielddata_fields", js.undefined)
    
    inline def setFielddata_fieldsVarargs(value: Field*): Self = StObject.set(x, "fielddata_fields", js.Array(value*))
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setGroups(value: Boolean): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setInclude_segment_file_sizes(value: Boolean): Self = StObject.set(x, "include_segment_file_sizes", value.asInstanceOf[js.Any])
    
    inline def setInclude_segment_file_sizesUndefined: Self = StObject.set(x, "include_segment_file_sizes", js.undefined)
    
    inline def setInclude_unloaded_segments(value: Boolean): Self = StObject.set(x, "include_unloaded_segments", value.asInstanceOf[js.Any])
    
    inline def setInclude_unloaded_segmentsUndefined: Self = StObject.set(x, "include_unloaded_segments", js.undefined)
    
    inline def setIndex_metric(value: Metrics): Self = StObject.set(x, "index_metric", value.asInstanceOf[js.Any])
    
    inline def setIndex_metricUndefined: Self = StObject.set(x, "index_metric", js.undefined)
    
    inline def setIndex_metricVarargs(value: String*): Self = StObject.set(x, "index_metric", js.Array(value*))
    
    inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setMetric(value: Metrics): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value*))
    
    inline def setNode_id(value: NodeIds): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setNode_idVarargs(value: NodeId*): Self = StObject.set(x, "node_id", js.Array(value*))
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
