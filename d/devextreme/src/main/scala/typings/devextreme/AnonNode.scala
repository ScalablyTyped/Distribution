package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListColumn
import typings.devextreme.mod.DevExpress.ui.dxTreeListNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNode extends js.Object {
  var columns: js.UndefOr[js.Array[dxTreeListColumn]] = js.undefined
  var component: js.UndefOr[dxTreeList] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  var isNewRow: js.UndefOr[Boolean] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var node: js.UndefOr[dxTreeListNode] = js.undefined
  var rowElement: js.UndefOr[dxElement] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
  var rowType: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object AnonNode {
  @scala.inline
  def apply(
    columns: js.Array[dxTreeListColumn] = null,
    component: dxTreeList = null,
    data: js.Any = null,
    element: dxElement = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isNewRow: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    key: js.Any = null,
    level: Int | Double = null,
    model: js.Any = null,
    node: dxTreeListNode = null,
    rowElement: dxElement = null,
    rowIndex: Int | Double = null,
    rowType: String = null,
    values: js.Array[_] = null
  ): AnonNode = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewRow)) __obj.updateDynamic("isNewRow")(isNewRow.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (rowElement != null) __obj.updateDynamic("rowElement")(rowElement.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowType != null) __obj.updateDynamic("rowType")(rowType.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNode]
  }
}

