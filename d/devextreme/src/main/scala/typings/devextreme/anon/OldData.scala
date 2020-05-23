package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import typings.devextreme.mod.global.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldData extends js.Object {
  var cancel: js.UndefOr[
    Boolean | typings.devextreme.mod.global.Promise[Boolean] | JQueryPromise[Boolean]
  ] = js.undefined
  var component: js.UndefOr[dxScheduler] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var newData: js.UndefOr[js.Any] = js.undefined
  var oldData: js.UndefOr[js.Any] = js.undefined
}

object OldData {
  @scala.inline
  def apply(
    cancel: Boolean | typings.devextreme.mod.global.Promise[Boolean] | JQueryPromise[Boolean] = null,
    component: dxScheduler = null,
    element: dxElement = null,
    model: js.Any = null,
    newData: js.Any = null,
    oldData: js.Any = null
  ): OldData = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (newData != null) __obj.updateDynamic("newData")(newData.asInstanceOf[js.Any])
    if (oldData != null) __obj.updateDynamic("oldData")(oldData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldData]
  }
}

