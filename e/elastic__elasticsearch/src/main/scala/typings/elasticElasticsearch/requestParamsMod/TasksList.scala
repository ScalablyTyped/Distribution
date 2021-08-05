package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.nodes
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.parents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TasksList
  extends StObject
     with Generic {
  
  var actions: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var detailed: js.UndefOr[Boolean] = js.undefined
  
  var group_by: js.UndefOr[nodes | parents | none] = js.undefined
  
  var nodes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var parent_task_id: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object TasksList {
  
  inline def apply(): TasksList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksList]
  }
  
  extension [Self <: TasksList](x: Self) {
    
    inline def setActions(value: String | js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    
    inline def setGroup_by(value: nodes | parents | none): Self = StObject.set(x, "group_by", value.asInstanceOf[js.Any])
    
    inline def setGroup_byUndefined: Self = StObject.set(x, "group_by", js.undefined)
    
    inline def setNodes(value: String | js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setParent_task_id(value: String): Self = StObject.set(x, "parent_task_id", value.asInstanceOf[js.Any])
    
    inline def setParent_task_idUndefined: Self = StObject.set(x, "parent_task_id", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
