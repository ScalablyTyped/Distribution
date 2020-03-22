package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorOpacity extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonColorOpacity {
  @scala.inline
  def apply(
    color: String = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnonColorOpacity = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorOpacity]
  }
}

