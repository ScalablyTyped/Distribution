package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError[T] extends js.Object {
  var component: js.UndefOr[T] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var error: js.UndefOr[Error] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonError {
  @scala.inline
  def apply[T](component: T = null, element: dxElement = null, error: Error = null, model: js.Any = null): AnonError[T] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError[T]]
  }
}

