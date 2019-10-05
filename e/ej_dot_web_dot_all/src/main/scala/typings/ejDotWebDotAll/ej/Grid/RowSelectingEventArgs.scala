package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSelectingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected row element.
    */
  var prevRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected row index.
    */
  var prevRowIndex: js.UndefOr[Double] = js.undefined
  /** Returns the selected row element.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns the selected row index value.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** Returns current record object (JSON).
    */
  var selectedData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object RowSelectingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    model: js.Any = null,
    prevRow: js.Any = null,
    prevRowIndex: Int | Double = null,
    row: js.Any = null,
    rowIndex: Int | Double = null,
    selectedData: js.Any = null,
    `type`: String = null
  ): RowSelectingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevRow != null) __obj.updateDynamic("prevRow")(prevRow)
    if (prevRowIndex != null) __obj.updateDynamic("prevRowIndex")(prevRowIndex.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (selectedData != null) __obj.updateDynamic("selectedData")(selectedData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowSelectingEventArgs]
  }
}

