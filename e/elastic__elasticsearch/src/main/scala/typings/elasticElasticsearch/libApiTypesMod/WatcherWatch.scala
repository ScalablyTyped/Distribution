package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherWatch extends StObject {
  
  var actions: Record[IndexName, WatcherAction]
  
  var condition: WatcherConditionContainer
  
  var input: WatcherInputContainer
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var status: js.UndefOr[WatcherWatchStatus] = js.undefined
  
  var throttle_period: js.UndefOr[Duration] = js.undefined
  
  var throttle_period_in_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var transform: js.UndefOr[TransformContainer] = js.undefined
  
  var trigger: WatcherTriggerContainer
}
object WatcherWatch {
  
  inline def apply(
    actions: Record[IndexName, WatcherAction],
    condition: WatcherConditionContainer,
    input: WatcherInputContainer,
    trigger: WatcherTriggerContainer
  ): WatcherWatch = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherWatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherWatch] (val x: Self) extends AnyVal {
    
    inline def setActions(value: Record[IndexName, WatcherAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: WatcherConditionContainer): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setInput(value: WatcherInputContainer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setStatus(value: WatcherWatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setThrottle_period(value: Duration): Self = StObject.set(x, "throttle_period", value.asInstanceOf[js.Any])
    
    inline def setThrottle_periodUndefined: Self = StObject.set(x, "throttle_period", js.undefined)
    
    inline def setThrottle_period_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "throttle_period_in_millis", value.asInstanceOf[js.Any])
    
    inline def setThrottle_period_in_millisUndefined: Self = StObject.set(x, "throttle_period_in_millis", js.undefined)
    
    inline def setTransform(value: TransformContainer): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTrigger(value: WatcherTriggerContainer): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
