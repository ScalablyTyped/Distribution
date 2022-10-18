package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherAction extends StObject {
  
  var action_type: js.UndefOr[WatcherActionType] = js.undefined
  
  var condition: js.UndefOr[WatcherConditionContainer] = js.undefined
  
  var email: js.UndefOr[WatcherEmailAction] = js.undefined
  
  var foreach: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[WatcherIndexAction] = js.undefined
  
  var logging: js.UndefOr[WatcherLoggingAction] = js.undefined
  
  var max_iterations: js.UndefOr[integer] = js.undefined
  
  var name: js.UndefOr[Name] = js.undefined
  
  var pagerduty: js.UndefOr[WatcherPagerDutyAction] = js.undefined
  
  var slack: js.UndefOr[WatcherSlackAction] = js.undefined
  
  var throttle_period: js.UndefOr[Duration] = js.undefined
  
  var throttle_period_in_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var transform: js.UndefOr[TransformContainer] = js.undefined
  
  var webhook: js.UndefOr[WatcherWebhookAction] = js.undefined
}
object WatcherAction {
  
  inline def apply(): WatcherAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherAction]
  }
  
  extension [Self <: WatcherAction](x: Self) {
    
    inline def setAction_type(value: WatcherActionType): Self = StObject.set(x, "action_type", value.asInstanceOf[js.Any])
    
    inline def setAction_typeUndefined: Self = StObject.set(x, "action_type", js.undefined)
    
    inline def setCondition(value: WatcherConditionContainer): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setEmail(value: WatcherEmailAction): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setForeach(value: String): Self = StObject.set(x, "foreach", value.asInstanceOf[js.Any])
    
    inline def setForeachUndefined: Self = StObject.set(x, "foreach", js.undefined)
    
    inline def setIndex(value: WatcherIndexAction): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLogging(value: WatcherLoggingAction): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setMax_iterations(value: integer): Self = StObject.set(x, "max_iterations", value.asInstanceOf[js.Any])
    
    inline def setMax_iterationsUndefined: Self = StObject.set(x, "max_iterations", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPagerduty(value: WatcherPagerDutyAction): Self = StObject.set(x, "pagerduty", value.asInstanceOf[js.Any])
    
    inline def setPagerdutyUndefined: Self = StObject.set(x, "pagerduty", js.undefined)
    
    inline def setSlack(value: WatcherSlackAction): Self = StObject.set(x, "slack", value.asInstanceOf[js.Any])
    
    inline def setSlackUndefined: Self = StObject.set(x, "slack", js.undefined)
    
    inline def setThrottle_period(value: Duration): Self = StObject.set(x, "throttle_period", value.asInstanceOf[js.Any])
    
    inline def setThrottle_periodUndefined: Self = StObject.set(x, "throttle_period", js.undefined)
    
    inline def setThrottle_period_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "throttle_period_in_millis", value.asInstanceOf[js.Any])
    
    inline def setThrottle_period_in_millisUndefined: Self = StObject.set(x, "throttle_period_in_millis", js.undefined)
    
    inline def setTransform(value: TransformContainer): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setWebhook(value: WatcherWebhookAction): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    inline def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
