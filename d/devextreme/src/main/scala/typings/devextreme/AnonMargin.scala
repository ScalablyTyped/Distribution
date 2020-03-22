package typings.devextreme

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMargin extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var verticalAlignment: js.UndefOr[bottom | top] = js.undefined
}

object AnonMargin {
  @scala.inline
  def apply(
    borderColor: String = null,
    color: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    horizontalAlignment: center | left | right = null,
    margin: Int | Double = null,
    opacity: Int | Double = null,
    verticalAlignment: bottom | top = null
  ): AnonMargin = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMargin]
  }
}

