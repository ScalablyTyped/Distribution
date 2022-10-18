package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherAction
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherConditionContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherInputContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherTriggerContainer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  var actions: js.UndefOr[Record[String, WatcherAction]] = js.undefined
  
  var condition: js.UndefOr[WatcherConditionContainer] = js.undefined
  
  var input: js.UndefOr[WatcherInputContainer] = js.undefined
  
  var metadata: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata] = js.undefined
  
  var throttle_period: js.UndefOr[String] = js.undefined
  
  var transform: js.UndefOr[TransformContainer] = js.undefined
  
  var trigger: js.UndefOr[WatcherTriggerContainer] = js.undefined
}
object Condition {
  
  inline def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  extension [Self <: Condition](x: Self) {
    
    inline def setActions(value: Record[String, WatcherAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setCondition(value: WatcherConditionContainer): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setInput(value: WatcherInputContainer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMetadata(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setThrottle_period(value: String): Self = StObject.set(x, "throttle_period", value.asInstanceOf[js.Any])
    
    inline def setThrottle_periodUndefined: Self = StObject.set(x, "throttle_period", js.undefined)
    
    inline def setTransform(value: TransformContainer): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTrigger(value: WatcherTriggerContainer): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
