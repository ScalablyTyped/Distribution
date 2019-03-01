package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillPattern extends Fill {
  var bgColor: js.UndefOr[Color] = js.undefined
  var fgColor: js.UndefOr[Color] = js.undefined
  var pattern: FillPatterns
  var `type`: exceljsLib.exceljsLibStrings.pattern
}

object FillPattern {
  @scala.inline
  def apply(
    pattern: FillPatterns,
    `type`: exceljsLib.exceljsLibStrings.pattern,
    bgColor: Color = null,
    fgColor: Color = null
  ): FillPattern = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("pattern")(pattern)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (fgColor != null) __obj.updateDynamic("fgColor")(fgColor)
    __obj.asInstanceOf[FillPattern]
  }
}

