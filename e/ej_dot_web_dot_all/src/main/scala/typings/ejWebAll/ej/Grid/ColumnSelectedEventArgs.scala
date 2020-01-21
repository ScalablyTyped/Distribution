package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns corresponding column object (JSON).
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the selected cell index value.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /** Returns the selected header cell element.
    */
  var headerCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected header cell element.
    */
  var prevColumnHeaderCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected column index value.
    */
  var previousColumnIndex: js.UndefOr[Double] = js.undefined
  /** Returns the selected columns values.
    */
  var selectedColumnsIndex: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ColumnSelectedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    column: js.Any = null,
    columnIndex: Int | Double = null,
    headerCell: js.Any = null,
    model: js.Any = null,
    prevColumnHeaderCell: js.Any = null,
    previousColumnIndex: Int | Double = null,
    selectedColumnsIndex: js.Array[_] = null,
    `type`: String = null
  ): ColumnSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (headerCell != null) __obj.updateDynamic("headerCell")(headerCell.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (prevColumnHeaderCell != null) __obj.updateDynamic("prevColumnHeaderCell")(prevColumnHeaderCell.asInstanceOf[js.Any])
    if (previousColumnIndex != null) __obj.updateDynamic("previousColumnIndex")(previousColumnIndex.asInstanceOf[js.Any])
    if (selectedColumnsIndex != null) __obj.updateDynamic("selectedColumnsIndex")(selectedColumnsIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSelectedEventArgs]
  }
}

