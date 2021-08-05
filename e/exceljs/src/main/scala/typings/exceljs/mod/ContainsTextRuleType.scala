package typings.exceljs.mod

import typings.exceljs.exceljsStrings.containsText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainsTextRuleType
  extends StObject
     with ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var operator: js.UndefOr[ContainsTextOperators] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: containsText
}
object ContainsTextRuleType {
  
  inline def apply(priority: Double): ContainsTextRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("containsText")
    __obj.asInstanceOf[ContainsTextRuleType]
  }
  
  extension [Self <: ContainsTextRuleType](x: Self) {
    
    inline def setOperator(value: ContainsTextOperators): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: containsText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
