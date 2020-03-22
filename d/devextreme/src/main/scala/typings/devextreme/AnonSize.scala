package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSize extends js.Object {
  var border: js.UndefOr[AnonColorVisible] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object AnonSize {
  @scala.inline
  def apply(border: AnonColorVisible = null, color: String = null, size: Int | Double = null): AnonSize = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSize]
  }
}

