package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxToolbarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarOptions[T] extends js.Object {
  var component: js.UndefOr[T] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var toolbarOptions: js.UndefOr[dxToolbarOptions] = js.undefined
}

object ToolbarOptions {
  @scala.inline
  def apply[T](
    component: T = null,
    element: dxElement = null,
    model: js.Any = null,
    toolbarOptions: dxToolbarOptions = null
  ): ToolbarOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (toolbarOptions != null) __obj.updateDynamic("toolbarOptions")(toolbarOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarOptions[T]]
  }
}

