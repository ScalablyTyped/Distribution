package typings.devextreme.anon

import typings.devextreme.devextremeStrings.hovered
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fill extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var state: js.UndefOr[normal | hovered | selected] = js.undefined
}

object Fill {
  @scala.inline
  def apply(
    fill: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    state: normal | hovered | selected = null
  ): Fill = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
}

