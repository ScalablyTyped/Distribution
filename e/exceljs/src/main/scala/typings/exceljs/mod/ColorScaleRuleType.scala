package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import typings.exceljs.exceljsStrings.colorScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorScaleRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var cfvo: js.UndefOr[js.Array[Cvfo]] = js.native
  
  var color: js.UndefOr[js.Array[PartialColor]] = js.native
  
  var `type`: colorScale = js.native
}
object ColorScaleRuleType {
  
  @scala.inline
  def apply(priority: Double, `type`: colorScale): ColorScaleRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScaleRuleType]
  }
  
  @scala.inline
  implicit class ColorScaleRuleTypeMutableBuilder[Self <: ColorScaleRuleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCfvo(value: js.Array[Cvfo]): Self = StObject.set(x, "cfvo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCfvoUndefined: Self = StObject.set(x, "cfvo", js.undefined)
    
    @scala.inline
    def setCfvoVarargs(value: Cvfo*): Self = StObject.set(x, "cfvo", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: js.Array[PartialColor]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: PartialColor*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setType(value: colorScale): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
