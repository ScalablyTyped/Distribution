package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.nodes
import typings.elasticsearch.elasticsearchStrings.parents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TasksListParams extends GenericParams {
  
  var actions: js.UndefOr[NameList] = js.native
  
  var detailed: js.UndefOr[Boolean] = js.native
  
  var groupBy: js.UndefOr[nodes | parents] = js.native
  
  var nodeId: js.UndefOr[NameList] = js.native
  
  var parentNode: js.UndefOr[String] = js.native
  
  var parentTask: js.UndefOr[String] = js.native
  
  var waitForCompletion: js.UndefOr[Boolean] = js.native
}
object TasksListParams {
  
  @scala.inline
  def apply(): TasksListParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksListParams]
  }
  
  @scala.inline
  implicit class TasksListParamsMutableBuilder[Self <: TasksListParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: NameList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    
    @scala.inline
    def setGroupBy(value: nodes | parents): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    @scala.inline
    def setNodeId(value: NameList): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    @scala.inline
    def setNodeIdVarargs(value: String*): Self = StObject.set(x, "nodeId", js.Array(value :_*))
    
    @scala.inline
    def setParentNode(value: String): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    @scala.inline
    def setParentTask(value: String): Self = StObject.set(x, "parentTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTaskUndefined: Self = StObject.set(x, "parentTask", js.undefined)
    
    @scala.inline
    def setWaitForCompletion(value: Boolean): Self = StObject.set(x, "waitForCompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForCompletionUndefined: Self = StObject.set(x, "waitForCompletion", js.undefined)
  }
}
