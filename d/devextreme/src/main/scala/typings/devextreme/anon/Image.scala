package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[LocationUrl] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Image {
  @scala.inline
  def apply(color: String = null, image: LocationUrl = null, visible: js.UndefOr[Boolean] = js.undefined): Image = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

