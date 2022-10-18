package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherSlackResult extends StObject {
  
  var account: js.UndefOr[String] = js.undefined
  
  var message: WatcherSlackMessage
}
object WatcherSlackResult {
  
  inline def apply(message: WatcherSlackMessage): WatcherSlackResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherSlackResult]
  }
  
  extension [Self <: WatcherSlackResult](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setMessage(value: WatcherSlackMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
