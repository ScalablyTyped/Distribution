package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import typings.exceljs.exceljsStrings.colorScale
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
  implicit class ColorScaleRuleTypeOps[Self <: ColorScaleRuleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: colorScale): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCfvoVarargs(value: Cvfo*): Self = this.set("cfvo", js.Array(value :_*))
    
    @scala.inline
    def setCfvo(value: js.Array[Cvfo]): Self = this.set("cfvo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCfvo: Self = this.set("cfvo", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: PartialColor*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: js.Array[PartialColor]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
}
