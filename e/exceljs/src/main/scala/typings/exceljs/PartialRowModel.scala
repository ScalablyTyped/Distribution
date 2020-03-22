package typings.exceljs

import typings.exceljs.mod.CellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.RowModel> */
trait PartialRowModel extends js.Object {
  var cells: js.UndefOr[js.Array[CellModel]] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var outlineLevel: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[PartialStyleAlignment] = js.undefined
}

object PartialRowModel {
  @scala.inline
  def apply(
    cells: js.Array[CellModel] = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    number: Int | Double = null,
    outlineLevel: Int | Double = null,
    style: PartialStyleAlignment = null
  ): PartialRowModel = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (outlineLevel != null) __obj.updateDynamic("outlineLevel")(outlineLevel.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRowModel]
  }
}

