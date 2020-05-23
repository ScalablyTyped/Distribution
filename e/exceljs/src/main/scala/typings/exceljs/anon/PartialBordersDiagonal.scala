package typings.exceljs.anon

import typings.exceljs.mod.Border
import typings.exceljs.mod.BorderDiagonal
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Borders> */
trait PartialBordersDiagonal extends js.Object {
  var bottom: js.UndefOr[Partial[Border]] = js.undefined
  var diagonal: js.UndefOr[Partial[BorderDiagonal]] = js.undefined
  var left: js.UndefOr[Partial[Border]] = js.undefined
  var right: js.UndefOr[Partial[Border]] = js.undefined
  var top: js.UndefOr[Partial[Border]] = js.undefined
}

object PartialBordersDiagonal {
  @scala.inline
  def apply(
    bottom: Partial[Border] = null,
    diagonal: Partial[BorderDiagonal] = null,
    left: Partial[Border] = null,
    right: Partial[Border] = null,
    top: Partial[Border] = null
  ): PartialBordersDiagonal = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (diagonal != null) __obj.updateDynamic("diagonal")(diagonal.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBordersDiagonal]
  }
}

