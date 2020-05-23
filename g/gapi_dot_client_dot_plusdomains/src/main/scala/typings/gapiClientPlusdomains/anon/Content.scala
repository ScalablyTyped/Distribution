package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  /** If the attachment is an article, this property contains a snippet of text from the article. It can also include descriptions for other types. */
  var content: js.UndefOr[String] = js.undefined
  /** The title of the attachment, such as a photo caption or an article title. */
  var displayName: js.UndefOr[String] = js.undefined
  /** If the attachment is a video, the embeddable link. */
  var embed: js.UndefOr[Type] = js.undefined
  /** The full image URL for photo attachments. */
  var fullImage: js.UndefOr[Height] = js.undefined
  /** The ID of the attachment. */
  var id: js.UndefOr[String] = js.undefined
  /** The preview image for photos or videos. */
  var image: js.UndefOr[Height] = js.undefined
  /**
    * The type of media object. Possible values include, but are not limited to, the following values:
    * - "photo" - A photo.
    * - "album" - A photo album.
    * - "video" - A video.
    * - "article" - An article, specified by a link.
    */
  var objectType: js.UndefOr[String] = js.undefined
  /**
    * When previewing, these are the optional thumbnails for the post. When posting an article, choose one by setting the attachment.image.url property. If
    * you don't choose one, one will be chosen for you.
    */
  var previewThumbnails: js.UndefOr[js.Array[Url]] = js.undefined
  /** If the attachment is an album, this property is a list of potential additional thumbnails from the album. */
  var thumbnails: js.UndefOr[js.Array[Description]] = js.undefined
  /** The link to the attachment, which should be of type text/html. */
  var url: js.UndefOr[String] = js.undefined
}

object Content {
  @scala.inline
  def apply(
    content: String = null,
    displayName: String = null,
    embed: Type = null,
    fullImage: Height = null,
    id: String = null,
    image: Height = null,
    objectType: String = null,
    previewThumbnails: js.Array[Url] = null,
    thumbnails: js.Array[Description] = null,
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
    if (previewThumbnails != null) __obj.updateDynamic("previewThumbnails")(previewThumbnails.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

