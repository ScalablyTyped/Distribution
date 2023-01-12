package typings.gldatepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlDatePickerDate extends StObject {
  
  var date: js.Date
  
  var repeatMonth: js.UndefOr[Boolean] = js.undefined
  
  var repeatYear: js.UndefOr[Boolean] = js.undefined
}
object GlDatePickerDate {
  
  inline def apply(date: js.Date): GlDatePickerDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlDatePickerDate] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setRepeatMonth(value: Boolean): Self = StObject.set(x, "repeatMonth", value.asInstanceOf[js.Any])
    
    inline def setRepeatMonthUndefined: Self = StObject.set(x, "repeatMonth", js.undefined)
    
    inline def setRepeatYear(value: Boolean): Self = StObject.set(x, "repeatYear", value.asInstanceOf[js.Any])
    
    inline def setRepeatYearUndefined: Self = StObject.set(x, "repeatYear", js.undefined)
  }
}
