package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorHatching extends js.Object {
  var border: js.UndefOr[ColorVisible] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var hatching: js.UndefOr[Step] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object ColorHatching {
  @scala.inline
  def apply(
    border: ColorVisible = null,
    color: String = null,
    hatching: Step = null,
    opacity: js.UndefOr[Double] = js.undefined
  ): ColorHatching = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorHatching]
  }
}

