package typings.gldatepicker

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlDatePickerDateRange extends StObject {
  
  var from: Date
  
  var repeatYear: js.UndefOr[Boolean] = js.undefined
  
  var to: js.UndefOr[Date] = js.undefined
}
object GlDatePickerDateRange {
  
  @scala.inline
  def apply(from: Date): GlDatePickerDateRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerDateRange]
  }
  
  @scala.inline
  implicit class GlDatePickerDateRangeMutableBuilder[Self <: GlDatePickerDateRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatYear(value: Boolean): Self = StObject.set(x, "repeatYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatYearUndefined: Self = StObject.set(x, "repeatYear", js.undefined)
    
    @scala.inline
    def setTo(value: Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
