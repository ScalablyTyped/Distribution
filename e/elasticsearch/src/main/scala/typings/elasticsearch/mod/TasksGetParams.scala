package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TasksGetParams
  extends StObject
     with GenericParams {
  
  var taskId: js.UndefOr[String] = js.undefined
  
  var waitForCompletion: js.UndefOr[Boolean] = js.undefined
}
object TasksGetParams {
  
  inline def apply(): TasksGetParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksGetParams]
  }
  
  extension [Self <: TasksGetParams](x: Self) {
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    inline def setWaitForCompletion(value: Boolean): Self = StObject.set(x, "waitForCompletion", value.asInstanceOf[js.Any])
    
    inline def setWaitForCompletionUndefined: Self = StObject.set(x, "waitForCompletion", js.undefined)
  }
}
