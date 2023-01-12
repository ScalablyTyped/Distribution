package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateProfileOptions extends StObject {
  
  var dateAlignment: js.UndefOr[String] = js.undefined
  
  var dateIncrement: js.UndefOr[Duration] = js.undefined
  
  var dayCount: js.UndefOr[Double] = js.undefined
  
  var fixedWeekCount: js.UndefOr[Boolean] = js.undefined
  
  var hiddenDays: js.UndefOr[js.Array[Double]] = js.undefined
  
  var monthMode: js.UndefOr[Boolean] = js.undefined
  
  var nowInput: js.UndefOr[DateInput | js.Function0[DateInput]] = js.undefined
  
  var showNonCurrentDates: js.UndefOr[Boolean] = js.undefined
  
  var slotMaxTime: Duration
  
  var slotMinTime: Duration
  
  var validRangeInput: js.UndefOr[
    DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput])
  ] = js.undefined
  
  var visibleRangeInput: js.UndefOr[
    DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput])
  ] = js.undefined
  
  var weekends: js.UndefOr[Boolean] = js.undefined
}
object DateProfileOptions {
  
  inline def apply(slotMaxTime: Duration, slotMinTime: Duration): DateProfileOptions = {
    val __obj = js.Dynamic.literal(slotMaxTime = slotMaxTime.asInstanceOf[js.Any], slotMinTime = slotMinTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateProfileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateProfileOptions] (val x: Self) extends AnyVal {
    
    inline def setDateAlignment(value: String): Self = StObject.set(x, "dateAlignment", value.asInstanceOf[js.Any])
    
    inline def setDateAlignmentUndefined: Self = StObject.set(x, "dateAlignment", js.undefined)
    
    inline def setDateIncrement(value: Duration): Self = StObject.set(x, "dateIncrement", value.asInstanceOf[js.Any])
    
    inline def setDateIncrementUndefined: Self = StObject.set(x, "dateIncrement", js.undefined)
    
    inline def setDayCount(value: Double): Self = StObject.set(x, "dayCount", value.asInstanceOf[js.Any])
    
    inline def setDayCountUndefined: Self = StObject.set(x, "dayCount", js.undefined)
    
    inline def setFixedWeekCount(value: Boolean): Self = StObject.set(x, "fixedWeekCount", value.asInstanceOf[js.Any])
    
    inline def setFixedWeekCountUndefined: Self = StObject.set(x, "fixedWeekCount", js.undefined)
    
    inline def setHiddenDays(value: js.Array[Double]): Self = StObject.set(x, "hiddenDays", value.asInstanceOf[js.Any])
    
    inline def setHiddenDaysUndefined: Self = StObject.set(x, "hiddenDays", js.undefined)
    
    inline def setHiddenDaysVarargs(value: Double*): Self = StObject.set(x, "hiddenDays", js.Array(value*))
    
    inline def setMonthMode(value: Boolean): Self = StObject.set(x, "monthMode", value.asInstanceOf[js.Any])
    
    inline def setMonthModeUndefined: Self = StObject.set(x, "monthMode", js.undefined)
    
    inline def setNowInput(value: DateInput | js.Function0[DateInput]): Self = StObject.set(x, "nowInput", value.asInstanceOf[js.Any])
    
    inline def setNowInputFunction0(value: () => DateInput): Self = StObject.set(x, "nowInput", js.Any.fromFunction0(value))
    
    inline def setNowInputUndefined: Self = StObject.set(x, "nowInput", js.undefined)
    
    inline def setNowInputVarargs(value: Double*): Self = StObject.set(x, "nowInput", js.Array(value*))
    
    inline def setShowNonCurrentDates(value: Boolean): Self = StObject.set(x, "showNonCurrentDates", value.asInstanceOf[js.Any])
    
    inline def setShowNonCurrentDatesUndefined: Self = StObject.set(x, "showNonCurrentDates", js.undefined)
    
    inline def setSlotMaxTime(value: Duration): Self = StObject.set(x, "slotMaxTime", value.asInstanceOf[js.Any])
    
    inline def setSlotMinTime(value: Duration): Self = StObject.set(x, "slotMinTime", value.asInstanceOf[js.Any])
    
    inline def setValidRangeInput(
      value: DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput])
    ): Self = StObject.set(x, "validRangeInput", value.asInstanceOf[js.Any])
    
    inline def setValidRangeInputUndefined: Self = StObject.set(x, "validRangeInput", js.undefined)
    
    inline def setVisibleRangeInput(
      value: DateRangeInput | (js.ThisFunction1[/* this */ CalendarApi, /* nowDate */ js.Date, DateRangeInput])
    ): Self = StObject.set(x, "visibleRangeInput", value.asInstanceOf[js.Any])
    
    inline def setVisibleRangeInputUndefined: Self = StObject.set(x, "visibleRangeInput", js.undefined)
    
    inline def setWeekends(value: Boolean): Self = StObject.set(x, "weekends", value.asInstanceOf[js.Any])
    
    inline def setWeekendsUndefined: Self = StObject.set(x, "weekends", js.undefined)
  }
}
