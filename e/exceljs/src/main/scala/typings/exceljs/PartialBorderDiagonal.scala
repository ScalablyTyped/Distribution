package typings.exceljs

import typings.exceljs.mod.BorderStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.BorderDiagonal> */
trait PartialBorderDiagonal extends js.Object {
  var color: js.UndefOr[PartialColor] = js.undefined
  var down: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[BorderStyle] = js.undefined
  var up: js.UndefOr[Boolean] = js.undefined
}

object PartialBorderDiagonal {
  @scala.inline
  def apply(
    color: PartialColor = null,
    down: js.UndefOr[Boolean] = js.undefined,
    style: BorderStyle = null,
    up: js.UndefOr[Boolean] = js.undefined
  ): PartialBorderDiagonal = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(down)) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(up)) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBorderDiagonal]
  }
}

