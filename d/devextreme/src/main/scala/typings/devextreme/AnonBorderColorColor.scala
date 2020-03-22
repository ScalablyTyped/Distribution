package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderColorColor extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
}

object AnonBorderColorColor {
  @scala.inline
  def apply(borderColor: String = null, color: String = null): AnonBorderColorColor = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderColorColor]
  }
}

