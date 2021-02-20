package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherGetWatch extends Generic {
  
  var id: String = js.native
}
object WatcherGetWatch {
  
  @scala.inline
  def apply(id: String): WatcherGetWatch = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherGetWatch]
  }
  
  @scala.inline
  implicit class WatcherGetWatchMutableBuilder[Self <: WatcherGetWatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
