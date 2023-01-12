package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherWebhookResult extends StObject {
  
  var request: WatcherHttpInputRequestResult
  
  var response: js.UndefOr[WatcherHttpInputResponseResult] = js.undefined
}
object WatcherWebhookResult {
  
  inline def apply(request: WatcherHttpInputRequestResult): WatcherWebhookResult = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherWebhookResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherWebhookResult] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: WatcherHttpInputRequestResult): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: WatcherHttpInputResponseResult): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
