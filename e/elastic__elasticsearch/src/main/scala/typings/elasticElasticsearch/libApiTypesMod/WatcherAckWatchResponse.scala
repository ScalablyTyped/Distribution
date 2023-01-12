package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherAckWatchResponse extends StObject {
  
  var status: WatcherWatchStatus
}
object WatcherAckWatchResponse {
  
  inline def apply(status: WatcherWatchStatus): WatcherAckWatchResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherAckWatchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherAckWatchResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: WatcherWatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
