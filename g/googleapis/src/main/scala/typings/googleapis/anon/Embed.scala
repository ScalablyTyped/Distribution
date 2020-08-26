package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Embed extends js.Object {
  var content: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var embed: js.UndefOr[TypeUrl] = js.native
  var fullImage: js.UndefOr[HeightType] = js.native
  var id: js.UndefOr[String] = js.native
  var image: js.UndefOr[HeightType] = js.native
  var objectType: js.UndefOr[String] = js.native
  var previewThumbnails: js.UndefOr[js.Array[Url]] = js.native
  var thumbnails: js.UndefOr[js.Array[DescriptionImage]] = js.native
  var url: js.UndefOr[String] = js.native
}

object Embed {
  @scala.inline
  def apply(): Embed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Embed]
  }
  @scala.inline
  implicit class EmbedOps[Self <: Embed] (val x: Self) extends AnyVal {
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
    def setEmbed(value: TypeUrl): Self = this.set("embed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbed: Self = this.set("embed", js.undefined)
    @scala.inline
    def setFullImage(value: HeightType): Self = this.set("fullImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullImage: Self = this.set("fullImage", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImage(value: HeightType): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    @scala.inline
    def setPreviewThumbnailsVarargs(value: Url*): Self = this.set("previewThumbnails", js.Array(value :_*))
    @scala.inline
    def setPreviewThumbnails(value: js.Array[Url]): Self = this.set("previewThumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewThumbnails: Self = this.set("previewThumbnails", js.undefined)
    @scala.inline
    def setThumbnailsVarargs(value: DescriptionImage*): Self = this.set("thumbnails", js.Array(value :_*))
    @scala.inline
    def setThumbnails(value: js.Array[DescriptionImage]): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

