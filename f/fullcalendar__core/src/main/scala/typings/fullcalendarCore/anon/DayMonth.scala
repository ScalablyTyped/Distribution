package typings.fullcalendarCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayMonth extends StObject {
  
  var day: String
  
  var month: String
}
object DayMonth {
  
  inline def apply(day: String, month: String): DayMonth = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayMonth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DayMonth] (val x: Self) extends AnyVal {
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
  }
}
