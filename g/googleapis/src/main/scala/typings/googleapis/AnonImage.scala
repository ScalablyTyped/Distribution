package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImage extends js.Object {
  var image: js.UndefOr[String] = js.native
  var mimeType: js.UndefOr[String] = js.native
}

object AnonImage {
  @scala.inline
  def apply(image: String = null, mimeType: String = null): AnonImage = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImage]
  }
}

