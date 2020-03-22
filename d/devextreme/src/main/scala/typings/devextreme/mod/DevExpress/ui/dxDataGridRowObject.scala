package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDataGridRowObject extends js.Object {
  /** The data object represented by the row. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** The group index of the row. Available when the rowType is "group". */
  var groupIndex: js.UndefOr[Double] = js.undefined
  /** Indicates whether the row is in the editing state. */
  var isEditing: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the row is expanded or collapsed. Available if rowType is "data", "detail" or "group". */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /** Indicates that the row is added, but not yet saved. Available if rowType is "data". */
  var isNewRow: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the row is selected. Available if rowType is "data". */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  /** The key of the data object represented by the row. */
  var key: js.UndefOr[js.Any] = js.undefined
  /** The visible index of the row. */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** The row's type. */
  var rowType: js.UndefOr[String] = js.undefined
  /** Values of the row as they exist in the data source. */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object dxDataGridRowObject {
  @scala.inline
  def apply(
    data: js.Any = null,
    groupIndex: Int | Double = null,
    isEditing: js.UndefOr[Boolean] = js.undefined,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isNewRow: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    key: js.Any = null,
    rowIndex: Int | Double = null,
    rowType: String = null,
    values: js.Array[_] = null
  ): dxDataGridRowObject = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (groupIndex != null) __obj.updateDynamic("groupIndex")(groupIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewRow)) __obj.updateDynamic("isNewRow")(isNewRow.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowType != null) __obj.updateDynamic("rowType")(rowType.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDataGridRowObject]
  }
}

