package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.viz.dxBarGauge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentDxBarGauge extends js.Object {
  var component: js.UndefOr[dxBarGauge] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
}

object AnonComponentDxBarGauge {
  @scala.inline
  def apply(
    component: dxBarGauge = null,
    element: dxElement = null,
    model: js.Any = null,
    target: js.Any = null
  ): AnonComponentDxBarGauge = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentDxBarGauge]
  }
}

