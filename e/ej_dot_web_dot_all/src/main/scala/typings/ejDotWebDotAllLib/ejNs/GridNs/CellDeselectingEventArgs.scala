package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellDeselectingEventArgs extends js.Object {
  /** Returns the deselecting cell index value.
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the deselecting cell element.
    */
  var currentCell: js.UndefOr[js.Any] = js.undefined
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns whether the ctrl key is pressed while deselecting cell
    */
  var isCtrlKeyPressed: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns whether the shift key is pressed while deselecting cell
    */
  var isShiftKeyPressed: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns current record object (JSON).
    */
  var selectedData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CellDeselectingEventArgs {
  @scala.inline
  def apply(
    cellIndex: scala.Int | scala.Double = null,
    currentCell: js.Any = null,
    data: js.Any = null,
    isCtrlKeyPressed: js.UndefOr[scala.Boolean] = js.undefined,
    isShiftKeyPressed: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    selectedData: js.Any = null,
    `type`: java.lang.String = null
  ): CellDeselectingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(isCtrlKeyPressed)) __obj.updateDynamic("isCtrlKeyPressed")(isCtrlKeyPressed)
    if (!js.isUndefined(isShiftKeyPressed)) __obj.updateDynamic("isShiftKeyPressed")(isShiftKeyPressed)
    if (model != null) __obj.updateDynamic("model")(model)
    if (selectedData != null) __obj.updateDynamic("selectedData")(selectedData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CellDeselectingEventArgs]
  }
}

