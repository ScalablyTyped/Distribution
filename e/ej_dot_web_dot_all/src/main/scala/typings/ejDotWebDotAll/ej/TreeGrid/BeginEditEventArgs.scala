package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginEditEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the Element of editing cell.
    */
  var cellElement: js.UndefOr[js.Any] = js.undefined
  /** Returns the column Index of cell belongs.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /** Returns the data of current cell record.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the row element of editing cell.
    */
  var rowElement: js.UndefOr[js.Any] = js.undefined
}

object BeginEditEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cellElement: js.Any = null,
    columnIndex: Int | Double = null,
    data: js.Any = null,
    rowElement: js.Any = null
  ): BeginEditEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (rowElement != null) __obj.updateDynamic("rowElement")(rowElement)
    __obj.asInstanceOf[BeginEditEventArgs]
  }
}

