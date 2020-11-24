package typings.exceljs.mod

import typings.exceljs.exceljsStrings.auto
import typings.exceljs.exceljsStrings.context
import typings.exceljs.exceljsStrings.dataBar
import typings.exceljs.exceljsStrings.leftToRight
import typings.exceljs.exceljsStrings.middle
import typings.exceljs.exceljsStrings.none_
import typings.exceljs.exceljsStrings.rightToLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataBarRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var axisPosition: js.UndefOr[auto | middle | none_] = js.native
  
  var border: js.UndefOr[Boolean] = js.native
  
  var cfvo: js.UndefOr[js.Array[Cvfo]] = js.native
  
  var direction: js.UndefOr[context | leftToRight | rightToLeft] = js.native
  
  var gradient: js.UndefOr[Boolean] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var negativeBarBorderColorSameAsPositive: js.UndefOr[Boolean] = js.native
  
  var negativeBarColorSameAsPositive: js.UndefOr[Boolean] = js.native
  
  var showValue: js.UndefOr[Boolean] = js.native
  
  var `type`: dataBar = js.native
}
object DataBarRuleType {
  
  @scala.inline
  def apply(priority: Double, `type`: dataBar): DataBarRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBarRuleType]
  }
  
  @scala.inline
  implicit class DataBarRuleTypeOps[Self <: DataBarRuleType] (val x: Self) extends AnyVal {
    
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
    def setType(value: dataBar): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisPosition(value: auto | middle | none_): Self = this.set("axisPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisPosition: Self = this.set("axisPosition", js.undefined)
    
    @scala.inline
    def setBorder(value: Boolean): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setCfvoVarargs(value: Cvfo*): Self = this.set("cfvo", js.Array(value :_*))
    
    @scala.inline
    def setCfvo(value: js.Array[Cvfo]): Self = this.set("cfvo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCfvo: Self = this.set("cfvo", js.undefined)
    
    @scala.inline
    def setDirection(value: context | leftToRight | rightToLeft): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setGradient(value: Boolean): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setNegativeBarBorderColorSameAsPositive(value: Boolean): Self = this.set("negativeBarBorderColorSameAsPositive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeBarBorderColorSameAsPositive: Self = this.set("negativeBarBorderColorSameAsPositive", js.undefined)
    
    @scala.inline
    def setNegativeBarColorSameAsPositive(value: Boolean): Self = this.set("negativeBarColorSameAsPositive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeBarColorSameAsPositive: Self = this.set("negativeBarColorSameAsPositive", js.undefined)
    
    @scala.inline
    def setShowValue(value: Boolean): Self = this.set("showValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowValue: Self = this.set("showValue", js.undefined)
  }
}
