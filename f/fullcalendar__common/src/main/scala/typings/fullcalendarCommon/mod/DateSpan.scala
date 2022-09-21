package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateSpan
  extends StObject
     with OpenDateSpan {
  
  @JSName("range")
  var range_DateSpan: DateRange
}
object DateSpan {
  
  inline def apply(allDay: Boolean, range: DateRange): DateSpan = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateSpan]
  }
  
  extension [Self <: DateSpan](x: Self) {
    
    inline def setRange(value: DateRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
