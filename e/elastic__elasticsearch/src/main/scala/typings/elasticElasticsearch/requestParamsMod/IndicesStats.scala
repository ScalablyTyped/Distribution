package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.cluster
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.indices
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import typings.elasticElasticsearch.elasticElasticsearchStrings.shards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStats
  extends StObject
     with Generic {
  
  var completion_fields: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.undefined
  
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
  
  inline def apply(): IndicesStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesStats]
  }
  
  extension [Self <: IndicesStats](x: Self) {
    
    inline def setCompletion_fields(value: String | js.Array[String]): Self = StObject.set(x, "completion_fields", value.asInstanceOf[js.Any])
    
    inline def setCompletion_fieldsUndefined: Self = StObject.set(x, "completion_fields", js.undefined)
    
    inline def setCompletion_fieldsVarargs(value: String*): Self = StObject.set(x, "completion_fields", js.Array(value :_*))
    
    inline def setExpand_wildcards(value: open | closed | hidden | none | all): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setFielddata_fields(value: String | js.Array[String]): Self = StObject.set(x, "fielddata_fields", value.asInstanceOf[js.Any])
    
    inline def setFielddata_fieldsUndefined: Self = StObject.set(x, "fielddata_fields", js.undefined)
    
    inline def setFielddata_fieldsVarargs(value: String*): Self = StObject.set(x, "fielddata_fields", js.Array(value :_*))
    
    inline def setFields(value: String | js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setForbid_closed_indices(value: Boolean): Self = StObject.set(x, "forbid_closed_indices", value.asInstanceOf[js.Any])
    
    inline def setForbid_closed_indicesUndefined: Self = StObject.set(x, "forbid_closed_indices", js.undefined)
    
    inline def setGroups(value: String | js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    inline def setInclude_segment_file_sizes(value: Boolean): Self = StObject.set(x, "include_segment_file_sizes", value.asInstanceOf[js.Any])
    
    inline def setInclude_segment_file_sizesUndefined: Self = StObject.set(x, "include_segment_file_sizes", js.undefined)
    
    inline def setInclude_unloaded_segments(value: Boolean): Self = StObject.set(x, "include_unloaded_segments", value.asInstanceOf[js.Any])
    
    inline def setInclude_unloaded_segmentsUndefined: Self = StObject.set(x, "include_unloaded_segments", js.undefined)
    
    inline def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    inline def setLevel(value: cluster | indices | shards): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMetric(value: String | js.Array[String]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value :_*))
    
    inline def setTypes(value: String | js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
