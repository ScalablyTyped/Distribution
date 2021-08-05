package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.cluster
import typings.elasticsearch.elasticsearchStrings.indices
import typings.elasticsearch.elasticsearchStrings.shards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsParams
  extends StObject
     with GenericParams {
  
  var completionFields: js.UndefOr[NameList] = js.undefined
  
  var fielddataFields: js.UndefOr[NameList] = js.undefined
  
  var fields: js.UndefOr[NameList] = js.undefined
  
  var groups: js.UndefOr[NameList] = js.undefined
  
  var human: js.UndefOr[Boolean] = js.undefined
  
  var index: NameList
  
  var level: js.UndefOr[cluster | indices | shards] = js.undefined
  
  var metric: js.UndefOr[NameList] = js.undefined
  
  var types: js.UndefOr[NameList] = js.undefined
}
object IndicesStatsParams {
  
  inline def apply(index: NameList): IndicesStatsParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsParams]
  }
  
  extension [Self <: IndicesStatsParams](x: Self) {
    
    inline def setCompletionFields(value: NameList): Self = StObject.set(x, "completionFields", value.asInstanceOf[js.Any])
    
    inline def setCompletionFieldsUndefined: Self = StObject.set(x, "completionFields", js.undefined)
    
    inline def setCompletionFieldsVarargs(value: String*): Self = StObject.set(x, "completionFields", js.Array(value :_*))
    
    inline def setFielddataFields(value: NameList): Self = StObject.set(x, "fielddataFields", value.asInstanceOf[js.Any])
    
    inline def setFielddataFieldsUndefined: Self = StObject.set(x, "fielddataFields", js.undefined)
    
    inline def setFielddataFieldsVarargs(value: String*): Self = StObject.set(x, "fielddataFields", js.Array(value :_*))
    
    inline def setFields(value: NameList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setGroups(value: NameList): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    inline def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    inline def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
    
    inline def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    inline def setLevel(value: cluster | indices | shards): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMetric(value: NameList): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value :_*))
    
    inline def setTypes(value: NameList): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
