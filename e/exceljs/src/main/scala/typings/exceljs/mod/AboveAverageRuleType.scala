package typings.exceljs.mod

import typings.exceljs.exceljsStrings.aboveAverage
import org.scalablytyped.runtime.StObject
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
  implicit class AboveAverageRuleTypeMutableBuilder[Self <: AboveAverageRuleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAboveAverage(value: Boolean): Self = StObject.set(x, "aboveAverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: aboveAverage): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
