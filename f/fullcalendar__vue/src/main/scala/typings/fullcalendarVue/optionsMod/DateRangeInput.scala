package typings.fullcalendarVue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangeInput extends js.Object {
  
  var end: js.UndefOr[DateInput] = js.native
  
  var start: js.UndefOr[DateInput] = js.native
}
object DateRangeInput {
  
  @scala.inline
  def apply(): DateRangeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangeInput]
  }
  
  @scala.inline
  implicit class DateRangeInputOps[Self <: DateRangeInput] (val x: Self) extends AnyVal {
    
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
    def setEndVarargs(value: Double*): Self = this.set("end", js.Array(value :_*))
    
    @scala.inline
    def setEnd(value: DateInput): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStartVarargs(value: Double*): Self = this.set("start", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: DateInput): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
