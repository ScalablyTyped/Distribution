package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DescriptionImage extends js.Object {
  var description: js.UndefOr[String] = js.native
  var image: js.UndefOr[Anon_HeightType] = js.native
  var url: js.UndefOr[String] = js.native
}

object Anon_DescriptionImage {
  @scala.inline
  def apply(description: String = null, image: Anon_HeightType = null, url: String = null): Anon_DescriptionImage = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescriptionImage]
  }
}

