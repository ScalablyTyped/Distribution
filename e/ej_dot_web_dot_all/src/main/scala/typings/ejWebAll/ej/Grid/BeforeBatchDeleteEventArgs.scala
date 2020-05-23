package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeBatchDeleteEventArgs extends js.Object {
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the primaryKey.
    */
  var primaryKey: js.UndefOr[js.Any] = js.undefined
  /** Returns the row element.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns deleted data.
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeBatchDeleteEventArgs {
  @scala.inline
  def apply(
    model: js.Any = null,
    primaryKey: js.Any = null,
    row: js.Any = null,
    rowData: js.Any = null,
    rowIndex: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): BeforeBatchDeleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeBatchDeleteEventArgs]
  }
}

