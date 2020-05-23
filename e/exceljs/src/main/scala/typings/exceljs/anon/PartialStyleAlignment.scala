package typings.exceljs.anon

import typings.exceljs.mod.Fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Style> */
trait PartialStyleAlignment extends js.Object {
  var alignment: js.UndefOr[PartialAlignment] = js.undefined
  var border: js.UndefOr[PartialBordersDiagonal] = js.undefined
  var fill: js.UndefOr[Fill] = js.undefined
  var font: js.UndefOr[PartialFontBold] = js.undefined
  var numFmt: js.UndefOr[String] = js.undefined
  var protection: js.UndefOr[PartialProtection] = js.undefined
}

object PartialStyleAlignment {
  @scala.inline
  def apply(
    alignment: PartialAlignment = null,
    border: PartialBordersDiagonal = null,
    fill: Fill = null,
    font: PartialFontBold = null,
    numFmt: String = null,
    protection: PartialProtection = null
  ): PartialStyleAlignment = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (numFmt != null) __obj.updateDynamic("numFmt")(numFmt.asInstanceOf[js.Any])
    if (protection != null) __obj.updateDynamic("protection")(protection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleAlignment]
  }
}

