package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayHeaderContentArg
  extends StObject
     with DateMeta
     with /* otherProp */ StringDictionary[Any] {
  
  var date: js.Date
  
  var text: String
  
  var view: ViewApi
}
object DayHeaderContentArg {
  
  inline def apply(
    date: js.Date,
    dow: Double,
    isDisabled: Boolean,
    isFuture: Boolean,
    isOther: Boolean,
    isPast: Boolean,
    isToday: Boolean,
    text: String,
    view: ViewApi
  ): DayHeaderContentArg = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dow = dow.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFuture = isFuture.asInstanceOf[js.Any], isOther = isOther.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayHeaderContentArg]
  }
  
  extension [Self <: DayHeaderContentArg](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
