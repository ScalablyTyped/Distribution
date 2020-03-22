package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlur extends js.Object {
  var blur: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object AnonBlur {
  @scala.inline
  def apply(
    blur: Int | Double = null,
    color: String = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    opacity: Int | Double = null
  ): AnonBlur = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlur]
  }
}

