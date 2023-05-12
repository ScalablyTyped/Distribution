package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenDateSpanInput
  extends StObject
     with /* otherProp */ StringDictionary[Any] {
  
  var allDay: js.UndefOr[Boolean] = js.undefined
  
  var end: js.UndefOr[DateInput] = js.undefined
  
  var start: js.UndefOr[DateInput] = js.undefined
}
object OpenDateSpanInput {
  
  inline def apply(): OpenDateSpanInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenDateSpanInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenDateSpanInput] (val x: Self) extends AnyVal {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
    
    inline def setEnd(value: DateInput): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEndVarargs(value: Double*): Self = StObject.set(x, "end", js.Array(value*))
    
    inline def setStart(value: DateInput): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStartVarargs(value: Double*): Self = StObject.set(x, "start", js.Array(value*))
  }
}
