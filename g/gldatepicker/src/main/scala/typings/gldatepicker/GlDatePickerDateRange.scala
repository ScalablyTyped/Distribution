package typings.gldatepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlDatePickerDateRange extends StObject {
  
  var from: js.Date
  
  var repeatYear: js.UndefOr[Boolean] = js.undefined
  
  var to: js.UndefOr[js.Date] = js.undefined
}
object GlDatePickerDateRange {
  
  inline def apply(from: js.Date): GlDatePickerDateRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerDateRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlDatePickerDateRange] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: js.Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setRepeatYear(value: Boolean): Self = StObject.set(x, "repeatYear", value.asInstanceOf[js.Any])
    
    inline def setRepeatYearUndefined: Self = StObject.set(x, "repeatYear", js.undefined)
    
    inline def setTo(value: js.Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
