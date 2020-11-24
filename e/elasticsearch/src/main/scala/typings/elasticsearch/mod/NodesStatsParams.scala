package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.indices
import typings.elasticsearch.elasticsearchStrings.node
import typings.elasticsearch.elasticsearchStrings.shards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesStatsParams extends GenericParams {
  
  var completionFields: js.UndefOr[NameList] = js.native
  
  var fielddataFields: js.UndefOr[NameList] = js.native
  
  var fields: js.UndefOr[NameList] = js.native
  
  var groups: js.UndefOr[Boolean] = js.native
  
  var human: js.UndefOr[Boolean] = js.native
  
  var indexMetric: js.UndefOr[NameList] = js.native
  
  var level: js.UndefOr[indices | node | shards] = js.native
  
  var metric: js.UndefOr[NameList] = js.native
  
  var nodeId: js.UndefOr[NameList] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
  
  var types: js.UndefOr[NameList] = js.native
}
object NodesStatsParams {
  
  @scala.inline
  def apply(): NodesStatsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesStatsParams]
  }
  
  @scala.inline
  implicit class NodesStatsParamsOps[Self <: NodesStatsParams] (val x: Self) extends AnyVal {
    
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
    def setCompletionFieldsVarargs(value: String*): Self = this.set("completionFields", js.Array(value :_*))
    
    @scala.inline
    def setCompletionFields(value: NameList): Self = this.set("completionFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionFields: Self = this.set("completionFields", js.undefined)
    
    @scala.inline
    def setFielddataFieldsVarargs(value: String*): Self = this.set("fielddataFields", js.Array(value :_*))
    
    @scala.inline
    def setFielddataFields(value: NameList): Self = this.set("fielddataFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFielddataFields: Self = this.set("fielddataFields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: NameList): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setGroups(value: Boolean): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setHuman(value: Boolean): Self = this.set("human", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHuman: Self = this.set("human", js.undefined)
    
    @scala.inline
    def setIndexMetricVarargs(value: String*): Self = this.set("indexMetric", js.Array(value :_*))
    
    @scala.inline
    def setIndexMetric(value: NameList): Self = this.set("indexMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexMetric: Self = this.set("indexMetric", js.undefined)
    
    @scala.inline
    def setLevel(value: indices | node | shards): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMetricVarargs(value: String*): Self = this.set("metric", js.Array(value :_*))
    
    @scala.inline
    def setMetric(value: NameList): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    
    @scala.inline
    def setNodeIdVarargs(value: String*): Self = this.set("nodeId", js.Array(value :_*))
    
    @scala.inline
    def setNodeId(value: NameList): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: NameList): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
