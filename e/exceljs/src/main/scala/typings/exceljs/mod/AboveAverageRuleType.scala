package typings.exceljs.mod

import typings.exceljs.exceljsStrings.aboveAverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AboveAverageRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var aboveAverage: Boolean = js.native
  
  var `type`: aboveAverage = js.native
}
object AboveAverageRuleType {
  
  @scala.inline
  def apply(aboveAverage: Boolean, priority: Double, `type`: aboveAverage): AboveAverageRuleType = {
    val __obj = js.Dynamic.literal(aboveAverage = aboveAverage.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboveAverageRuleType]
  }
  
  @scala.inline
  implicit class AboveAverageRuleTypeOps[Self <: AboveAverageRuleType] (val x: Self) extends AnyVal {
    
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
    def setAboveAverage(value: Boolean): Self = this.set("aboveAverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: aboveAverage): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
