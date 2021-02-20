package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TasksCancelParams extends GenericParams {
  
  var actions: js.UndefOr[NameList] = js.native
  
  var nodeId: js.UndefOr[NameList] = js.native
  
  var parentNode: js.UndefOr[String] = js.native
  
  var parentTask: js.UndefOr[String] = js.native
  
  var taskId: js.UndefOr[String] = js.native
}
object TasksCancelParams {
  
  @scala.inline
  def apply(): TasksCancelParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksCancelParams]
  }
  
  @scala.inline
  implicit class TasksCancelParamsMutableBuilder[Self <: TasksCancelParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: NameList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
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
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
