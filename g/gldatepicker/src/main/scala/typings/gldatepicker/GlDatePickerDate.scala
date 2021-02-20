package typings.gldatepicker

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlDatePickerDate extends StObject {
  
  var date: Date = js.native
  
  var repeatMonth: js.UndefOr[Boolean] = js.native
  
  var repeatYear: js.UndefOr[Boolean] = js.native
}
object GlDatePickerDate {
  
  @scala.inline
  def apply(date: Date): GlDatePickerDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerDate]
  }
  
  @scala.inline
  implicit class GlDatePickerDateMutableBuilder[Self <: GlDatePickerDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatMonth(value: Boolean): Self = StObject.set(x, "repeatMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatMonthUndefined: Self = StObject.set(x, "repeatMonth", js.undefined)
    
    @scala.inline
    def setRepeatYear(value: Boolean): Self = StObject.set(x, "repeatYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatYearUndefined: Self = StObject.set(x, "repeatYear", js.undefined)
  }
}
