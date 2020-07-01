package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MimeType extends js.Object {
  var image: js.UndefOr[String] = js.native
  var mimeType: js.UndefOr[String] = js.native
}

object MimeType {
  @scala.inline
  def apply(image: String = null, mimeType: String = null): MimeType = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeType]
  }
}

