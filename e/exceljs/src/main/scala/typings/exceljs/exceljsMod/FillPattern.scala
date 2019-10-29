package typings.exceljs.exceljsMod

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
    val __obj = js.Dynamic.literal(fgColor = fgColor, pattern = pattern)
    __obj.updateDynamic("type")(`type`)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    __obj.asInstanceOf[FillPattern]
  }
}

