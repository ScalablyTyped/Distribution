package typings.flatpickr.weekSelectMod

import typings.flatpickr.globalsMod.global.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlusWeeks extends js.Object {
  
  var weekEndDay: Date = js.native
  
  var weekStartDay: Date = js.native
}
object PlusWeeks {
  
  @scala.inline
  def apply(weekEndDay: Date, weekStartDay: Date): PlusWeeks = {
    val __obj = js.Dynamic.literal(weekEndDay = weekEndDay.asInstanceOf[js.Any], weekStartDay = weekStartDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWeeks]
  }
  
  @scala.inline
  implicit class PlusWeeksOps[Self <: PlusWeeks] (val x: Self) extends AnyVal {
    
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
    def setWeekEndDay(value: Date): Self = this.set("weekEndDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekStartDay(value: Date): Self = this.set("weekStartDay", value.asInstanceOf[js.Any])
  }
}
