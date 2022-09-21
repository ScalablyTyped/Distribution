package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fullcalendar/common.@fullcalendar/common.MountArg<@fullcalendar/common.@fullcalendar/common.NowIndicatorContentArg> */
trait NowIndicatorMountArg extends StObject {
  
  var date: js.Date
  
  var el: HTMLElement
  
  var isAxis: Boolean
  
  var view: ViewApi
}
object NowIndicatorMountArg {
  
  inline def apply(date: js.Date, el: HTMLElement, isAxis: Boolean, view: ViewApi): NowIndicatorMountArg = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], isAxis = isAxis.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[NowIndicatorMountArg]
  }
  
  extension [Self <: NowIndicatorMountArg](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setIsAxis(value: Boolean): Self = StObject.set(x, "isAxis", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
