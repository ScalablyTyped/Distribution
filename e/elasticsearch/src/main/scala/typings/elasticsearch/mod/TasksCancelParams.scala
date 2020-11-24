package typings.elasticsearch.mod

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
  implicit class TasksCancelParamsOps[Self <: TasksCancelParams] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: NameList): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setNodeIdVarargs(value: String*): Self = this.set("nodeId", js.Array(value :_*))
    
    @scala.inline
    def setNodeId(value: NameList): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    
    @scala.inline
    def setParentNode(value: String): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentNode: Self = this.set("parentNode", js.undefined)
    
    @scala.inline
    def setParentTask(value: String): Self = this.set("parentTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentTask: Self = this.set("parentTask", js.undefined)
    
    @scala.inline
    def setTaskId(value: String): Self = this.set("taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskId: Self = this.set("taskId", js.undefined)
  }
}
