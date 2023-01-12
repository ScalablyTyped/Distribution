package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherExecutionResult extends StObject {
  
  var actions: js.Array[WatcherExecutionResultAction]
  
  var condition: WatcherExecutionResultCondition
  
  var execution_duration: DurationValue[UnitMillis]
  
  var execution_time: DateTime
  
  var input: WatcherExecutionResultInput
}
object WatcherExecutionResult {
  
  inline def apply(
    actions: js.Array[WatcherExecutionResultAction],
    condition: WatcherExecutionResultCondition,
    execution_duration: DurationValue[UnitMillis],
    execution_time: DateTime,
    input: WatcherExecutionResultInput
  ): WatcherExecutionResult = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], execution_duration = execution_duration.asInstanceOf[js.Any], execution_time = execution_time.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherExecutionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherExecutionResult] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[WatcherExecutionResultAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: WatcherExecutionResultAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCondition(value: WatcherExecutionResultCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setExecution_duration(value: DurationValue[UnitMillis]): Self = StObject.set(x, "execution_duration", value.asInstanceOf[js.Any])
    
    inline def setExecution_time(value: DateTime): Self = StObject.set(x, "execution_time", value.asInstanceOf[js.Any])
    
    inline def setInput(value: WatcherExecutionResultInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
