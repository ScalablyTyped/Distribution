package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherDeactivateWatch
  extends StObject
     with Generic {
  
  var watch_id: String
}
object WatcherDeactivateWatch {
  
  inline def apply(watch_id: String): WatcherDeactivateWatch = {
    val __obj = js.Dynamic.literal(watch_id = watch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherDeactivateWatch]
  }
  
  extension [Self <: WatcherDeactivateWatch](x: Self) {
    
    inline def setWatch_id(value: String): Self = StObject.set(x, "watch_id", value.asInstanceOf[js.Any])
  }
}
