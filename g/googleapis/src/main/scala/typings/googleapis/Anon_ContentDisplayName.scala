package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ContentDisplayName extends js.Object {
  var content: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var embed: js.UndefOr[Anon_TypeUrl] = js.native
  var fullImage: js.UndefOr[Anon_HeightType] = js.native
  var id: js.UndefOr[String] = js.native
  var image: js.UndefOr[Anon_HeightType] = js.native
  var objectType: js.UndefOr[String] = js.native
  var previewThumbnails: js.UndefOr[js.Array[Anon_Url]] = js.native
  var thumbnails: js.UndefOr[js.Array[Anon_DescriptionImage]] = js.native
  var url: js.UndefOr[String] = js.native
}

object Anon_ContentDisplayName {
  @scala.inline
  def apply(
    content: String = null,
    displayName: String = null,
    embed: Anon_TypeUrl = null,
    fullImage: Anon_HeightType = null,
    id: String = null,
    image: Anon_HeightType = null,
    objectType: String = null,
    previewThumbnails: js.Array[Anon_Url] = null,
    thumbnails: js.Array[Anon_DescriptionImage] = null,
    url: String = null
  ): Anon_ContentDisplayName = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (embed != null) __obj.updateDynamic("embed")(embed.asInstanceOf[js.Any])
    if (fullImage != null) __obj.updateDynamic("fullImage")(fullImage.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (previewThumbnails != null) __obj.updateDynamic("previewThumbnails")(previewThumbnails.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContentDisplayName]
  }
}

