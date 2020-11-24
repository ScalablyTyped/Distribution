package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkHours extends js.Object {
  
  /** Sets the end time to depict the end of working or business hour in a day.
    * @Default {18}
    */
  var end: js.UndefOr[Double] = js.native
  
  /** When set to true, highlights the work hours of the Schedule.
    * @Default {true}
    */
  var highlight: js.UndefOr[Boolean] = js.native
  
  /** Sets the start time to depict the start of working or business hour in a day.
    * @Default {9}
    */
  var start: js.UndefOr[Double] = js.native
}
object WorkHours {
  
  @scala.inline
  def apply(): WorkHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkHours]
  }
  
  @scala.inline
  implicit class WorkHoursOps[Self <: WorkHours] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
