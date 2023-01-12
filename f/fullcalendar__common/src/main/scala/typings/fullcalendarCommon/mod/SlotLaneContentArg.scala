package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@fullcalendar/common.@fullcalendar/common.DateMeta> */
trait SlotLaneContentArg extends StObject {
  
  var date: js.UndefOr[js.Date] = js.undefined
  
  var dow: js.UndefOr[Double] = js.undefined
  
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  
  var isFuture: js.UndefOr[Boolean] = js.undefined
  
  var isOther: js.UndefOr[Boolean] = js.undefined
  
  var isPast: js.UndefOr[Boolean] = js.undefined
  
  var isToday: js.UndefOr[Boolean] = js.undefined
  
  var time: js.UndefOr[Duration] = js.undefined
  
  var view: ViewApi
}
object SlotLaneContentArg {
  
  inline def apply(view: ViewApi): SlotLaneContentArg = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotLaneContentArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotLaneContentArg] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDow(value: Double): Self = StObject.set(x, "dow", value.asInstanceOf[js.Any])
    
    inline def setDowUndefined: Self = StObject.set(x, "dow", js.undefined)
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setIsFuture(value: Boolean): Self = StObject.set(x, "isFuture", value.asInstanceOf[js.Any])
    
    inline def setIsFutureUndefined: Self = StObject.set(x, "isFuture", js.undefined)
    
    inline def setIsOther(value: Boolean): Self = StObject.set(x, "isOther", value.asInstanceOf[js.Any])
    
    inline def setIsOtherUndefined: Self = StObject.set(x, "isOther", js.undefined)
    
    inline def setIsPast(value: Boolean): Self = StObject.set(x, "isPast", value.asInstanceOf[js.Any])
    
    inline def setIsPastUndefined: Self = StObject.set(x, "isPast", js.undefined)
    
    inline def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
    
    inline def setIsTodayUndefined: Self = StObject.set(x, "isToday", js.undefined)
    
    inline def setTime(value: Duration): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
