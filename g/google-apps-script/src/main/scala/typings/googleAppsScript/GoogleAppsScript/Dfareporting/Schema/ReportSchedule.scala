package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportSchedule extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var every: js.UndefOr[Double] = js.native
  
  var expirationDate: js.UndefOr[String] = js.native
  
  var repeats: js.UndefOr[String] = js.native
  
  var repeatsOnWeekDays: js.UndefOr[js.Array[String]] = js.native
  
  var runsOnDayOfMonth: js.UndefOr[String] = js.native
  
  var startDate: js.UndefOr[String] = js.native
}
object ReportSchedule {
  
  @scala.inline
  def apply(): ReportSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportSchedule]
  }
  
  @scala.inline
  implicit class ReportScheduleOps[Self <: ReportSchedule] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setEvery(value: Double): Self = this.set("every", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvery: Self = this.set("every", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    
    @scala.inline
    def setRepeats(value: String): Self = this.set("repeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeats: Self = this.set("repeats", js.undefined)
    
    @scala.inline
    def setRepeatsOnWeekDaysVarargs(value: String*): Self = this.set("repeatsOnWeekDays", js.Array(value :_*))
    
    @scala.inline
    def setRepeatsOnWeekDays(value: js.Array[String]): Self = this.set("repeatsOnWeekDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatsOnWeekDays: Self = this.set("repeatsOnWeekDays", js.undefined)
    
    @scala.inline
    def setRunsOnDayOfMonth(value: String): Self = this.set("runsOnDayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunsOnDayOfMonth: Self = this.set("runsOnDayOfMonth", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
}
