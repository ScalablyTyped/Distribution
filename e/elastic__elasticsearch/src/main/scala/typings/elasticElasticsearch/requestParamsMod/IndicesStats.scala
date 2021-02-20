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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IndicesStatsMutableBuilder[Self <: IndicesStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletion_fields(value: String | js.Array[String]): Self = StObject.set(x, "completion_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletion_fieldsUndefined: Self = StObject.set(x, "completion_fields", js.undefined)
    
    @scala.inline
    def setCompletion_fieldsVarargs(value: String*): Self = StObject.set(x, "completion_fields", js.Array(value :_*))
    
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
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
    def setForbid_closed_indices(value: Boolean): Self = StObject.set(x, "forbid_closed_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbid_closed_indicesUndefined: Self = StObject.set(x, "forbid_closed_indices", js.undefined)
    
    @scala.inline
    def setGroups(value: String | js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setInclude_segment_file_sizes(value: Boolean): Self = StObject.set(x, "include_segment_file_sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_segment_file_sizesUndefined: Self = StObject.set(x, "include_segment_file_sizes", js.undefined)
    
    @scala.inline
    def setInclude_unloaded_segments(value: Boolean): Self = StObject.set(x, "include_unloaded_segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_unloaded_segmentsUndefined: Self = StObject.set(x, "include_unloaded_segments", js.undefined)
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: cluster | indices | shards): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMetric(value: String | js.Array[String]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: String | js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
