package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherAckWatchRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var action_id: js.UndefOr[Names] = js.undefined
  
  var watch_id: Name
}
object WatcherAckWatchRequest {
  
  inline def apply(watch_id: Name): WatcherAckWatchRequest = {
    val __obj = js.Dynamic.literal(watch_id = watch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherAckWatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherAckWatchRequest] (val x: Self) extends AnyVal {
    
    inline def setAction_id(value: Names): Self = StObject.set(x, "action_id", value.asInstanceOf[js.Any])
    
    inline def setAction_idUndefined: Self = StObject.set(x, "action_id", js.undefined)
    
    inline def setAction_idVarargs(value: Name*): Self = StObject.set(x, "action_id", js.Array(value*))
    
    inline def setWatch_id(value: Name): Self = StObject.set(x, "watch_id", value.asInstanceOf[js.Any])
  }
}
