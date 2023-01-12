package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NowIndicatorContentArg extends StObject {
  
  var date: js.Date
  
  var isAxis: Boolean
  
  var view: ViewApi
}
object NowIndicatorContentArg {
  
  inline def apply(date: js.Date, isAxis: Boolean, view: ViewApi): NowIndicatorContentArg = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isAxis = isAxis.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[NowIndicatorContentArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NowIndicatorContentArg] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setIsAxis(value: Boolean): Self = StObject.set(x, "isAxis", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
