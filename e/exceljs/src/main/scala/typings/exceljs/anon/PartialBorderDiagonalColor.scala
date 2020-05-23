package typings.exceljs.anon

import typings.exceljs.mod.BorderStyle
import typings.exceljs.mod.Color
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.BorderDiagonal> */
trait PartialBorderDiagonalColor extends js.Object {
  var color: js.UndefOr[Partial[Color]] = js.undefined
  var down: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[BorderStyle] = js.undefined
  var up: js.UndefOr[Boolean] = js.undefined
}

object PartialBorderDiagonalColor {
  @scala.inline
  def apply(
    color: Partial[Color] = null,
    down: js.UndefOr[Boolean] = js.undefined,
    style: BorderStyle = null,
    up: js.UndefOr[Boolean] = js.undefined
  ): PartialBorderDiagonalColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(down)) __obj.updateDynamic("down")(down.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(up)) __obj.updateDynamic("up")(up.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBorderDiagonalColor]
  }
}

