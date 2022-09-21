package typings.exceljs.mod

import typings.exceljs.exceljsStrings.expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionRuleType
  extends StObject
     with ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var formulae: js.UndefOr[js.Array[Any]] = js.undefined
  
  var `type`: expression
}
object ExpressionRuleType {
  
  inline def apply(priority: Double): ExpressionRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("expression")
    __obj.asInstanceOf[ExpressionRuleType]
  }
  
  extension [Self <: ExpressionRuleType](x: Self) {
    
    inline def setFormulae(value: js.Array[Any]): Self = StObject.set(x, "formulae", value.asInstanceOf[js.Any])
    
    inline def setFormulaeUndefined: Self = StObject.set(x, "formulae", js.undefined)
    
    inline def setFormulaeVarargs(value: Any*): Self = StObject.set(x, "formulae", js.Array(value*))
    
    inline def setType(value: expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
