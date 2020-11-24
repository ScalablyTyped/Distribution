package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderDates extends js.Object {
  
  /** Sets the end limit of the custom date range.
    * @Default {null}
    */
  var end: js.UndefOr[js.Any] = js.native
  
  /** Sets the start of custom date range to be rendered in the Schedule.
    * @Default {null}
    */
  var start: js.UndefOr[js.Any] = js.native
}
object RenderDates {
  
  @scala.inline
  def apply(): RenderDates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderDates]
  }
  
  @scala.inline
  implicit class RenderDatesOps[Self <: RenderDates] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: js.Any): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStart(value: js.Any): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
