package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherHourlySchedule extends StObject {
  
  var minute: js.Array[integer]
}
object WatcherHourlySchedule {
  
  inline def apply(minute: js.Array[integer]): WatcherHourlySchedule = {
    val __obj = js.Dynamic.literal(minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherHourlySchedule]
  }
  
  extension [Self <: WatcherHourlySchedule](x: Self) {
    
    inline def setMinute(value: js.Array[integer]): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteVarargs(value: integer*): Self = StObject.set(x, "minute", js.Array(value*))
  }
}
