package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherPagerDutyEvent extends StObject {
  
  var account: js.UndefOr[String] = js.undefined
  
  var attach_payload: Boolean
  
  var client: js.UndefOr[String] = js.undefined
  
  var client_url: js.UndefOr[String] = js.undefined
  
  var context: js.UndefOr[js.Array[WatcherPagerDutyContext]] = js.undefined
  
  var contexts: js.UndefOr[js.Array[WatcherPagerDutyContext]] = js.undefined
  
  var description: String
  
  var event_type: js.UndefOr[WatcherPagerDutyEventType] = js.undefined
  
  var incident_key: String
  
  var proxy: js.UndefOr[WatcherPagerDutyEventProxy] = js.undefined
}
object WatcherPagerDutyEvent {
  
  inline def apply(attach_payload: Boolean, description: String, incident_key: String): WatcherPagerDutyEvent = {
    val __obj = js.Dynamic.literal(attach_payload = attach_payload.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], incident_key = incident_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherPagerDutyEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherPagerDutyEvent] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAttach_payload(value: Boolean): Self = StObject.set(x, "attach_payload", value.asInstanceOf[js.Any])
    
    inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setClient_url(value: String): Self = StObject.set(x, "client_url", value.asInstanceOf[js.Any])
    
    inline def setClient_urlUndefined: Self = StObject.set(x, "client_url", js.undefined)
    
    inline def setContext(value: js.Array[WatcherPagerDutyContext]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setContextVarargs(value: WatcherPagerDutyContext*): Self = StObject.set(x, "context", js.Array(value*))
    
    inline def setContexts(value: js.Array[WatcherPagerDutyContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: WatcherPagerDutyContext*): Self = StObject.set(x, "contexts", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEvent_type(value: WatcherPagerDutyEventType): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
    
    inline def setEvent_typeUndefined: Self = StObject.set(x, "event_type", js.undefined)
    
    inline def setIncident_key(value: String): Self = StObject.set(x, "incident_key", value.asInstanceOf[js.Any])
    
    inline def setProxy(value: WatcherPagerDutyEventProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
  }
}
