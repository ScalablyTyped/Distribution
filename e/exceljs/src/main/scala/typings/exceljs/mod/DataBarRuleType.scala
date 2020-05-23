package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import typings.exceljs.exceljsStrings.auto
import typings.exceljs.exceljsStrings.context
import typings.exceljs.exceljsStrings.dataBar
import typings.exceljs.exceljsStrings.leftToRight
import typings.exceljs.exceljsStrings.middle
import typings.exceljs.exceljsStrings.none_
import typings.exceljs.exceljsStrings.rightToLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataBarRuleType
  extends ConditionalFormattingBaseRule
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
  def apply(
    priority: Double,
    `type`: dataBar,
    axisPosition: auto | middle | none_ = null,
    border: js.UndefOr[Boolean] = js.undefined,
    cfvo: js.Array[Cvfo] = null,
    direction: context | leftToRight | rightToLeft = null,
    gradient: js.UndefOr[Boolean] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    negativeBarBorderColorSameAsPositive: js.UndefOr[Boolean] = js.undefined,
    negativeBarColorSameAsPositive: js.UndefOr[Boolean] = js.undefined,
    showValue: js.UndefOr[Boolean] = js.undefined,
    style: PartialStyle = null
  ): DataBarRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (axisPosition != null) __obj.updateDynamic("axisPosition")(axisPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.get.asInstanceOf[js.Any])
    if (cfvo != null) __obj.updateDynamic("cfvo")(cfvo.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(gradient)) __obj.updateDynamic("gradient")(gradient.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(negativeBarBorderColorSameAsPositive)) __obj.updateDynamic("negativeBarBorderColorSameAsPositive")(negativeBarBorderColorSameAsPositive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(negativeBarColorSameAsPositive)) __obj.updateDynamic("negativeBarColorSameAsPositive")(negativeBarColorSameAsPositive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBarRuleType]
  }
}

