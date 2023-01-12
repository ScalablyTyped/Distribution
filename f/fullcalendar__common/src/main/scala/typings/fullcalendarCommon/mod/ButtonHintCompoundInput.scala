package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonHintCompoundInput
  extends StObject
     with /* viewOrCustomButton */ StringDictionary[js.UndefOr[String | (js.Function1[/* repeated */ Any, String])]] {
  
  var day: js.UndefOr[String | (js.Function1[/* repeated */ Any, String])] = js.undefined
  
  var month: js.UndefOr[String | (js.Function1[/* repeated */ Any, String])] = js.undefined
  
  var next: js.UndefOr[String | (js.Function1[/* repeated */ Any, String])] = js.undefined
  
  var nextYear: js.UndefOr[String | (js.Function1[/* repeated */ Any, String])] = js.undefined
  
  var prev: js.UndefOr[String | (js.Function1[/* repeated */ Any, String])] = js.undefined
  
  var prevYear: js.UndefOr[String | (js.Function1[/* repeated */ Any, String])] = js.undefined
  
  var today: js.UndefOr[String | (js.Function1[/* repeated */ Any, String])] = js.undefined
  
  var week: js.UndefOr[String | (js.Function1[/* repeated */ Any, String])] = js.undefined
}
object ButtonHintCompoundInput {
  
  inline def apply(): ButtonHintCompoundInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonHintCompoundInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonHintCompoundInput] (val x: Self) extends AnyVal {
    
    inline def setDay(value: String | (js.Function1[/* repeated */ Any, String])): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "day", js.Any.fromFunction1(value))
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setMonth(value: String | (js.Function1[/* repeated */ Any, String])): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "month", js.Any.fromFunction1(value))
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setNext(value: String | (js.Function1[/* repeated */ Any, String])): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextYear(value: String | (js.Function1[/* repeated */ Any, String])): Self = StObject.set(x, "nextYear", value.asInstanceOf[js.Any])
    
    inline def setNextYearFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "nextYear", js.Any.fromFunction1(value))
    
    inline def setNextYearUndefined: Self = StObject.set(x, "nextYear", js.undefined)
    
    inline def setPrev(value: String | (js.Function1[/* repeated */ Any, String])): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "prev", js.Any.fromFunction1(value))
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    inline def setPrevYear(value: String | (js.Function1[/* repeated */ Any, String])): Self = StObject.set(x, "prevYear", value.asInstanceOf[js.Any])
    
    inline def setPrevYearFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "prevYear", js.Any.fromFunction1(value))
    
    inline def setPrevYearUndefined: Self = StObject.set(x, "prevYear", js.undefined)
    
    inline def setToday(value: String | (js.Function1[/* repeated */ Any, String])): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    
    inline def setTodayFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "today", js.Any.fromFunction1(value))
    
    inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    
    inline def setWeek(value: String | (js.Function1[/* repeated */ Any, String])): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setWeekFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "week", js.Any.fromFunction1(value))
    
    inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
  }
}
