package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDescriptionImage extends js.Object {
  var description: js.UndefOr[String] = js.native
  var image: js.UndefOr[AnonHeightType] = js.native
  var url: js.UndefOr[String] = js.native
}

object AnonDescriptionImage {
  @scala.inline
  def apply(description: String = null, image: AnonHeightType = null, url: String = null): AnonDescriptionImage = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionImage]
  }
}

