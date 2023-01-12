package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fullcalendar/common.@fullcalendar/common.MountArg<@fullcalendar/common.@fullcalendar/common.DayCellContentArg> */
trait DayCellMountArg
  extends StObject
     with /* otherProp */ StringDictionary[Any] {
  
  var date: js.Date
  
  var dayNumberText: String
  
  var dow: Double
  
  var el: HTMLElement
  
  var isDisabled: Boolean
  
  var isFuture: Boolean
  
  var isOther: Boolean
  
  var isPast: Boolean
  
  var isToday: Boolean
  
  var view: ViewApi
}
object DayCellMountArg {
  
  inline def apply(
    date: js.Date,
    dayNumberText: String,
    dow: Double,
    el: HTMLElement,
    isDisabled: Boolean,
    isFuture: Boolean,
    isOther: Boolean,
    isPast: Boolean,
    isToday: Boolean,
    view: ViewApi
  ): DayCellMountArg = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dayNumberText = dayNumberText.asInstanceOf[js.Any], dow = dow.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFuture = isFuture.asInstanceOf[js.Any], isOther = isOther.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayCellMountArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DayCellMountArg] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDayNumberText(value: String): Self = StObject.set(x, "dayNumberText", value.asInstanceOf[js.Any])
    
    inline def setDow(value: Double): Self = StObject.set(x, "dow", value.asInstanceOf[js.Any])
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsFuture(value: Boolean): Self = StObject.set(x, "isFuture", value.asInstanceOf[js.Any])
    
    inline def setIsOther(value: Boolean): Self = StObject.set(x, "isOther", value.asInstanceOf[js.Any])
    
    inline def setIsPast(value: Boolean): Self = StObject.set(x, "isPast", value.asInstanceOf[js.Any])
    
    inline def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
