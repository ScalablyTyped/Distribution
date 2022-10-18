package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherExecuteWatchWatchRecord extends StObject {
  
  var condition: WatcherConditionContainer
  
  var input: WatcherInputContainer
  
  var messages: js.Array[String]
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var node: String
  
  var result: WatcherExecutionResult
  
  var state: WatcherExecutionStatus
  
  var status: js.UndefOr[WatcherWatchStatus] = js.undefined
  
  var trigger_event: WatcherTriggerEventResult
  
  var user: Username
  
  var watch_id: Id
}
object WatcherExecuteWatchWatchRecord {
  
  inline def apply(
    condition: WatcherConditionContainer,
    input: WatcherInputContainer,
    messages: js.Array[String],
    node: String,
    result: WatcherExecutionResult,
    state: WatcherExecutionStatus,
    trigger_event: WatcherTriggerEventResult,
    user: Username,
    watch_id: Id
  ): WatcherExecuteWatchWatchRecord = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trigger_event = trigger_event.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], watch_id = watch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherExecuteWatchWatchRecord]
  }
  
  extension [Self <: WatcherExecuteWatchWatchRecord](x: Self) {
    
    inline def setCondition(value: WatcherConditionContainer): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setInput(value: WatcherInputContainer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setResult(value: WatcherExecutionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setState(value: WatcherExecutionStatus): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: WatcherWatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTrigger_event(value: WatcherTriggerEventResult): Self = StObject.set(x, "trigger_event", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Username): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setWatch_id(value: Id): Self = StObject.set(x, "watch_id", value.asInstanceOf[js.Any])
  }
}
