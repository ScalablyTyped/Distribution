package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Borders> */
trait PartialBordersBottom extends js.Object {
  var bottom: js.UndefOr[PartialBorderColor] = js.undefined
  var diagonal: js.UndefOr[PartialBorderDiagonalColor] = js.undefined
  var left: js.UndefOr[PartialBorderColor] = js.undefined
  var right: js.UndefOr[PartialBorderColor] = js.undefined
  var top: js.UndefOr[PartialBorderColor] = js.undefined
}

object PartialBordersBottom {
  @scala.inline
  def apply(
    bottom: PartialBorderColor = null,
    diagonal: PartialBorderDiagonalColor = null,
    left: PartialBorderColor = null,
    right: PartialBorderColor = null,
    top: PartialBorderColor = null
  ): PartialBordersBottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (diagonal != null) __obj.updateDynamic("diagonal")(diagonal.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBordersBottom]
  }
}

