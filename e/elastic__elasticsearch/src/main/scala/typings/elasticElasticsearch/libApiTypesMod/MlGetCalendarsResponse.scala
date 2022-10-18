package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetCalendarsResponse extends StObject {
  
  var calendars: js.Array[MlGetCalendarsCalendar]
  
  var count: long
}
object MlGetCalendarsResponse {
  
  inline def apply(calendars: js.Array[MlGetCalendarsCalendar], count: long): MlGetCalendarsResponse = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetCalendarsResponse]
  }
  
  extension [Self <: MlGetCalendarsResponse](x: Self) {
    
    inline def setCalendars(value: js.Array[MlGetCalendarsCalendar]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    inline def setCalendarsVarargs(value: MlGetCalendarsCalendar*): Self = StObject.set(x, "calendars", js.Array(value*))
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
