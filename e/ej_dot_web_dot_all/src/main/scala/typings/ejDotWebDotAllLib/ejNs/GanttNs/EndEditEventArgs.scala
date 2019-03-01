package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndEditEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the Element of editing cell.
    */
  var cellElement: js.UndefOr[js.Any] = js.undefined
  /** Returns the column name of edited cell belongs.
    */
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the column object of edited cell belongs.
    */
  var columnObject: js.UndefOr[js.Any] = js.undefined
  /** Returns the data of edited cell record.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the row element of editing cell.
    */
  var rowElement: js.UndefOr[js.Any] = js.undefined
}

object EndEditEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cellElement: js.Any = null,
    columnName: java.lang.String = null,
    columnObject: js.Any = null,
    data: js.Any = null,
    rowElement: js.Any = null
  ): EndEditEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement)
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (columnObject != null) __obj.updateDynamic("columnObject")(columnObject)
    if (data != null) __obj.updateDynamic("data")(data)
    if (rowElement != null) __obj.updateDynamic("rowElement")(rowElement)
    __obj.asInstanceOf[EndEditEventArgs]
  }
}

