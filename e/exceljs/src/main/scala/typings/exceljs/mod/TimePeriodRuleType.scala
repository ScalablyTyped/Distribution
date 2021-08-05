package typings.exceljs.mod

import typings.exceljs.exceljsStrings.timePeriod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePeriodRuleType
  extends StObject
     with ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var timePeriod: js.UndefOr[TimePeriodTypes] = js.undefined
  
  var `type`: timePeriod
}
object TimePeriodRuleType {
  
  inline def apply(priority: Double): TimePeriodRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timePeriod")
    __obj.asInstanceOf[TimePeriodRuleType]
  }
  
  extension [Self <: TimePeriodRuleType](x: Self) {
    
    inline def setTimePeriod(value: TimePeriodTypes): Self = StObject.set(x, "timePeriod", value.asInstanceOf[js.Any])
    
    inline def setTimePeriodUndefined: Self = StObject.set(x, "timePeriod", js.undefined)
    
    inline def setType(value: timePeriod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
