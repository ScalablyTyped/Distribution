package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TasksListRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var actions: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var detailed: js.UndefOr[Boolean] = js.undefined
  
  var group_by: js.UndefOr[TasksGroupBy] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var node_id: js.UndefOr[js.Array[String]] = js.undefined
  
  var parent_task_id: js.UndefOr[Id] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object TasksListRequest {
  
  inline def apply(): TasksListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TasksListRequest] (val x: Self) extends AnyVal {
    
    inline def setActions(value: String | js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    
    inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
    
    inline def setGroup_by(value: TasksGroupBy): Self = StObject.set(x, "group_by", value.asInstanceOf[js.Any])
    
    inline def setGroup_byUndefined: Self = StObject.set(x, "group_by", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setNode_id(value: js.Array[String]): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setNode_idVarargs(value: String*): Self = StObject.set(x, "node_id", js.Array(value*))
    
    inline def setParent_task_id(value: Id): Self = StObject.set(x, "parent_task_id", value.asInstanceOf[js.Any])
    
    inline def setParent_task_idUndefined: Self = StObject.set(x, "parent_task_id", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
