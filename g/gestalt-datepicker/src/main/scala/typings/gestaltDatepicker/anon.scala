package typings.gestaltDatepicker

import typings.gestaltDatepicker.gestaltDatepickerInts.`0`
import typings.gestaltDatepicker.gestaltDatepickerInts.`1`
import typings.gestaltDatepicker.gestaltDatepickerInts.`2`
import typings.gestaltDatepicker.gestaltDatepickerInts.`3`
import typings.gestaltDatepicker.gestaltDatepickerInts.`4`
import typings.gestaltDatepicker.gestaltDatepickerInts.`5`
import typings.gestaltDatepicker.gestaltDatepickerInts.`6`
import typings.gestaltDatepicker.gestaltDatepickerInts.`7`
import typings.react.mod.SyntheticEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Date extends StObject {
    
    def date(args: Any*): Any
    
    def dateTime(args: Any*): Any
    
    def time(args: Any*): Any
  }
  object Date {
    
    inline def apply(
      date: /* repeated */ Any => Any,
      dateTime: /* repeated */ Any => Any,
      time: /* repeated */ Any => Any
    ): Date = {
      val __obj = js.Dynamic.literal(date = js.Any.fromFunction1(date), dateTime = js.Any.fromFunction1(dateTime), time = js.Any.fromFunction1(time))
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      inline def setDate(value: /* repeated */ Any => Any): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
      
      inline def setDateTime(value: /* repeated */ Any => Any): Self = StObject.set(x, "dateTime", js.Any.fromFunction1(value))
      
      inline def setTime(value: /* repeated */ Any => Any): Self = StObject.set(x, "time", js.Any.fromFunction1(value))
    }
  }
  
  trait Day extends StObject {
    
    def day(args: Any*): Any
    
    def dayPeriod(args: Any*): Any
    
    def era(args: Any*): Any
    
    def month(args: Any*): Any
    
    def ordinalNumber(args: Any*): Any
    
    def quarter(args: Any*): Any
  }
  object Day {
    
    inline def apply(
      day: /* repeated */ Any => Any,
      dayPeriod: /* repeated */ Any => Any,
      era: /* repeated */ Any => Any,
      month: /* repeated */ Any => Any,
      ordinalNumber: /* repeated */ Any => Any,
      quarter: /* repeated */ Any => Any
    ): Day = {
      val __obj = js.Dynamic.literal(day = js.Any.fromFunction1(day), dayPeriod = js.Any.fromFunction1(dayPeriod), era = js.Any.fromFunction1(era), month = js.Any.fromFunction1(month), ordinalNumber = js.Any.fromFunction1(ordinalNumber), quarter = js.Any.fromFunction1(quarter))
      __obj.asInstanceOf[Day]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Day] (val x: Self) extends AnyVal {
      
      inline def setDay(value: /* repeated */ Any => Any): Self = StObject.set(x, "day", js.Any.fromFunction1(value))
      
      inline def setDayPeriod(value: /* repeated */ Any => Any): Self = StObject.set(x, "dayPeriod", js.Any.fromFunction1(value))
      
      inline def setEra(value: /* repeated */ Any => Any): Self = StObject.set(x, "era", js.Any.fromFunction1(value))
      
      inline def setMonth(value: /* repeated */ Any => Any): Self = StObject.set(x, "month", js.Any.fromFunction1(value))
      
      inline def setOrdinalNumber(value: /* repeated */ Any => Any): Self = StObject.set(x, "ordinalNumber", js.Any.fromFunction1(value))
      
      inline def setQuarter(value: /* repeated */ Any => Any): Self = StObject.set(x, "quarter", js.Any.fromFunction1(value))
    }
  }
  
  trait Event extends StObject {
    
    var event: SyntheticEvent[HTMLInputElement, typings.std.Event]
    
    var value: js.Date
  }
  object Event {
    
    inline def apply(event: SyntheticEvent[HTMLInputElement, typings.std.Event], value: js.Date): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: SyntheticEvent[HTMLInputElement, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FirstWeekContainsDate extends StObject {
    
    var firstWeekContainsDate: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
    
    var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  }
  object FirstWeekContainsDate {
    
    inline def apply(): FirstWeekContainsDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirstWeekContainsDate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirstWeekContainsDate] (val x: Self) extends AnyVal {
      
      inline def setFirstWeekContainsDate(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "firstWeekContainsDate", value.asInstanceOf[js.Any])
      
      inline def setFirstWeekContainsDateUndefined: Self = StObject.set(x, "firstWeekContainsDate", js.undefined)
      
      inline def setWeekStartsOn(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
      
      inline def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
    }
  }
}
