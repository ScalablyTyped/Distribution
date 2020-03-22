package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxList
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentElementItemData extends js.Object {
  var cancel: js.UndefOr[Boolean | Promise[Unit] | JQueryPromise[Unit]] = js.undefined
  var component: js.UndefOr[dxList] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var itemData: js.UndefOr[js.Any] = js.undefined
  var itemElement: js.UndefOr[dxElement] = js.undefined
  var itemIndex: js.UndefOr[Double | js.Any] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonComponentElementItemData {
  @scala.inline
  def apply(
    cancel: Boolean | Promise[Unit] | JQueryPromise[Unit] = null,
    component: dxList = null,
    element: dxElement = null,
    itemData: js.Any = null,
    itemElement: dxElement = null,
    itemIndex: Double | js.Any = null,
    model: js.Any = null
  ): AnonComponentElementItemData = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    if (itemIndex != null) __obj.updateDynamic("itemIndex")(itemIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentElementItemData]
  }
}

