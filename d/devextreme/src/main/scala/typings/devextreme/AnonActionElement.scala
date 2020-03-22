package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxSpeedDialAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionElement extends js.Object {
  var actionElement: js.UndefOr[dxElement] = js.undefined
  var component: js.UndefOr[dxSpeedDialAction] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
}

object AnonActionElement {
  @scala.inline
  def apply(
    actionElement: dxElement = null,
    component: dxSpeedDialAction = null,
    element: dxElement = null,
    event: event = null
  ): AnonActionElement = {
    val __obj = js.Dynamic.literal()
    if (actionElement != null) __obj.updateDynamic("actionElement")(actionElement.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionElement]
  }
}

