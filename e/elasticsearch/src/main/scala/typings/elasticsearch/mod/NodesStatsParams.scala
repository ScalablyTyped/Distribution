package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.indices
import typings.elasticsearch.elasticsearchStrings.node
import typings.elasticsearch.elasticsearchStrings.shards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesStatsParams
  extends StObject
     with GenericParams {
  
  var completionFields: js.UndefOr[NameList] = js.undefined
  
  var fielddataFields: js.UndefOr[NameList] = js.undefined
  
  var fields: js.UndefOr[NameList] = js.undefined
  
  var groups: js.UndefOr[Boolean] = js.undefined
  
  var human: js.UndefOr[Boolean] = js.undefined
  
  var indexMetric: js.UndefOr[NameList] = js.undefined
  
  var level: js.UndefOr[indices | node | shards] = js.undefined
  
  var metric: js.UndefOr[NameList] = js.undefined
  
  var nodeId: js.UndefOr[NameList] = js.undefined
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  
  var types: js.UndefOr[NameList] = js.undefined
}
object NodesStatsParams {
  
  @scala.inline
  def apply(): NodesStatsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesStatsParams]
  }
  
  @scala.inline
  implicit class NodesStatsParamsMutableBuilder[Self <: NodesStatsParams] (val x: Self) extends AnyVal {
    
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
    def setGroups(value: Boolean): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
    
    @scala.inline
    def setIndexMetric(value: NameList): Self = StObject.set(x, "indexMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexMetricUndefined: Self = StObject.set(x, "indexMetric", js.undefined)
    
    @scala.inline
    def setIndexMetricVarargs(value: String*): Self = StObject.set(x, "indexMetric", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: indices | node | shards): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMetric(value: NameList): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value :_*))
    
    @scala.inline
    def setNodeId(value: NameList): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    @scala.inline
    def setNodeIdVarargs(value: String*): Self = StObject.set(x, "nodeId", js.Array(value :_*))
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTypes(value: NameList): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
