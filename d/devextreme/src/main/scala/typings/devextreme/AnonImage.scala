package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImage extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[AnonLocationUrl] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonImage {
  @scala.inline
  def apply(color: String = null, image: AnonLocationUrl = null, visible: js.UndefOr[Boolean] = js.undefined): AnonImage = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImage]
  }
}

