package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherPagerDutyResult extends StObject {
  
  var event: WatcherPagerDutyEvent
  
  var reason: js.UndefOr[String] = js.undefined
  
  var request: js.UndefOr[WatcherHttpInputRequestResult] = js.undefined
  
  var response: js.UndefOr[WatcherHttpInputResponseResult] = js.undefined
}
object WatcherPagerDutyResult {
  
  inline def apply(event: WatcherPagerDutyEvent): WatcherPagerDutyResult = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherPagerDutyResult]
  }
  
  extension [Self <: WatcherPagerDutyResult](x: Self) {
    
    inline def setEvent(value: WatcherPagerDutyEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRequest(value: WatcherHttpInputRequestResult): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: WatcherHttpInputResponseResult): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
