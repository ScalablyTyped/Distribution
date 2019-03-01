package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDeselectingEventArgs extends js.Object {
  /** Returns corresponding column object (JSON).
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the deselecting column index value.
    */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the deselecting column header element.
    */
  var headerCell: js.UndefOr[js.Any] = js.undefined
  /** Returns whether the ctrl key is pressed while deselecting column
    */
  var isCtrlKeyPressed: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns whether the shift key is pressed while deselecting column
    */
  var isShiftKeyPressed: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ColumnDeselectingEventArgs {
  @scala.inline
  def apply(
    column: js.Any = null,
    columnIndex: scala.Int | scala.Double = null,
    headerCell: js.Any = null,
    isCtrlKeyPressed: js.UndefOr[scala.Boolean] = js.undefined,
    isShiftKeyPressed: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    `type`: java.lang.String = null
  ): ColumnDeselectingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (headerCell != null) __obj.updateDynamic("headerCell")(headerCell)
    if (!js.isUndefined(isCtrlKeyPressed)) __obj.updateDynamic("isCtrlKeyPressed")(isCtrlKeyPressed)
    if (!js.isUndefined(isShiftKeyPressed)) __obj.updateDynamic("isShiftKeyPressed")(isShiftKeyPressed)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnDeselectingEventArgs]
  }
}

