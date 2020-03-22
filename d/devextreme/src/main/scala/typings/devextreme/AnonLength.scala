package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var shift: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonLength {
  @scala.inline
  def apply(
    color: String = null,
    length: Int | Double = null,
    opacity: Int | Double = null,
    shift: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnonLength = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLength]
  }
}

