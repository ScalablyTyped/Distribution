package typings.exceljs.mod

import typings.exceljs.exceljsStrings.cellIs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellIsRuleType
  extends StObject
     with ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var formulae: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var operator: js.UndefOr[CellIsOperators] = js.undefined
  
  var `type`: cellIs
}
object CellIsRuleType {
  
  inline def apply(priority: Double): CellIsRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cellIs")
    __obj.asInstanceOf[CellIsRuleType]
  }
  
  extension [Self <: CellIsRuleType](x: Self) {
    
    inline def setFormulae(value: js.Array[js.Any]): Self = StObject.set(x, "formulae", value.asInstanceOf[js.Any])
    
    inline def setFormulaeUndefined: Self = StObject.set(x, "formulae", js.undefined)
    
    inline def setFormulaeVarargs(value: js.Any*): Self = StObject.set(x, "formulae", js.Array(value :_*))
    
    inline def setOperator(value: CellIsOperators): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setType(value: cellIs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
