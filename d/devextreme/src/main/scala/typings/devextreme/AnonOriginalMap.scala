package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalMap extends js.Object {
  var component: js.UndefOr[dxMap] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var originalMap: js.UndefOr[js.Any] = js.undefined
}

object AnonOriginalMap {
  @scala.inline
  def apply(
    component: dxMap = null,
    element: dxElement = null,
    model: js.Any = null,
    originalMap: js.Any = null
  ): AnonOriginalMap = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (originalMap != null) __obj.updateDynamic("originalMap")(originalMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOriginalMap]
  }
}

