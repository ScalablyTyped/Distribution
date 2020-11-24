package typings.gldatepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlDatePickerDateRange extends js.Object {
  
  var from: Date = js.native
  
  var repeatYear: js.UndefOr[Boolean] = js.native
  
  var to: js.UndefOr[Date] = js.native
}
object GlDatePickerDateRange {
  
  @scala.inline
  def apply(from: Date): GlDatePickerDateRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerDateRange]
  }
  
  @scala.inline
  implicit class GlDatePickerDateRangeOps[Self <: GlDatePickerDateRange] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: Date): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatYear(value: Boolean): Self = this.set("repeatYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatYear: Self = this.set("repeatYear", js.undefined)
    
    @scala.inline
    def setTo(value: Date): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
