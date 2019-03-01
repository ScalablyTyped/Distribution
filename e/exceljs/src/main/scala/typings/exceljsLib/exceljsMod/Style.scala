package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var alignment: js.UndefOr[Alignment] = js.undefined
  var border: js.UndefOr[Borders] = js.undefined
  var fill: js.UndefOr[Fill] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var numFmt: js.UndefOr[java.lang.String] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    alignment: Alignment = null,
    border: Borders = null,
    fill: Fill = null,
    font: Font = null,
    numFmt: java.lang.String = null
  ): Style = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (border != null) __obj.updateDynamic("border")(border)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (numFmt != null) __obj.updateDynamic("numFmt")(numFmt)
    __obj.asInstanceOf[Style]
  }
}

