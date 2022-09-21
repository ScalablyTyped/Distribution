package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NowTimerProps extends StObject {
  
  def children(now: js.Date, todayRange: DateRange): Any
  
  var unit: String
}
object NowTimerProps {
  
  inline def apply(children: (js.Date, DateRange) => Any, unit: String): NowTimerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[NowTimerProps]
  }
  
  extension [Self <: NowTimerProps](x: Self) {
    
    inline def setChildren(value: (js.Date, DateRange) => Any): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
