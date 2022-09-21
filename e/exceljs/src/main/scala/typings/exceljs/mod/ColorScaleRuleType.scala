package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import typings.exceljs.exceljsStrings.colorScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorScaleRuleType
  extends StObject
     with ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var cfvo: js.UndefOr[js.Array[Cvfo]] = js.undefined
  
  var color: js.UndefOr[js.Array[PartialColor]] = js.undefined
  
  var `type`: colorScale
}
object ColorScaleRuleType {
  
  inline def apply(priority: Double): ColorScaleRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("colorScale")
    __obj.asInstanceOf[ColorScaleRuleType]
  }
  
  extension [Self <: ColorScaleRuleType](x: Self) {
    
    inline def setCfvo(value: js.Array[Cvfo]): Self = StObject.set(x, "cfvo", value.asInstanceOf[js.Any])
    
    inline def setCfvoUndefined: Self = StObject.set(x, "cfvo", js.undefined)
    
    inline def setCfvoVarargs(value: Cvfo*): Self = StObject.set(x, "cfvo", js.Array(value*))
    
    inline def setColor(value: js.Array[PartialColor]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: PartialColor*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setType(value: colorScale): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
