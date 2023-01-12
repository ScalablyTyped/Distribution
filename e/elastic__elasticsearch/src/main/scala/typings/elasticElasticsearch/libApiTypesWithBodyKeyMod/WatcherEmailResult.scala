package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherEmailResult extends StObject {
  
  var account: js.UndefOr[String] = js.undefined
  
  var message: WatcherEmail
  
  var reason: js.UndefOr[String] = js.undefined
}
object WatcherEmailResult {
  
  inline def apply(message: WatcherEmail): WatcherEmailResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherEmailResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherEmailResult] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setMessage(value: WatcherEmail): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
