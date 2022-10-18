package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherActivateWatchResponse extends StObject {
  
  var status: WatcherActivationStatus
}
object WatcherActivateWatchResponse {
  
  inline def apply(status: WatcherActivationStatus): WatcherActivateWatchResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherActivateWatchResponse]
  }
  
  extension [Self <: WatcherActivateWatchResponse](x: Self) {
    
    inline def setStatus(value: WatcherActivationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
