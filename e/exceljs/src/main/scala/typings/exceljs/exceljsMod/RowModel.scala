package typings.exceljs.exceljsMod

import typings.std.Partial
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
  var style: Partial[Style]
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
    style: Partial[Style]
  ): RowModel = {
    val __obj = js.Dynamic.literal(cells = cells, collapsed = collapsed, height = height, hidden = hidden, max = max, min = min, number = number, outlineLevel = outlineLevel, style = style)
  
    __obj.asInstanceOf[RowModel]
  }
}

