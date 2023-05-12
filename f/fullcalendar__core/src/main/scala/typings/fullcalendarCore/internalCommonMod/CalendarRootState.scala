package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarRootState extends StObject {
  
  var forPrint: Boolean
}
object CalendarRootState {
  
  inline def apply(forPrint: Boolean): CalendarRootState = {
    val __obj = js.Dynamic.literal(forPrint = forPrint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarRootState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarRootState] (val x: Self) extends AnyVal {
    
    inline def setForPrint(value: Boolean): Self = StObject.set(x, "forPrint", value.asInstanceOf[js.Any])
  }
}
