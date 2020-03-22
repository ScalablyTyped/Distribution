package typings.exceljs.mod

import typings.exceljs.PartialColor
import typings.exceljs.exceljsStrings.pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillPattern extends Fill {
  var bgColor: js.UndefOr[PartialColor] = js.undefined
  var fgColor: PartialColor
  var pattern: FillPatterns
  var `type`: pattern
}

object FillPattern {
  @scala.inline
  def apply(fgColor: PartialColor, pattern: FillPatterns, `type`: pattern, bgColor: PartialColor = null): FillPattern = {
    val __obj = js.Dynamic.literal(fgColor = fgColor.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillPattern]
  }
}

