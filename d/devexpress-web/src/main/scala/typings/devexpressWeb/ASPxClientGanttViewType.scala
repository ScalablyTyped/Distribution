package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Declare client constants that specify the Gantt's view type.
  */
@js.native
trait ASPxClientGanttViewType extends js.Object {
  
  /**
    * Displays days.
    */
  var Days: Double = js.native
  
  /**
    * Displays hours.
    */
  var Hours: Double = js.native
  
  /**
    * Display months.
    */
  var Months: Double = js.native
  
  /**
    * Displays weeks.
    */
  var Weeks: Double = js.native
}
object ASPxClientGanttViewType {
  
  @scala.inline
  def apply(Days: Double, Hours: Double, Months: Double, Weeks: Double): ASPxClientGanttViewType = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Hours = Hours.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], Weeks = Weeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttViewType]
  }
  
  @scala.inline
  implicit class ASPxClientGanttViewTypeOps[Self <: ASPxClientGanttViewType] (val x: Self) extends AnyVal {
    
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
    def setDays(value: Double): Self = this.set("Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHours(value: Double): Self = this.set("Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonths(value: Double): Self = this.set("Months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeks(value: Double): Self = this.set("Weeks", value.asInstanceOf[js.Any])
  }
}
