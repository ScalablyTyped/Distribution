package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxLookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitleElement extends js.Object {
  var component: js.UndefOr[dxLookup] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var titleElement: js.UndefOr[dxElement] = js.undefined
}

object AnonTitleElement {
  @scala.inline
  def apply(
    component: dxLookup = null,
    element: dxElement = null,
    model: js.Any = null,
    titleElement: dxElement = null
  ): AnonTitleElement = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (titleElement != null) __obj.updateDynamic("titleElement")(titleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitleElement]
  }
}

