package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewData[T] extends js.Object {
  var cancel: js.UndefOr[Boolean | Promise[Unit] | JQueryPromise[Unit]] = js.undefined
  var component: js.UndefOr[T] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var newData: js.UndefOr[js.Any] = js.undefined
  var oldData: js.UndefOr[js.Any] = js.undefined
}

object AnonNewData {
  @scala.inline
  def apply[T](
    cancel: Boolean | Promise[Unit] | JQueryPromise[Unit] = null,
    component: T = null,
    element: dxElement = null,
    key: js.Any = null,
    model: js.Any = null,
    newData: js.Any = null,
    oldData: js.Any = null
  ): AnonNewData[T] = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (newData != null) __obj.updateDynamic("newData")(newData.asInstanceOf[js.Any])
    if (oldData != null) __obj.updateDynamic("oldData")(oldData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewData[T]]
  }
}

