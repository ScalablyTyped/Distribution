package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherActivateWatchRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var watch_id: Name
}
object WatcherActivateWatchRequest {
  
  inline def apply(watch_id: Name): WatcherActivateWatchRequest = {
    val __obj = js.Dynamic.literal(watch_id = watch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherActivateWatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherActivateWatchRequest] (val x: Self) extends AnyVal {
    
    inline def setWatch_id(value: Name): Self = StObject.set(x, "watch_id", value.asInstanceOf[js.Any])
  }
}
