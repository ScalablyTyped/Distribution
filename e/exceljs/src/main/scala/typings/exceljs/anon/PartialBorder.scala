package typings.exceljs.anon

import typings.exceljs.mod.BorderStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Border> */
trait PartialBorder extends js.Object {
  var color: js.UndefOr[PartialColor] = js.undefined
  var style: js.UndefOr[BorderStyle] = js.undefined
}

object PartialBorder {
  @scala.inline
  def apply(color: PartialColor = null, style: BorderStyle = null): PartialBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBorder]
  }
}

