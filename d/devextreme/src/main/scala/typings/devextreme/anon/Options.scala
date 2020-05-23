package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var component: js.UndefOr[dxMap] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var originalMarker: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    component: dxMap = null,
    element: dxElement = null,
    model: js.Any = null,
    options: js.Any = null,
    originalMarker: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (originalMarker != null) __obj.updateDynamic("originalMarker")(originalMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

