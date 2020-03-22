package typings.devextreme

import typings.devextreme.devextremeStrings.hovered
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFill extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var state: js.UndefOr[normal | hovered | selected] = js.undefined
}

object AnonFill {
  @scala.inline
  def apply(
    fill: String = null,
    opacity: Int | Double = null,
    size: Int | Double = null,
    state: normal | hovered | selected = null
  ): AnonFill = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFill]
  }
}

