package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeListRowObject extends js.Object {
  /** Indicates whether the row is in the editing state. */
  var isEditing: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the row is expanded or collapsed. Available if rowType is "data" or "detail". */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /** Indicates that the row is added, but not yet saved. Available if rowType is "data". */
  var isNewRow: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the row is selected. Available if rowType is "data" or "detail". */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  /** The row's key. Available if rowType is "data", "detail" or "detailAdaptive". */
  var key: js.UndefOr[js.Any] = js.undefined
  /** The row's hierarchical level. Available if rowType is "data" or "detail". */
  var level: js.UndefOr[Double] = js.undefined
  /** The row's node. Available if rowType is "data" or "detail". */
  var node: js.UndefOr[dxTreeListNode] = js.undefined
  /** The row's visible index. This index is zero-based and available if rowType is "data", "detail" or "detailAdaptive". */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** The row's type. */
  var rowType: js.UndefOr[String] = js.undefined
  /** Values displayed in the row's cells. */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object dxTreeListRowObject {
  @scala.inline
  def apply(
    isEditing: js.UndefOr[Boolean] = js.undefined,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isNewRow: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    key: js.Any = null,
    level: Int | Double = null,
    node: dxTreeListNode = null,
    rowIndex: Int | Double = null,
    rowType: String = null,
    values: js.Array[_] = null
  ): dxTreeListRowObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewRow)) __obj.updateDynamic("isNewRow")(isNewRow.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowType != null) __obj.updateDynamic("rowType")(rowType.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListRowObject]
  }
}

