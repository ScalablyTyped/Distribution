package typings.expo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Day extends StObject {
  
  var day: js.UndefOr[Double] = js.undefined
  
  var hour: js.UndefOr[Double] = js.undefined
  
  var minute: js.UndefOr[Double] = js.undefined
  
  var month: js.UndefOr[Double] = js.undefined
  
  var repeat: js.UndefOr[Boolean] = js.undefined
  
  var second: js.UndefOr[Double] = js.undefined
  
  var weekDay: js.UndefOr[Double] = js.undefined
  
  var year: js.UndefOr[Double] = js.undefined
}
object Day {
  
  inline def apply(): Day = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Day]
  }
  
  extension [Self <: Day](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setWeekDay(value: Double): Self = StObject.set(x, "weekDay", value.asInstanceOf[js.Any])
    
    inline def setWeekDayUndefined: Self = StObject.set(x, "weekDay", js.undefined)
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
