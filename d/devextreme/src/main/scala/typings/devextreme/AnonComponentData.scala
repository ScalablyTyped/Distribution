package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentData[T] extends js.Object {
  var component: js.UndefOr[T] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var error: js.UndefOr[Error] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonComponentData {
  @scala.inline
  def apply[T](
    component: T = null,
    data: js.Any = null,
    element: dxElement = null,
    error: Error = null,
    key: js.Any = null,
    model: js.Any = null
  ): AnonComponentData[T] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentData[T]]
  }
}

