package typings.gldatepicker

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlDatePickerDate extends StObject {
  
  var date: Date
  
  var repeatMonth: js.UndefOr[Boolean] = js.undefined
  
  var repeatYear: js.UndefOr[Boolean] = js.undefined
}
object GlDatePickerDate {
  
  inline def apply(date: Date): GlDatePickerDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerDate]
  }
  
  extension [Self <: GlDatePickerDate](x: Self) {
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setRepeatMonth(value: Boolean): Self = StObject.set(x, "repeatMonth", value.asInstanceOf[js.Any])
    
    inline def setRepeatMonthUndefined: Self = StObject.set(x, "repeatMonth", js.undefined)
    
    inline def setRepeatYear(value: Boolean): Self = StObject.set(x, "repeatYear", value.asInstanceOf[js.Any])
    
    inline def setRepeatYearUndefined: Self = StObject.set(x, "repeatYear", js.undefined)
  }
}
