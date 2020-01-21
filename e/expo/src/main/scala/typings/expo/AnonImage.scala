package typings.expo

import typings.expo.aRMod.AnchorType.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImage extends js.Object {
  var image: js.UndefOr[AnonName] = js.undefined
  var `type`: Image
}

object AnonImage {
  @scala.inline
  def apply(`type`: Image, image: AnonName = null): AnonImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImage]
  }
}

