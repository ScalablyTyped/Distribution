package typings.exceljs.mod

import typings.exceljs.exceljsStrings.expression
import org.scalablytyped.runtime.StObject
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
  implicit class ExpressionRuleTypeMutableBuilder[Self <: ExpressionRuleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormulae(value: js.Array[_]): Self = StObject.set(x, "formulae", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaeUndefined: Self = StObject.set(x, "formulae", js.undefined)
    
    @scala.inline
    def setFormulaeVarargs(value: js.Any*): Self = StObject.set(x, "formulae", js.Array(value :_*))
    
    @scala.inline
    def setType(value: expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
