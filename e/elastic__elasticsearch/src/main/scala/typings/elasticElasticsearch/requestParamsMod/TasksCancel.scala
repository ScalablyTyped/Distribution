package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
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
  implicit class TasksCancelMutableBuilder[Self <: TasksCancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: String | js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: String | js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setParent_task_id(value: String): Self = StObject.set(x, "parent_task_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_task_idUndefined: Self = StObject.set(x, "parent_task_id", js.undefined)
    
    @scala.inline
    def setTask_id(value: String): Self = StObject.set(x, "task_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask_idUndefined: Self = StObject.set(x, "task_id", js.undefined)
    
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
