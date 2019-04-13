package typings
package fixedDashDataDashTableLib.fixedDashDataDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps
  extends reactLib.reactMod.HTMLAttributes[Cell] {
  /**
    * Optional prop that if specified on the Column will be
    * passed to the cell. It can be used to uniquely identify
    * which column is the cell is in.
    */
  var columnKey: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Outer height of the cell.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The row index of the cell.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Outer width of the cell.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[Cell] = null,
    columnKey: java.lang.String | scala.Double = null,
    height: scala.Int | scala.Double = null,
    rowIndex: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
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

