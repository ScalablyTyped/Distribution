package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxRangeSlider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var component: js.UndefOr[dxRangeSlider] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[js.Array[Double]] = js.undefined
}

object End {
  @scala.inline
  def apply(
    component: dxRangeSlider = null,
    element: dxElement = null,
    end: js.UndefOr[Double] = js.undefined,
    model: js.Any = null,
    start: js.UndefOr[Double] = js.undefined,
    value: js.Array[Double] = null
  ): End = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

