package typings.exceljs.mod

import typings.exceljs.exceljsStrings.expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var formulae: js.UndefOr[js.Array[_]] = js.native
  
  var `type`: expression = js.native
}
object ExpressionRuleType {
  
  @scala.inline
  def apply(priority: Double, `type`: expression): ExpressionRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionRuleType]
  }
  
  @scala.inline
  implicit class ExpressionRuleTypeOps[Self <: ExpressionRuleType] (val x: Self) extends AnyVal {
    
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
    def setType(value: expression): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaeVarargs(value: js.Any*): Self = this.set("formulae", js.Array(value :_*))
    
    @scala.inline
    def setFormulae(value: js.Array[_]): Self = this.set("formulae", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormulae: Self = this.set("formulae", js.undefined)
  }
}
