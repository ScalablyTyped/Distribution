package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var completion_fields: js.UndefOr[Fields] = js.undefined
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var fielddata_fields: js.UndefOr[Fields] = js.undefined
  
  var fields: js.UndefOr[Fields] = js.undefined
  
  var forbid_closed_indices: js.UndefOr[Boolean] = js.undefined
  
  var groups: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var include_segment_file_sizes: js.UndefOr[Boolean] = js.undefined
  
  var include_unloaded_segments: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Indices] = js.undefined
  
  var level: js.UndefOr[Level] = js.undefined
  
  var metric: js.UndefOr[Metrics] = js.undefined
}
object IndicesStatsRequest {
  
  inline def apply(): IndicesStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesStatsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesStatsRequest] (val x: Self) extends AnyVal {
    
    inline def setCompletion_fields(value: Fields): Self = StObject.set(x, "completion_fields", value.asInstanceOf[js.Any])
    
    inline def setCompletion_fieldsUndefined: Self = StObject.set(x, "completion_fields", js.undefined)
    
    inline def setCompletion_fieldsVarargs(value: Field*): Self = StObject.set(x, "completion_fields", js.Array(value*))
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setFielddata_fields(value: Fields): Self = StObject.set(x, "fielddata_fields", value.asInstanceOf[js.Any])
    
    inline def setFielddata_fieldsUndefined: Self = StObject.set(x, "fielddata_fields", js.undefined)
    
    inline def setFielddata_fieldsVarargs(value: Field*): Self = StObject.set(x, "fielddata_fields", js.Array(value*))
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setForbid_closed_indices(value: Boolean): Self = StObject.set(x, "forbid_closed_indices", value.asInstanceOf[js.Any])
    
    inline def setForbid_closed_indicesUndefined: Self = StObject.set(x, "forbid_closed_indices", js.undefined)
    
    inline def setGroups(value: String | js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setInclude_segment_file_sizes(value: Boolean): Self = StObject.set(x, "include_segment_file_sizes", value.asInstanceOf[js.Any])
    
    inline def setInclude_segment_file_sizesUndefined: Self = StObject.set(x, "include_segment_file_sizes", js.undefined)
    
    inline def setInclude_unloaded_segments(value: Boolean): Self = StObject.set(x, "include_unloaded_segments", value.asInstanceOf[js.Any])
    
    inline def setInclude_unloaded_segmentsUndefined: Self = StObject.set(x, "include_unloaded_segments", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMetric(value: Metrics): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value*))
  }
}
