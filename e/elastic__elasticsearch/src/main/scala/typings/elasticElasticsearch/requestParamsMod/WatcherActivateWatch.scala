package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherActivateWatch
  extends StObject
     with Generic {
  
  var watch_id: String
}
object WatcherActivateWatch {
  
  @scala.inline
  def apply(watch_id: String): WatcherActivateWatch = {
    val __obj = js.Dynamic.literal(watch_id = watch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherActivateWatch]
  }
  
  @scala.inline
  implicit class WatcherActivateWatchMutableBuilder[Self <: WatcherActivateWatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWatch_id(value: String): Self = StObject.set(x, "watch_id", value.asInstanceOf[js.Any])
  }
}
