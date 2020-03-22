package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxDiagram
import typings.devextreme.mod.DevExpress.ui.dxDiagramItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementItems extends js.Object {
  var component: js.UndefOr[dxDiagram] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var items: js.UndefOr[js.Array[dxDiagramItem]] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonElementItems {
  @scala.inline
  def apply(
    component: dxDiagram = null,
    element: dxElement = null,
    items: js.Array[dxDiagramItem] = null,
    model: js.Any = null
  ): AnonElementItems = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElementItems]
  }
}

