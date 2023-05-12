package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRangeInput extends StObject {
  
  var end: js.UndefOr[DateInput] = js.undefined
  
  var start: js.UndefOr[DateInput] = js.undefined
}
object DateRangeInput {
  
  inline def apply(): DateRangeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateRangeInput] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: DateInput): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEndVarargs(value: Double*): Self = StObject.set(x, "end", js.Array(value*))
    
    inline def setStart(value: DateInput): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStartVarargs(value: Double*): Self = StObject.set(x, "start", js.Array(value*))
  }
}
