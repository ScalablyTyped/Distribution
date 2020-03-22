package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPadding extends js.Object {
  var border: js.UndefOr[AnonColorVisible] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var hoverStyle: js.UndefOr[AnonColorHatching] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonPadding {
  @scala.inline
  def apply(
    border: AnonColorVisible = null,
    color: String = null,
    hoverStyle: AnonColorHatching = null,
    opacity: Int | Double = null,
    padding: Int | Double = null,
    width: Int | Double = null
  ): AnonPadding = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPadding]
  }
}

