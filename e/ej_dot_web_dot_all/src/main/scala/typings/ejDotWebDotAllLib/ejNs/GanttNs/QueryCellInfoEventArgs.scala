package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryCellInfoEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the selecting cell element.
    */
  var cellElement: js.UndefOr[js.Any] = js.undefined
  /** Returns the value of cell.
    */
  var cellValue: js.UndefOr[java.lang.String] = js.undefined
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
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cellElement: js.Any = null,
    cellValue: java.lang.String = null,
    column: js.Any = null,
    data: js.Any = null
  ): QueryCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement)
    if (cellValue != null) __obj.updateDynamic("cellValue")(cellValue)
    if (column != null) __obj.updateDynamic("column")(column)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[QueryCellInfoEventArgs]
  }
}

