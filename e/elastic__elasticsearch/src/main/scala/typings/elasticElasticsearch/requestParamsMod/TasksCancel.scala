package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TasksCancel
  extends StObject
     with Generic {
  
  var actions: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var nodes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var parent_task_id: js.UndefOr[String] = js.undefined
  
  var task_id: js.UndefOr[String] = js.undefined
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object TasksCancel {
  
  inline def apply(): TasksCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksCancel]
  }
  
  extension [Self <: TasksCancel](x: Self) {
    
    inline def setActions(value: String | js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setNodes(value: String | js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setParent_task_id(value: String): Self = StObject.set(x, "parent_task_id", value.asInstanceOf[js.Any])
    
    inline def setParent_task_idUndefined: Self = StObject.set(x, "parent_task_id", js.undefined)
    
    inline def setTask_id(value: String): Self = StObject.set(x, "task_id", value.asInstanceOf[js.Any])
    
    inline def setTask_idUndefined: Self = StObject.set(x, "task_id", js.undefined)
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
