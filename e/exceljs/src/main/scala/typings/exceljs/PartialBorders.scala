package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Borders> */
trait PartialBorders extends js.Object {
  var bottom: js.UndefOr[PartialBorder] = js.undefined
  var diagonal: js.UndefOr[PartialBorderDiagonal] = js.undefined
  var left: js.UndefOr[PartialBorder] = js.undefined
  var right: js.UndefOr[PartialBorder] = js.undefined
  var top: js.UndefOr[PartialBorder] = js.undefined
}

object PartialBorders {
  @scala.inline
  def apply(
    bottom: PartialBorder = null,
    diagonal: PartialBorderDiagonal = null,
    left: PartialBorder = null,
    right: PartialBorder = null,
    top: PartialBorder = null
  ): PartialBorders = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (diagonal != null) __obj.updateDynamic("diagonal")(diagonal.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBorders]
  }
}

