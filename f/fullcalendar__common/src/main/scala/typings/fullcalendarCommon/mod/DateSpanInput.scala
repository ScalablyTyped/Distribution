package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateSpanInput
  extends StObject
     with OpenDateSpanInput {
  
  @JSName("end")
  var end_DateSpanInput: DateInput
  
  @JSName("start")
  var start_DateSpanInput: DateInput
}
object DateSpanInput {
  
  inline def apply(end: DateInput, start: DateInput): DateSpanInput = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateSpanInput]
  }
  
  extension [Self <: DateSpanInput](x: Self) {
    
    inline def setEnd(value: DateInput): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndVarargs(value: Double*): Self = StObject.set(x, "end", js.Array(value*))
    
    inline def setStart(value: DateInput): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartVarargs(value: Double*): Self = StObject.set(x, "start", js.Array(value*))
  }
}
