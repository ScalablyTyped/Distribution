package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import typings.exceljs.exceljsStrings.iconSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconSetRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  var cfvo: js.UndefOr[js.Array[Cvfo]] = js.undefined
  var custom: js.UndefOr[Boolean] = js.undefined
  var iconSet: js.UndefOr[IconSetTypes] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var showValue: js.UndefOr[Boolean] = js.undefined
  var `type`: iconSet
}

object IconSetRuleType {
  @scala.inline
  def apply(
    priority: Double,
    `type`: iconSet,
    cfvo: js.Array[Cvfo] = null,
    custom: js.UndefOr[Boolean] = js.undefined,
    iconSet: IconSetTypes = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    showValue: js.UndefOr[Boolean] = js.undefined,
    style: PartialStyle = null
  ): IconSetRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cfvo != null) __obj.updateDynamic("cfvo")(cfvo.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.get.asInstanceOf[js.Any])
    if (iconSet != null) __obj.updateDynamic("iconSet")(iconSet.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSetRuleType]
  }
}

