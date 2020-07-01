package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  var content: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var embed: js.UndefOr[TypeUrl] = js.native
  var fullImage: js.UndefOr[HeightType] = js.native
  var id: js.UndefOr[String] = js.native
  var image: js.UndefOr[HeightType] = js.native
  var objectType: js.UndefOr[String] = js.native
  var thumbnails: js.UndefOr[js.Array[DescriptionImage]] = js.native
  var url: js.UndefOr[String] = js.native
}

object Content {
  @scala.inline
  def apply(
    content: String = null,
    displayName: String = null,
    embed: TypeUrl = null,
    fullImage: HeightType = null,
    id: String = null,
    image: HeightType = null,
    objectType: String = null,
    thumbnails: js.Array[DescriptionImage] = null,
    url: String = null
  ): Content = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (embed != null) __obj.updateDynamic("embed")(embed.asInstanceOf[js.Any])
    if (fullImage != null) __obj.updateDynamic("fullImage")(fullImage.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

