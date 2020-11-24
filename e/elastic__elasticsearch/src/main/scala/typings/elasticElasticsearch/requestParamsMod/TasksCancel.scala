package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TasksCancel extends Generic {
  
  var actions: js.UndefOr[String | js.Array[String]] = js.native
  
  var nodes: js.UndefOr[String | js.Array[String]] = js.native
  
  var parent_task_id: js.UndefOr[String] = js.native
  
  var task_id: js.UndefOr[String] = js.native
  
  var wait_for_completion: js.UndefOr[Boolean] = js.native
}
object TasksCancel {
  
  @scala.inline
  def apply(): TasksCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksCancel]
  }
  
  @scala.inline
  implicit class TasksCancelOps[Self <: TasksCancel] (val x: Self) extends AnyVal {
    
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
    def setActions(value: String | js.Array[String]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: String*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: String | js.Array[String]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    
    @scala.inline
    def setParent_task_id(value: String): Self = this.set("parent_task_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent_task_id: Self = this.set("parent_task_id", js.undefined)
    
    @scala.inline
    def setTask_id(value: String): Self = this.set("task_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTask_id: Self = this.set("task_id", js.undefined)
    
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = this.set("wait_for_completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait_for_completion: Self = this.set("wait_for_completion", js.undefined)
  }
}
