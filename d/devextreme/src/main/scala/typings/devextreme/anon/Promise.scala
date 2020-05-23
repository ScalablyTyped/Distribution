package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promise[T] extends js.Object {
  var component: js.UndefOr[T] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var promise: js.UndefOr[typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]] = js.undefined
}

object Promise {
  @scala.inline
  def apply[T](
    component: T = null,
    data: js.Any = null,
    element: dxElement = null,
    model: js.Any = null,
    promise: typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit] = null
  ): Promise[T] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promise[T]]
  }
}

