package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TasksGetRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var task_id: Id
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object TasksGetRequest {
  
  inline def apply(task_id: Id): TasksGetRequest = {
    val __obj = js.Dynamic.literal(task_id = task_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TasksGetRequest]
  }
  
  extension [Self <: TasksGetRequest](x: Self) {
    
    inline def setTask_id(value: Id): Self = StObject.set(x, "task_id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
