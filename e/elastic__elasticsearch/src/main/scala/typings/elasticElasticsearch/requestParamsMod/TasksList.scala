package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.nodes
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.parents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TasksList extends Generic {
  
  var actions: js.UndefOr[String | js.Array[String]] = js.native
  
  var detailed: js.UndefOr[Boolean] = js.native
  
  var group_by: js.UndefOr[nodes | parents | none] = js.native
  
  var nodes: js.UndefOr[String | js.Array[String]] = js.native
  
  var parent_task_id: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var wait_for_completion: js.UndefOr[Boolean] = js.native
}
object TasksList {
  
  @scala.inline
  def apply(): TasksList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksList]
  }
  
  @scala.inline
  implicit class TasksListMutableBuilder[Self <: TasksList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: String | js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    
    @scala.inline
    def setGroup_by(value: nodes | parents | none): Self = StObject.set(x, "group_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup_byUndefined: Self = StObject.set(x, "group_by", js.undefined)
    
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
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
