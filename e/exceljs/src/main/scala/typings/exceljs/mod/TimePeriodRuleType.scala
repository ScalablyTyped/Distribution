package typings.exceljs.mod

import typings.exceljs.exceljsStrings.timePeriod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePeriodRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var timePeriod: js.UndefOr[TimePeriodTypes] = js.native
  
  var `type`: timePeriod = js.native
}
object TimePeriodRuleType {
  
  @scala.inline
  def apply(priority: Double, `type`: timePeriod): TimePeriodRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePeriodRuleType]
  }
  
  @scala.inline
  implicit class TimePeriodRuleTypeOps[Self <: TimePeriodRuleType] (val x: Self) extends AnyVal {
    
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
    def setType(value: timePeriod): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriod(value: TimePeriodTypes): Self = this.set("timePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePeriod: Self = this.set("timePeriod", js.undefined)
  }
}
