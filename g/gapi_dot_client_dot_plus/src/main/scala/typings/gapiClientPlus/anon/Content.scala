package typings.gapiClientPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  /** If the attachment is an article, this property contains a snippet of text from the article. It can also include descriptions for other types. */
  var content: js.UndefOr[String] = js.native
  /** The title of the attachment, such as a photo caption or an article title. */
  var displayName: js.UndefOr[String] = js.native
  /** If the attachment is a video, the embeddable link. */
  var embed: js.UndefOr[Type] = js.native
  /** The full image URL for photo attachments. */
  var fullImage: js.UndefOr[Height] = js.native
  /** The ID of the attachment. */
  var id: js.UndefOr[String] = js.native
  /** The preview image for photos or videos. */
  var image: js.UndefOr[Height] = js.native
  /**
    * The type of media object. Possible values include, but are not limited to, the following values:
    * - "photo" - A photo.
    * - "album" - A photo album.
    * - "video" - A video.
    * - "article" - An article, specified by a link.
    */
  var objectType: js.UndefOr[String] = js.native
  /** If the attachment is an album, this property is a list of potential additional thumbnails from the album. */
  var thumbnails: js.UndefOr[js.Array[Description]] = js.native
  /** The link to the attachment, which should be of type text/html. */
  var url: js.UndefOr[String] = js.native
}

object Content {
  @scala.inline
  def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEmbed(value: Type): Self = this.set("embed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbed: Self = this.set("embed", js.undefined)
    @scala.inline
    def setFullImage(value: Height): Self = this.set("fullImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullImage: Self = this.set("fullImage", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImage(value: Height): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    @scala.inline
    def setThumbnailsVarargs(value: Description*): Self = this.set("thumbnails", js.Array(value :_*))
    @scala.inline
    def setThumbnails(value: js.Array[Description]): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

