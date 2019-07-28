package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Borders extends js.Object {
  var bottom: js.UndefOr[Border] = js.undefined
  var diagonal: js.UndefOr[BorderDiagonal] = js.undefined
  var left: js.UndefOr[Border] = js.undefined
  var right: js.UndefOr[Border] = js.undefined
  var top: js.UndefOr[Border] = js.undefined
}

object Borders {
  @scala.inline
  def apply(
    bottom: Border = null,
    diagonal: BorderDiagonal = null,
    left: Border = null,
    right: Border = null,
    top: Border = null
  ): Borders = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (diagonal != null) __obj.updateDynamic("diagonal")(diagonal)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Borders]
  }
}

