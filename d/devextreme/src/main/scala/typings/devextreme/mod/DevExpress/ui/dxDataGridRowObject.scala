package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDataGridRowObject extends js.Object {
  /** @name dxDataGridRowObject.data */
  var data: js.UndefOr[js.Any] = js.undefined
  /** @name dxDataGridRowObject.groupIndex */
  var groupIndex: js.UndefOr[Double] = js.undefined
  /** @name dxDataGridRowObject.isEditing */
  var isEditing: js.UndefOr[Boolean] = js.undefined
  /** @name dxDataGridRowObject.isExpanded */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /** @name dxDataGridRowObject.isNewRow */
  var isNewRow: js.UndefOr[Boolean] = js.undefined
  /** @name dxDataGridRowObject.isSelected */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  /** @name dxDataGridRowObject.key */
  var key: js.UndefOr[js.Any] = js.undefined
  /** @name dxDataGridRowObject.rowIndex */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** @name dxDataGridRowObject.rowType */
  var rowType: js.UndefOr[String] = js.undefined
  /** @name dxDataGridRowObject.values */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object dxDataGridRowObject {
  @scala.inline
  def apply(
    data: js.Any = null,
    groupIndex: js.UndefOr[Double] = js.undefined,
    isEditing: js.UndefOr[Boolean] = js.undefined,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isNewRow: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    key: js.Any = null,
    rowIndex: js.UndefOr[Double] = js.undefined,
    rowType: String = null,
    values: js.Array[_] = null
  ): dxDataGridRowObject = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(groupIndex)) __obj.updateDynamic("groupIndex")(groupIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewRow)) __obj.updateDynamic("isNewRow")(isNewRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (rowType != null) __obj.updateDynamic("rowType")(rowType.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDataGridRowObject]
  }
}

