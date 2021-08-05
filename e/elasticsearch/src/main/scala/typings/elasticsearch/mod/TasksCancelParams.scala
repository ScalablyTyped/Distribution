package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TasksCancelParams
  extends StObject
     with GenericParams {
  
  var actions: js.UndefOr[NameList] = js.undefined
  
  var nodeId: js.UndefOr[NameList] = js.undefined
  
  var parentNode: js.UndefOr[String] = js.undefined
  
  var parentTask: js.UndefOr[String] = js.undefined
  
  var taskId: js.UndefOr[String] = js.undefined
}
object TasksCancelParams {
  
  inline def apply(): TasksCancelParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksCancelParams]
  }
  
  extension [Self <: TasksCancelParams](x: Self) {
    
    inline def setActions(value: NameList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setNodeId(value: NameList): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setNodeIdVarargs(value: String*): Self = StObject.set(x, "nodeId", js.Array(value :_*))
    
    inline def setParentNode(value: String): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    inline def setParentTask(value: String): Self = StObject.set(x, "parentTask", value.asInstanceOf[js.Any])
    
    inline def setParentTaskUndefined: Self = StObject.set(x, "parentTask", js.undefined)
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
