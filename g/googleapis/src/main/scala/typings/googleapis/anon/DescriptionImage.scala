package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescriptionImage extends js.Object {
  var description: js.UndefOr[String] = js.native
  var image: js.UndefOr[HeightType] = js.native
  var url: js.UndefOr[String] = js.native
}

object DescriptionImage {
  @scala.inline
  def apply(description: String = null, image: HeightType = null, url: String = null): DescriptionImage = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionImage]
  }
}

