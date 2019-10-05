package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDeselectingEventArgs extends js.Object {
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns whether the ctrl key is pressed while deselecting row
    */
  var isCtrlKeyPressed: js.UndefOr[Boolean] = js.undefined
  /** Returns whether the shift key is pressed while deselecting row
    */
  var isShiftKeyPressed: js.UndefOr[Boolean] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the deselecting row element.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns the deselecting row index value.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** Returns current record object (JSON).
    */
  var selectedData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object RowDeselectingEventArgs {
  @scala.inline
  def apply(
    data: js.Any = null,
    isCtrlKeyPressed: js.UndefOr[Boolean] = js.undefined,
    isShiftKeyPressed: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    row: js.Any = null,
    rowIndex: Int | Double = null,
    selectedData: js.Any = null,
    `type`: String = null
  ): RowDeselectingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(isCtrlKeyPressed)) __obj.updateDynamic("isCtrlKeyPressed")(isCtrlKeyPressed)
    if (!js.isUndefined(isShiftKeyPressed)) __obj.updateDynamic("isShiftKeyPressed")(isShiftKeyPressed)
    if (model != null) __obj.updateDynamic("model")(model)
    if (row != null) __obj.updateDynamic("row")(row)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (selectedData != null) __obj.updateDynamic("selectedData")(selectedData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowDeselectingEventArgs]
  }
}

