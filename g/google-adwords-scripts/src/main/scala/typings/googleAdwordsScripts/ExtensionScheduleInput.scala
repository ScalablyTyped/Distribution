package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionScheduleInput extends StObject {
  
  var dayOfWeek: js.UndefOr[DayOfWeekString] = js.undefined
  
  var endHour: js.UndefOr[Double] = js.undefined
  
  var endMinute: js.UndefOr[Double] = js.undefined
  
  var startHour: js.UndefOr[Double] = js.undefined
  
  var startMinute: js.UndefOr[Double] = js.undefined
}
object ExtensionScheduleInput {
  
  inline def apply(): ExtensionScheduleInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionScheduleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionScheduleInput] (val x: Self) extends AnyVal {
    
    inline def setDayOfWeek(value: DayOfWeekString): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setEndHour(value: Double): Self = StObject.set(x, "endHour", value.asInstanceOf[js.Any])
    
    inline def setEndHourUndefined: Self = StObject.set(x, "endHour", js.undefined)
    
    inline def setEndMinute(value: Double): Self = StObject.set(x, "endMinute", value.asInstanceOf[js.Any])
    
    inline def setEndMinuteUndefined: Self = StObject.set(x, "endMinute", js.undefined)
    
    inline def setStartHour(value: Double): Self = StObject.set(x, "startHour", value.asInstanceOf[js.Any])
    
    inline def setStartHourUndefined: Self = StObject.set(x, "startHour", js.undefined)
    
    inline def setStartMinute(value: Double): Self = StObject.set(x, "startMinute", value.asInstanceOf[js.Any])
    
    inline def setStartMinuteUndefined: Self = StObject.set(x, "startMinute", js.undefined)
  }
}
