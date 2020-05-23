package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrevRowIndex extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var component: js.UndefOr[dxTreeList] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var newRowIndex: js.UndefOr[Double] = js.undefined
  var prevRowIndex: js.UndefOr[Double] = js.undefined
  var rowElement: js.UndefOr[dxElement] = js.undefined
  var rows: js.UndefOr[js.Array[dxTreeListRowObject]] = js.undefined
}

object PrevRowIndex {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    component: dxTreeList = null,
    element: dxElement = null,
    event: event = null,
    model: js.Any = null,
    newRowIndex: js.UndefOr[Double] = js.undefined,
    prevRowIndex: js.UndefOr[Double] = js.undefined,
    rowElement: dxElement = null,
    rows: js.Array[dxTreeListRowObject] = null
  ): PrevRowIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(newRowIndex)) __obj.updateDynamic("newRowIndex")(newRowIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prevRowIndex)) __obj.updateDynamic("prevRowIndex")(prevRowIndex.get.asInstanceOf[js.Any])
    if (rowElement != null) __obj.updateDynamic("rowElement")(rowElement.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevRowIndex]
  }
}

