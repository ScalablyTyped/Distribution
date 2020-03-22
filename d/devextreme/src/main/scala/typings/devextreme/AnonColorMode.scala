package typings.devextreme

import typings.devextreme.devextremeStrings.gradient
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.source
import typings.devextreme.devextremeStrings.target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorMode extends js.Object {
  var border: js.UndefOr[AnonColorVisible] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var colorMode: js.UndefOr[none | source | target | gradient] = js.undefined
  var hoverStyle: js.UndefOr[AnonColorHatching] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object AnonColorMode {
  @scala.inline
  def apply(
    border: AnonColorVisible = null,
    color: String = null,
    colorMode: none | source | target | gradient = null,
    hoverStyle: AnonColorHatching = null,
    opacity: Int | Double = null
  ): AnonColorMode = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorMode != null) __obj.updateDynamic("colorMode")(colorMode.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorMode]
  }
}

