package typings.exceljs.mod

import typings.exceljs.exceljsStrings.cellIs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellIsRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var formulae: js.UndefOr[js.Array[_]] = js.native
  
  var operator: js.UndefOr[CellIsOperators] = js.native
  
  var `type`: cellIs = js.native
}
object CellIsRuleType {
  
  @scala.inline
  def apply(priority: Double, `type`: cellIs): CellIsRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellIsRuleType]
  }
  
  @scala.inline
  implicit class CellIsRuleTypeMutableBuilder[Self <: CellIsRuleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormulae(value: js.Array[_]): Self = StObject.set(x, "formulae", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaeUndefined: Self = StObject.set(x, "formulae", js.undefined)
    
    @scala.inline
    def setFormulaeVarargs(value: js.Any*): Self = StObject.set(x, "formulae", js.Array(value :_*))
    
    @scala.inline
    def setOperator(value: CellIsOperators): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setType(value: cellIs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
