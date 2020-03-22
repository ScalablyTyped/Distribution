package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImage extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var image: js.UndefOr[AnonUrl] = js.native
  var url: js.UndefOr[String] = js.native
}

object AnonImage {
  @scala.inline
  def apply(displayName: String = null, id: String = null, image: AnonUrl = null, url: String = null): AnonImage = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImage]
  }
}

