package typings.devextreme.anon

import typings.devextreme.devextremeStrings.gradient
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.source
import typings.devextreme.devextremeStrings.target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorMode extends js.Object {
  var border: js.UndefOr[ColorVisible] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var colorMode: js.UndefOr[none | source | target | gradient] = js.undefined
  var hoverStyle: js.UndefOr[ColorHatching] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object ColorMode {
  @scala.inline
  def apply(
    border: ColorVisible = null,
    color: String = null,
    colorMode: none | source | target | gradient = null,
    hoverStyle: ColorHatching = null,
    opacity: js.UndefOr[Double] = js.undefined
  ): ColorMode = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorMode != null) __obj.updateDynamic("colorMode")(colorMode.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorMode]
  }
}

