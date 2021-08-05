package typings.exceljs.mod

import typings.exceljs.exceljsStrings.aboveAverage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AboveAverageRuleType
  extends StObject
     with ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var aboveAverage: Boolean
  
  var `type`: aboveAverage
}
object AboveAverageRuleType {
  
  inline def apply(aboveAverage: Boolean, priority: Double): AboveAverageRuleType = {
    val __obj = js.Dynamic.literal(aboveAverage = aboveAverage.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("aboveAverage")
    __obj.asInstanceOf[AboveAverageRuleType]
  }
  
  extension [Self <: AboveAverageRuleType](x: Self) {
    
    inline def setAboveAverage(value: Boolean): Self = StObject.set(x, "aboveAverage", value.asInstanceOf[js.Any])
    
    inline def setType(value: aboveAverage): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
