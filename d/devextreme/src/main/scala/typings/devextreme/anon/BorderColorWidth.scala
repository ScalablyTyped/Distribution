package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderColorWidth extends js.Object {
  var border: js.UndefOr[ColorWidth] = js.undefined
  var color: js.UndefOr[String] = js.undefined
}

object BorderColorWidth {
  @scala.inline
  def apply(border: ColorWidth = null, color: String = null): BorderColorWidth = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorWidth]
  }
}

