package typings.gldatepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlDatePickerDate extends js.Object {
  
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
  implicit class GlDatePickerDateOps[Self <: GlDatePickerDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatMonth(value: Boolean): Self = this.set("repeatMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatMonth: Self = this.set("repeatMonth", js.undefined)
    
    @scala.inline
    def setRepeatYear(value: Boolean): Self = this.set("repeatYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatYear: Self = this.set("repeatYear", js.undefined)
  }
}
