package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderDiagonal extends Border {
  var down: js.UndefOr[Boolean] = js.undefined
  var up: js.UndefOr[Boolean] = js.undefined
}

object BorderDiagonal {
  @scala.inline
  def apply(
    color: Color = null,
    down: js.UndefOr[Boolean] = js.undefined,
    style: BorderStyle = null,
    up: js.UndefOr[Boolean] = js.undefined
  ): BorderDiagonal = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(down)) __obj.updateDynamic("down")(down)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(up)) __obj.updateDynamic("up")(up)
    __obj.asInstanceOf[BorderDiagonal]
  }
}

