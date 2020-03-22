package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorder extends js.Object {
  var border: js.UndefOr[AnonColorVisible] = js.undefined
  var hatching: js.UndefOr[AnonStep] = js.undefined
}

object AnonBorder {
  @scala.inline
  def apply(border: AnonColorVisible = null, hatching: AnonStep = null): AnonBorder = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (hatching != null) __obj.updateDynamic("hatching")(hatching.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorder]
  }
}

