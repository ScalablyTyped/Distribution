package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayPartTargeting extends js.Object {
  
  var daysOfWeek: js.UndefOr[js.Array[String]] = js.native
  
  var hoursOfDay: js.UndefOr[js.Array[Double]] = js.native
  
  var userLocalTime: js.UndefOr[Boolean] = js.native
}
object DayPartTargeting {
  
  @scala.inline
  def apply(): DayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPartTargeting]
  }
  
  @scala.inline
  implicit class DayPartTargetingOps[Self <: DayPartTargeting] (val x: Self) extends AnyVal {
    
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
    def setDaysOfWeekVarargs(value: String*): Self = this.set("daysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeek(value: js.Array[String]): Self = this.set("daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysOfWeek: Self = this.set("daysOfWeek", js.undefined)
    
    @scala.inline
    def setHoursOfDayVarargs(value: Double*): Self = this.set("hoursOfDay", js.Array(value :_*))
    
    @scala.inline
    def setHoursOfDay(value: js.Array[Double]): Self = this.set("hoursOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoursOfDay: Self = this.set("hoursOfDay", js.undefined)
    
    @scala.inline
    def setUserLocalTime(value: Boolean): Self = this.set("userLocalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLocalTime: Self = this.set("userLocalTime", js.undefined)
  }
}
