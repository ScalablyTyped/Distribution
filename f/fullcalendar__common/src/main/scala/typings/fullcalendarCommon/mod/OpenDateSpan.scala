package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenDateSpan
  extends StObject
     with /* otherProp */ StringDictionary[Any] {
  
  var allDay: Boolean
  
  var range: OpenDateRange
}
object OpenDateSpan {
  
  inline def apply(allDay: Boolean, range: OpenDateRange): OpenDateSpan = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDateSpan]
  }
  
  extension [Self <: OpenDateSpan](x: Self) {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setRange(value: OpenDateRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
