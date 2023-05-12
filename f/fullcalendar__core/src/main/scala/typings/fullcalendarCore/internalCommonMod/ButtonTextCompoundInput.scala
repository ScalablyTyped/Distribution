package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonTextCompoundInput
  extends StObject
     with /* viewOrCustomButton */ StringDictionary[js.UndefOr[String]] {
  
  var day: js.UndefOr[String] = js.undefined
  
  var month: js.UndefOr[String] = js.undefined
  
  var next: js.UndefOr[String] = js.undefined
  
  var nextYear: js.UndefOr[String] = js.undefined
  
  var prev: js.UndefOr[String] = js.undefined
  
  var prevYear: js.UndefOr[String] = js.undefined
  
  var today: js.UndefOr[String] = js.undefined
  
  var week: js.UndefOr[String] = js.undefined
}
object ButtonTextCompoundInput {
  
  inline def apply(): ButtonTextCompoundInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonTextCompoundInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonTextCompoundInput] (val x: Self) extends AnyVal {
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextYear(value: String): Self = StObject.set(x, "nextYear", value.asInstanceOf[js.Any])
    
    inline def setNextYearUndefined: Self = StObject.set(x, "nextYear", js.undefined)
    
    inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    inline def setPrevYear(value: String): Self = StObject.set(x, "prevYear", value.asInstanceOf[js.Any])
    
    inline def setPrevYearUndefined: Self = StObject.set(x, "prevYear", js.undefined)
    
    inline def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    
    inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    
    inline def setWeek(value: String): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
  }
}
