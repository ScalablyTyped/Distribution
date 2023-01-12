package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherDeactivateWatchRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var watch_id: Name
}
object WatcherDeactivateWatchRequest {
  
  inline def apply(watch_id: Name): WatcherDeactivateWatchRequest = {
    val __obj = js.Dynamic.literal(watch_id = watch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherDeactivateWatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherDeactivateWatchRequest] (val x: Self) extends AnyVal {
    
    inline def setWatch_id(value: Name): Self = StObject.set(x, "watch_id", value.asInstanceOf[js.Any])
  }
}
