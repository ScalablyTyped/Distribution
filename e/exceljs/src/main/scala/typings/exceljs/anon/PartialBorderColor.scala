package typings.exceljs.anon

import typings.exceljs.mod.BorderStyle
import typings.exceljs.mod.Color
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Border> */
trait PartialBorderColor extends js.Object {
  var color: js.UndefOr[Partial[Color]] = js.undefined
  var style: js.UndefOr[BorderStyle] = js.undefined
}

object PartialBorderColor {
  @scala.inline
  def apply(color: Partial[Color] = null, style: BorderStyle = null): PartialBorderColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBorderColor]
  }
}

