package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHatching extends js.Object {
  var border: js.UndefOr[AnonColorDashStyle] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var hatching: js.UndefOr[AnonStep] = js.undefined
}

object AnonHatching {
  @scala.inline
  def apply(border: AnonColorDashStyle = null, color: String = null, hatching: AnonStep = null): AnonHatching = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHatching]
  }
}

