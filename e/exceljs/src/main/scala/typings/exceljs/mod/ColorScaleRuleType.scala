package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import typings.exceljs.anon.PartialStyle
import typings.exceljs.exceljsStrings.colorScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorScaleRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  var cfvo: js.UndefOr[js.Array[Cvfo]] = js.undefined
  var color: js.UndefOr[PartialColor] = js.undefined
  var `type`: colorScale
}

object ColorScaleRuleType {
  @scala.inline
  def apply(
    priority: Double,
    `type`: colorScale,
    cfvo: js.Array[Cvfo] = null,
    color: PartialColor = null,
    style: PartialStyle = null
  ): ColorScaleRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cfvo != null) __obj.updateDynamic("cfvo")(cfvo.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScaleRuleType]
  }
}

