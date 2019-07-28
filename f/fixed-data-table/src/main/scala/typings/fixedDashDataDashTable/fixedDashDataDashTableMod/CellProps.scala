package typings.fixedDashDataDashTable.fixedDashDataDashTableMod

import typings.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps extends HTMLAttributes[Cell] {
  /**
    * Optional prop that if specified on the Column will be
    * passed to the cell. It can be used to uniquely identify
    * which column is the cell is in.
    */
  var columnKey: js.UndefOr[String | Double] = js.undefined
  /**
    * Outer height of the cell.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The row index of the cell.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /**
    * Outer width of the cell.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[Cell] = null,
    columnKey: String | Double = null,
    height: Int | Double = null,
    rowIndex: Int | Double = null,
    width: Int | Double = null
  ): CellProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
}

