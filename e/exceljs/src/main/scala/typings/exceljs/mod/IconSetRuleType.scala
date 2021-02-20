package typings.exceljs.mod

import typings.exceljs.exceljsStrings.iconSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconSetRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var cfvo: js.UndefOr[js.Array[Cvfo]] = js.native
  
  var custom: js.UndefOr[Boolean] = js.native
  
  var iconSet: js.UndefOr[IconSetTypes] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var showValue: js.UndefOr[Boolean] = js.native
  
  var `type`: iconSet = js.native
}
object IconSetRuleType {
  
  @scala.inline
  def apply(priority: Double, `type`: iconSet): IconSetRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSetRuleType]
  }
  
  @scala.inline
  implicit class IconSetRuleTypeMutableBuilder[Self <: IconSetRuleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCfvo(value: js.Array[Cvfo]): Self = StObject.set(x, "cfvo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCfvoUndefined: Self = StObject.set(x, "cfvo", js.undefined)
    
    @scala.inline
    def setCfvoVarargs(value: Cvfo*): Self = StObject.set(x, "cfvo", js.Array(value :_*))
    
    @scala.inline
    def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setIconSet(value: IconSetTypes): Self = StObject.set(x, "iconSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSetUndefined: Self = StObject.set(x, "iconSet", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setShowValue(value: Boolean): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValueUndefined: Self = StObject.set(x, "showValue", js.undefined)
    
    @scala.inline
    def setType(value: iconSet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
