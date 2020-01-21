package typings.exceljs.mod

import typings.exceljs.exceljsStrings.pattern
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillPattern extends Fill {
  var bgColor: js.UndefOr[Partial[Color]] = js.undefined
  var fgColor: Partial[Color]
  var pattern: FillPatterns
  var `type`: pattern
}

object FillPattern {
  @scala.inline
  def apply(fgColor: Partial[Color], pattern: FillPatterns, `type`: pattern, bgColor: Partial[Color] = null): FillPattern = {
    val __obj = js.Dynamic.literal(fgColor = fgColor.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillPattern]
  }
}

