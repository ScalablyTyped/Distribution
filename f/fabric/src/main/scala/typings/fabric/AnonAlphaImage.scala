package typings.fabric

import typings.fabric.fabricImplMod.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlphaImage extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var image: js.UndefOr[Image] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
}

object AnonAlphaImage {
  @scala.inline
  def apply(alpha: Int | Double = null, image: Image = null, mode: String = null): AnonAlphaImage = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlphaImage]
  }
}

