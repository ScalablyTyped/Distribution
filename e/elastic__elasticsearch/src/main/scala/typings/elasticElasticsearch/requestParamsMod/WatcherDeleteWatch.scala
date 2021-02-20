package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherDeleteWatch extends Generic {
  
  var id: String = js.native
}
object WatcherDeleteWatch {
  
  @scala.inline
  def apply(id: String): WatcherDeleteWatch = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherDeleteWatch]
  }
  
  @scala.inline
  implicit class WatcherDeleteWatchMutableBuilder[Self <: WatcherDeleteWatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
