package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherExecutionResultAction extends StObject {
  
  var email: js.UndefOr[WatcherEmailResult] = js.undefined
  
  var error: js.UndefOr[ErrorCause] = js.undefined
  
  var id: Id
  
  var index: js.UndefOr[WatcherIndexResult] = js.undefined
  
  var logging: js.UndefOr[WatcherLoggingResult] = js.undefined
  
  var pagerduty: js.UndefOr[WatcherPagerDutyResult] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
  
  var slack: js.UndefOr[WatcherSlackResult] = js.undefined
  
  var status: WatcherActionStatusOptions
  
  var `type`: WatcherActionType
  
  var webhook: js.UndefOr[WatcherWebhookResult] = js.undefined
}
object WatcherExecutionResultAction {
  
  inline def apply(id: Id, status: WatcherActionStatusOptions, `type`: WatcherActionType): WatcherExecutionResultAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherExecutionResultAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherExecutionResultAction] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: WatcherEmailResult): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setError(value: ErrorCause): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: WatcherIndexResult): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLogging(value: WatcherLoggingResult): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setPagerduty(value: WatcherPagerDutyResult): Self = StObject.set(x, "pagerduty", value.asInstanceOf[js.Any])
    
    inline def setPagerdutyUndefined: Self = StObject.set(x, "pagerduty", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setSlack(value: WatcherSlackResult): Self = StObject.set(x, "slack", value.asInstanceOf[js.Any])
    
    inline def setSlackUndefined: Self = StObject.set(x, "slack", js.undefined)
    
    inline def setStatus(value: WatcherActionStatusOptions): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: WatcherActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWebhook(value: WatcherWebhookResult): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    inline def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
