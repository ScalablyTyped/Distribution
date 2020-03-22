package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderAnonColorWidth extends js.Object {
  var border: js.UndefOr[AnonColorWidth] = js.undefined
  var color: js.UndefOr[String] = js.undefined
}

object AnonBorderAnonColorWidth {
  @scala.inline
  def apply(border: AnonColorWidth = null, color: String = null): AnonBorderAnonColorWidth = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderAnonColorWidth]
  }
}

