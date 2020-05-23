package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.D
import typings.devextreme.devextremeStrings.GT
import typings.devextreme.devextremeStrings.T
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPivotGridPivotGridCell extends js.Object {
  /** @name dxPivotGridPivotGridCell.columnPath */
  var columnPath: js.UndefOr[js.Array[String | Double | Date]] = js.undefined
  /** @name dxPivotGridPivotGridCell.columnType */
  var columnType: js.UndefOr[D | T | GT] = js.undefined
  /** @name dxPivotGridPivotGridCell.dataIndex */
  var dataIndex: js.UndefOr[Double] = js.undefined
  /** @name dxPivotGridPivotGridCell.expanded */
  var expanded: js.UndefOr[Boolean] = js.undefined
  /** @name dxPivotGridPivotGridCell.path */
  var path: js.UndefOr[js.Array[String | Double | Date]] = js.undefined
  /** @name dxPivotGridPivotGridCell.rowPath */
  var rowPath: js.UndefOr[js.Array[String | Double | Date]] = js.undefined
  /** @name dxPivotGridPivotGridCell.rowType */
  var rowType: js.UndefOr[D | T | GT] = js.undefined
  /** @name dxPivotGridPivotGridCell.text */
  var text: js.UndefOr[String] = js.undefined
  /** @name dxPivotGridPivotGridCell.type */
  var `type`: js.UndefOr[D | T | GT] = js.undefined
  /** @name dxPivotGridPivotGridCell.value */
  var value: js.UndefOr[js.Any] = js.undefined
}

object dxPivotGridPivotGridCell {
  @scala.inline
  def apply(
    columnPath: js.Array[String | Double | Date] = null,
    columnType: D | T | GT = null,
    dataIndex: js.UndefOr[Double] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    path: js.Array[String | Double | Date] = null,
    rowPath: js.Array[String | Double | Date] = null,
    rowType: D | T | GT = null,
    text: String = null,
    `type`: D | T | GT = null,
    value: js.Any = null
  ): dxPivotGridPivotGridCell = {
    val __obj = js.Dynamic.literal()
    if (columnPath != null) __obj.updateDynamic("columnPath")(columnPath.asInstanceOf[js.Any])
    if (columnType != null) __obj.updateDynamic("columnType")(columnType.asInstanceOf[js.Any])
    if (!js.isUndefined(dataIndex)) __obj.updateDynamic("dataIndex")(dataIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (rowPath != null) __obj.updateDynamic("rowPath")(rowPath.asInstanceOf[js.Any])
    if (rowType != null) __obj.updateDynamic("rowType")(rowType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPivotGridPivotGridCell]
  }
}

