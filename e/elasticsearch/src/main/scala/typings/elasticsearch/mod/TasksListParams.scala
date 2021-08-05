package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.nodes
import typings.elasticsearch.elasticsearchStrings.parents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TasksListParams
  extends StObject
     with GenericParams {
  
  var actions: js.UndefOr[NameList] = js.undefined
  
  var detailed: js.UndefOr[Boolean] = js.undefined
  
  var groupBy: js.UndefOr[nodes | parents] = js.undefined
  
  var nodeId: js.UndefOr[NameList] = js.undefined
  
  var parentNode: js.UndefOr[String] = js.undefined
  
  var parentTask: js.UndefOr[String] = js.undefined
  
  var waitForCompletion: js.UndefOr[Boolean] = js.undefined
}
object TasksListParams {
  
  inline def apply(): TasksListParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksListParams]
  }
  
  extension [Self <: TasksListParams](x: Self) {
    
    inline def setActions(value: NameList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    
    inline def setGroupBy(value: nodes | parents): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    inline def setNodeId(value: NameList): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setNodeIdVarargs(value: String*): Self = StObject.set(x, "nodeId", js.Array(value :_*))
    
    inline def setParentNode(value: String): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    inline def setParentTask(value: String): Self = StObject.set(x, "parentTask", value.asInstanceOf[js.Any])
    
    inline def setParentTaskUndefined: Self = StObject.set(x, "parentTask", js.undefined)
    
    inline def setWaitForCompletion(value: Boolean): Self = StObject.set(x, "waitForCompletion", value.asInstanceOf[js.Any])
    
    inline def setWaitForCompletionUndefined: Self = StObject.set(x, "waitForCompletion", js.undefined)
  }
}
