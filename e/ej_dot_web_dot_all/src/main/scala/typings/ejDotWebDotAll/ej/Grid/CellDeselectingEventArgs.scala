package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellDeselectingEventArgs extends js.Object {
  /** Returns the deselecting cell index value.
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  /** Returns the deselecting cell element.
    */
  var currentCell: js.UndefOr[js.Any] = js.undefined
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns whether the ctrl key is pressed while deselecting cell
    */
  var isCtrlKeyPressed: js.UndefOr[Boolean] = js.undefined
  /** Returns whether the shift key is pressed while deselecting cell
    */
  var isShiftKeyPressed: js.UndefOr[Boolean] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns current record object (JSON).
    */
  var selectedData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CellDeselectingEventArgs {
  @scala.inline
  def apply(
    cellIndex: Int | Double = null,
    currentCell: js.Any = null,
    data: js.Any = null,
    isCtrlKeyPressed: js.UndefOr[Boolean] = js.undefined,
    isShiftKeyPressed: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    selectedData: js.Any = null,
    `type`: String = null
  ): CellDeselectingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(isCtrlKeyPressed)) __obj.updateDynamic("isCtrlKeyPressed")(isCtrlKeyPressed.asInstanceOf[js.Any])
    if (!js.isUndefined(isShiftKeyPressed)) __obj.updateDynamic("isShiftKeyPressed")(isShiftKeyPressed.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (selectedData != null) __obj.updateDynamic("selectedData")(selectedData.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellDeselectingEventArgs]
  }
}

