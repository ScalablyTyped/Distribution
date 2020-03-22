package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxRangeSlider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var component: js.UndefOr[dxRangeSlider] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[js.Array[Double]] = js.undefined
}

object AnonEnd {
  @scala.inline
  def apply(
    component: dxRangeSlider = null,
    element: dxElement = null,
    end: Int | Double = null,
    model: js.Any = null,
    start: Int | Double = null,
    value: js.Array[Double] = null
  ): AnonEnd = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

