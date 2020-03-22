package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorHatching extends js.Object {
  var border: js.UndefOr[AnonColorVisible] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var hatching: js.UndefOr[AnonStep] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object AnonColorHatching {
  @scala.inline
  def apply(
    border: AnonColorVisible = null,
    color: String = null,
    hatching: AnonStep = null,
    opacity: Int | Double = null
  ): AnonColorHatching = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorHatching]
  }
}

