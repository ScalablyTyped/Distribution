package typings.ejDotWebDotAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryCellInfoEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the selecting cell element.
    */
  var cellElement: js.UndefOr[js.Any] = js.undefined
  /** Returns the value of cell.
    */
  var cellValue: js.UndefOr[String] = js.undefined
  /** Returns the column of cell belongs.
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the data of current cell record.
    */
  var data: js.UndefOr[js.Any] = js.undefined
}

object QueryCellInfoEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cellElement: js.Any = null,
    cellValue: String = null,
    column: js.Any = null,
    data: js.Any = null
  ): QueryCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement.asInstanceOf[js.Any])
    if (cellValue != null) __obj.updateDynamic("cellValue")(cellValue.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryCellInfoEventArgs]
  }
}

