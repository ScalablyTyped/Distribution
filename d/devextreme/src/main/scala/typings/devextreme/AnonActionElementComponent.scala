package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxSpeedDialAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionElementComponent extends js.Object {
  var actionElement: js.UndefOr[dxElement] = js.undefined
  var component: js.UndefOr[dxSpeedDialAction] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonActionElementComponent {
  @scala.inline
  def apply(
    actionElement: dxElement = null,
    component: dxSpeedDialAction = null,
    element: dxElement = null,
    model: js.Any = null
  ): AnonActionElementComponent = {
    val __obj = js.Dynamic.literal()
    if (actionElement != null) __obj.updateDynamic("actionElement")(actionElement.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionElementComponent]
  }
}

