package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherHourAndMinute extends StObject {
  
  var hour: js.Array[integer]
  
  var minute: js.Array[integer]
}
object WatcherHourAndMinute {
  
  inline def apply(hour: js.Array[integer], minute: js.Array[integer]): WatcherHourAndMinute = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherHourAndMinute]
  }
  
  extension [Self <: WatcherHourAndMinute](x: Self) {
    
    inline def setHour(value: js.Array[integer]): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourVarargs(value: integer*): Self = StObject.set(x, "hour", js.Array(value*))
    
    inline def setMinute(value: js.Array[integer]): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteVarargs(value: integer*): Self = StObject.set(x, "minute", js.Array(value*))
  }
}
