package typings.fullcalendarCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllDay extends StObject {
  
  var allDay: js.UndefOr[Boolean] = js.undefined
  
  var granularity: js.UndefOr[String] = js.undefined
}
object AllDay {
  
  inline def apply(): AllDay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllDay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllDay] (val x: Self) extends AnyVal {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
    
    inline def setGranularity(value: String): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
  }
}
