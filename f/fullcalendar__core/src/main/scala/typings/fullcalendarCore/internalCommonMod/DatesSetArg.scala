package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatesSetArg
  extends StObject
     with RangeApiWithTimeZone {
  
  var view: ViewApi
}
object DatesSetArg {
  
  inline def apply(end: js.Date, endStr: String, start: js.Date, startStr: String, timeZone: String, view: ViewApi): DatesSetArg = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], endStr = endStr.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startStr = startStr.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatesSetArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatesSetArg] (val x: Self) extends AnyVal {
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
