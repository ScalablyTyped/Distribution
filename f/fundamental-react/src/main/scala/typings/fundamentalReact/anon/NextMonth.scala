package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NextMonth extends js.Object {
  
  var nextMonth: js.UndefOr[String] = js.native
  
  var previousMonth: js.UndefOr[String] = js.native
  
  var show12NextYears: js.UndefOr[String] = js.native
  
  var show12PreviousYears: js.UndefOr[String] = js.native
}
object NextMonth {
  
  @scala.inline
  def apply(): NextMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NextMonth]
  }
  
  @scala.inline
  implicit class NextMonthOps[Self <: NextMonth] (val x: Self) extends AnyVal {
    
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
    def setNextMonth(value: String): Self = this.set("nextMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMonth: Self = this.set("nextMonth", js.undefined)
    
    @scala.inline
    def setPreviousMonth(value: String): Self = this.set("previousMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousMonth: Self = this.set("previousMonth", js.undefined)
    
    @scala.inline
    def setShow12NextYears(value: String): Self = this.set("show12NextYears", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow12NextYears: Self = this.set("show12NextYears", js.undefined)
    
    @scala.inline
    def setShow12PreviousYears(value: String): Self = this.set("show12PreviousYears", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow12PreviousYears: Self = this.set("show12PreviousYears", js.undefined)
  }
}
