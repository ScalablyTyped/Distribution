package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMimeType extends js.Object {
  var image: js.UndefOr[String] = js.native
  var mimeType: js.UndefOr[String] = js.native
}

object AnonMimeType {
  @scala.inline
  def apply(image: String = null, mimeType: String = null): AnonMimeType = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMimeType]
  }
}

