package typings.exceljs.anon

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
    height: js.UndefOr[Double] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    number: js.UndefOr[Double] = js.undefined,
    outlineLevel: js.UndefOr[Double] = js.undefined,
    style: PartialStyleAlignment = null
  ): PartialRowModel = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineLevel)) __obj.updateDynamic("outlineLevel")(outlineLevel.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRowModel]
  }
}

