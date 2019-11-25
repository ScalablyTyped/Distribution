package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndEditEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the Element of editing cell.
    */
  var cellElement: js.UndefOr[js.Any] = js.undefined
  /** Returns the column name of edited cell belongs.
    */
  var columnName: js.UndefOr[String] = js.undefined
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
    cancel: js.UndefOr[Boolean] = js.undefined,
    cellElement: js.Any = null,
    columnName: String = null,
    columnObject: js.Any = null,
    data: js.Any = null,
    rowElement: js.Any = null
  ): EndEditEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (columnObject != null) __obj.updateDynamic("columnObject")(columnObject.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (rowElement != null) __obj.updateDynamic("rowElement")(rowElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndEditEventArgs]
  }
}

