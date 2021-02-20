package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.cluster
import typings.elasticsearch.elasticsearchStrings.indices
import typings.elasticsearch.elasticsearchStrings.shards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesStatsParams extends GenericParams {
  
  var completionFields: js.UndefOr[NameList] = js.native
  
  var fielddataFields: js.UndefOr[NameList] = js.native
  
  var fields: js.UndefOr[NameList] = js.native
  
  var groups: js.UndefOr[NameList] = js.native
  
  var human: js.UndefOr[Boolean] = js.native
  
  var index: NameList = js.native
  
  var level: js.UndefOr[cluster | indices | shards] = js.native
  
  var metric: js.UndefOr[NameList] = js.native
  
  var types: js.UndefOr[NameList] = js.native
}
object IndicesStatsParams {
  
  @scala.inline
  def apply(index: NameList): IndicesStatsParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsParams]
  }
  
  @scala.inline
  implicit class IndicesStatsParamsMutableBuilder[Self <: IndicesStatsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionFields(value: NameList): Self = StObject.set(x, "completionFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionFieldsUndefined: Self = StObject.set(x, "completionFields", js.undefined)
    
    @scala.inline
    def setCompletionFieldsVarargs(value: String*): Self = StObject.set(x, "completionFields", js.Array(value :_*))
    
    @scala.inline
    def setFielddataFields(value: NameList): Self = StObject.set(x, "fielddataFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFielddataFieldsUndefined: Self = StObject.set(x, "fielddataFields", js.undefined)
    
    @scala.inline
    def setFielddataFieldsVarargs(value: String*): Self = StObject.set(x, "fielddataFields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: NameList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: NameList): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: cluster | indices | shards): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMetric(value: NameList): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: NameList): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
