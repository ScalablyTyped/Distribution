package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSelectingEventArgs extends js.Object {
  /** Returns corresponding column object (JSON).
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the selected column index value.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /** Returns the selected header cell element.
    */
  var headerCell: js.UndefOr[js.Any] = js.undefined
  /** Returns whether the ctrl key is pressed while selecting cell
    */
  var isCtrlKeyPressed: js.UndefOr[Boolean] = js.undefined
  /** Returns whether the shift key is pressed while selecting cell
    */
  var isShiftKeyPressed: js.UndefOr[Boolean] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected header cell element.
    */
  var prevColumnHeaderCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected column index value.
    */
  var previousColumnIndex: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ColumnSelectingEventArgs {
  @scala.inline
  def apply(
    column: js.Any = null,
    columnIndex: Int | Double = null,
    headerCell: js.Any = null,
    isCtrlKeyPressed: js.UndefOr[Boolean] = js.undefined,
    isShiftKeyPressed: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    prevColumnHeaderCell: js.Any = null,
    previousColumnIndex: Int | Double = null,
    `type`: String = null
  ): ColumnSelectingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (headerCell != null) __obj.updateDynamic("headerCell")(headerCell)
    if (!js.isUndefined(isCtrlKeyPressed)) __obj.updateDynamic("isCtrlKeyPressed")(isCtrlKeyPressed)
    if (!js.isUndefined(isShiftKeyPressed)) __obj.updateDynamic("isShiftKeyPressed")(isShiftKeyPressed)
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevColumnHeaderCell != null) __obj.updateDynamic("prevColumnHeaderCell")(prevColumnHeaderCell)
    if (previousColumnIndex != null) __obj.updateDynamic("previousColumnIndex")(previousColumnIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnSelectingEventArgs]
  }
}

