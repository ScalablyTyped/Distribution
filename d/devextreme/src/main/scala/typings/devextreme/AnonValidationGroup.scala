package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxButton
import typings.devextreme.mod._Global_.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValidationGroup extends js.Object {
  var component: js.UndefOr[dxButton] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var validationGroup: js.UndefOr[js.Any] = js.undefined
}

object AnonValidationGroup {
  @scala.inline
  def apply(
    component: dxButton = null,
    element: dxElement = null,
    event: event = null,
    jQueryEvent: JQueryEventObject = null,
    model: js.Any = null,
    validationGroup: js.Any = null
  ): AnonValidationGroup = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (jQueryEvent != null) __obj.updateDynamic("jQueryEvent")(jQueryEvent.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (validationGroup != null) __obj.updateDynamic("validationGroup")(validationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValidationGroup]
  }
}

