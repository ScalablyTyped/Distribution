package typings.exceljs.mod

import typings.exceljs.exceljsStrings.containsText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainsTextRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var operator: js.UndefOr[ContainsTextOperators] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var `type`: containsText = js.native
}
object ContainsTextRuleType {
  
  @scala.inline
  def apply(priority: Double, `type`: containsText): ContainsTextRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsTextRuleType]
  }
  
  @scala.inline
  implicit class ContainsTextRuleTypeOps[Self <: ContainsTextRuleType] (val x: Self) extends AnyVal {
    
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
    def setType(value: containsText): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: ContainsTextOperators): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
