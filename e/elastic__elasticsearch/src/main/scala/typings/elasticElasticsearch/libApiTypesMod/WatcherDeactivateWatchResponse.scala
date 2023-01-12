package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherDeactivateWatchResponse extends StObject {
  
  var status: WatcherActivationStatus
}
object WatcherDeactivateWatchResponse {
  
  inline def apply(status: WatcherActivationStatus): WatcherDeactivateWatchResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherDeactivateWatchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherDeactivateWatchResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: WatcherActivationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
