package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowModel extends js.Object {
  var cells: js.Array[CellModel]
  var collapsed: Boolean
  var height: Double
  var hidden: Boolean
  var max: Double
  var min: Double
  var number: Double
  var outlineLevel: Double
  var style: PartialStyle
}

object RowModel {
  @scala.inline
  def apply(
    cells: js.Array[CellModel],
    collapsed: Boolean,
    height: Double,
    hidden: Boolean,
    max: Double,
    min: Double,
    number: Double,
    outlineLevel: Double,
    style: PartialStyle
  ): RowModel = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], outlineLevel = outlineLevel.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowModel]
  }
}

