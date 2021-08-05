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
  
  inline def apply(watch_id: String): WatcherAckWatch = {
    val __obj = js.Dynamic.literal(watch_id = watch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherAckWatch]
  }
  
  extension [Self <: WatcherAckWatch](x: Self) {
    
    inline def setAction_id(value: String | js.Array[String]): Self = StObject.set(x, "action_id", value.asInstanceOf[js.Any])
    
    inline def setAction_idUndefined: Self = StObject.set(x, "action_id", js.undefined)
    
    inline def setAction_idVarargs(value: String*): Self = StObject.set(x, "action_id", js.Array(value :_*))
    
    inline def setWatch_id(value: String): Self = StObject.set(x, "watch_id", value.asInstanceOf[js.Any])
  }
}
