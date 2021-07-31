package typings.exceljs.mod

import typings.exceljs.exceljsStrings.auto
import typings.exceljs.exceljsStrings.context
import typings.exceljs.exceljsStrings.dataBar
import typings.exceljs.exceljsStrings.leftToRight
import typings.exceljs.exceljsStrings.middle
import typings.exceljs.exceljsStrings.none_
import typings.exceljs.exceljsStrings.rightToLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataBarRuleType
  extends StObject
     with ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  
  var axisPosition: js.UndefOr[auto | middle | none_] = js.undefined
  
  var border: js.UndefOr[Boolean] = js.undefined
  
  var cfvo: js.UndefOr[js.Array[Cvfo]] = js.undefined
  
  var direction: js.UndefOr[context | leftToRight | rightToLeft] = js.undefined
  
  var gradient: js.UndefOr[Boolean] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var negativeBarBorderColorSameAsPositive: js.UndefOr[Boolean] = js.undefined
  
  var negativeBarColorSameAsPositive: js.UndefOr[Boolean] = js.undefined
  
  var showValue: js.UndefOr[Boolean] = js.undefined
  
  var `type`: dataBar
}
object DataBarRuleType {
  
  @scala.inline
  def apply(priority: Double): DataBarRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dataBar")
    __obj.asInstanceOf[DataBarRuleType]
  }
  
  @scala.inline
  implicit class DataBarRuleTypeMutableBuilder[Self <: DataBarRuleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisPosition(value: auto | middle | none_): Self = StObject.set(x, "axisPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisPositionUndefined: Self = StObject.set(x, "axisPosition", js.undefined)
    
    @scala.inline
    def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setCfvo(value: js.Array[Cvfo]): Self = StObject.set(x, "cfvo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCfvoUndefined: Self = StObject.set(x, "cfvo", js.undefined)
    
    @scala.inline
    def setCfvoVarargs(value: Cvfo*): Self = StObject.set(x, "cfvo", js.Array(value :_*))
    
    @scala.inline
    def setDirection(value: context | leftToRight | rightToLeft): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setGradient(value: Boolean): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setNegativeBarBorderColorSameAsPositive(value: Boolean): Self = StObject.set(x, "negativeBarBorderColorSameAsPositive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeBarBorderColorSameAsPositiveUndefined: Self = StObject.set(x, "negativeBarBorderColorSameAsPositive", js.undefined)
    
    @scala.inline
    def setNegativeBarColorSameAsPositive(value: Boolean): Self = StObject.set(x, "negativeBarColorSameAsPositive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeBarColorSameAsPositiveUndefined: Self = StObject.set(x, "negativeBarColorSameAsPositive", js.undefined)
    
    @scala.inline
    def setShowValue(value: Boolean): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValueUndefined: Self = StObject.set(x, "showValue", js.undefined)
    
    @scala.inline
    def setType(value: dataBar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
