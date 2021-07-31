package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherAckWatch
  extends StObject
     with Generic {
  
  var action_id: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var watch_id: String
}
object WatcherAckWatch {
  
  @scala.inline
  def apply(watch_id: String): WatcherAckWatch = {
    val __obj = js.Dynamic.literal(watch_id = watch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherAckWatch]
  }
  
  @scala.inline
  implicit class WatcherAckWatchMutableBuilder[Self <: WatcherAckWatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction_id(value: String | js.Array[String]): Self = StObject.set(x, "action_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction_idUndefined: Self = StObject.set(x, "action_id", js.undefined)
    
    @scala.inline
    def setAction_idVarargs(value: String*): Self = StObject.set(x, "action_id", js.Array(value :_*))
    
    @scala.inline
    def setWatch_id(value: String): Self = StObject.set(x, "watch_id", value.asInstanceOf[js.Any])
  }
}
