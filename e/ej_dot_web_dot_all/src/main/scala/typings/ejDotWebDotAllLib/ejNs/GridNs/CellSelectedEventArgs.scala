package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the selected cell index value.
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the selected cell element.
    */
  var currentCell: js.UndefOr[js.Any] = js.undefined
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected cell element.
    */
  var previousRowCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected cell index value.
    */
  var previousRowCellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns current record object (JSON).
    */
  var selectedData: js.UndefOr[js.Any] = js.undefined
  /** Returns the selected row cell index values.
    */
  var selectedRowCellIndex: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CellSelectedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cellIndex: scala.Int | scala.Double = null,
    currentCell: js.Any = null,
    data: js.Any = null,
    model: js.Any = null,
    previousRowCell: js.Any = null,
    previousRowCellIndex: scala.Int | scala.Double = null,
    selectedData: js.Any = null,
    selectedRowCellIndex: js.Array[_] = null,
    `type`: java.lang.String = null
  ): CellSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cellIndex != null) __obj.updateDynamic("cellIndex")(cellIndex.asInstanceOf[js.Any])
    if (currentCell != null) __obj.updateDynamic("currentCell")(currentCell)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (previousRowCell != null) __obj.updateDynamic("previousRowCell")(previousRowCell)
    if (previousRowCellIndex != null) __obj.updateDynamic("previousRowCellIndex")(previousRowCellIndex.asInstanceOf[js.Any])
    if (selectedData != null) __obj.updateDynamic("selectedData")(selectedData)
    if (selectedRowCellIndex != null) __obj.updateDynamic("selectedRowCellIndex")(selectedRowCellIndex)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CellSelectedEventArgs]
  }
}

