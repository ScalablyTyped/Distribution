package typings.exceljs.mod

import typings.exceljs.exceljsStrings.iconSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconSetRuleType
  extends StObject
     with ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var cfvo: js.UndefOr[js.Array[Cvfo]] = js.undefined
  
  var custom: js.UndefOr[Boolean] = js.undefined
  
  var iconSet: js.UndefOr[IconSetTypes] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var showValue: js.UndefOr[Boolean] = js.undefined
  
  var `type`: iconSet
}
object IconSetRuleType {
  
  inline def apply(priority: Double): IconSetRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("iconSet")
    __obj.asInstanceOf[IconSetRuleType]
  }
  
  extension [Self <: IconSetRuleType](x: Self) {
    
    inline def setCfvo(value: js.Array[Cvfo]): Self = StObject.set(x, "cfvo", value.asInstanceOf[js.Any])
    
    inline def setCfvoUndefined: Self = StObject.set(x, "cfvo", js.undefined)
    
    inline def setCfvoVarargs(value: Cvfo*): Self = StObject.set(x, "cfvo", js.Array(value :_*))
    
    inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setIconSet(value: IconSetTypes): Self = StObject.set(x, "iconSet", value.asInstanceOf[js.Any])
    
    inline def setIconSetUndefined: Self = StObject.set(x, "iconSet", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setShowValue(value: Boolean): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
    
    inline def setShowValueUndefined: Self = StObject.set(x, "showValue", js.undefined)
    
    inline def setType(value: iconSet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
