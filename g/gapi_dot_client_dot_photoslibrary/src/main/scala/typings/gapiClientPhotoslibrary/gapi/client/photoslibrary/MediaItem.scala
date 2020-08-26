package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaItem extends js.Object {
  /**
    * A URL to the media item's bytes. This shouldn't be used as is. Parameters
    * should be appended to this URL before use. See the [developer
    * documentation](https://developers.google.com/photos/library/guides/access-media-items#base-urls)
    * for a complete list of supported parameters. For example, `'=w2048-h1024'`
    * will set the dimensions of a media item of type photo to have a width of
    * 2048 px and height of 1024 px.
    */
  var baseUrl: js.UndefOr[String] = js.native
  /** Information about the user who created this media item. */
  var contributorInfo: js.UndefOr[ContributorInfo] = js.native
  /**
    * Description of the media item. This is shown to the user in the item's
    * info section in the Google Photos app.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Filename of the media item. This is shown to the user in the item's info
    * section in the Google Photos app.
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * Identifier for the media item. This is a persistent identifier that can be
    * used between sessions to identify this media item.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Metadata related to the media item, such as, height, width, or
    * creation time.
    */
  var mediaMetadata: js.UndefOr[MediaMetadata] = js.native
  /** MIME type of the media item. For example, `image/jpeg`. */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Google Photos URL for the media item. This link is available to
    * the user only if they're signed in.
    */
  var productUrl: js.UndefOr[String] = js.native
}

object MediaItem {
  @scala.inline
  def apply(): MediaItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaItem]
  }
  @scala.inline
  implicit class MediaItemOps[Self <: MediaItem] (val x: Self) extends AnyVal {
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setContributorInfo(value: ContributorInfo): Self = this.set("contributorInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContributorInfo: Self = this.set("contributorInfo", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMediaMetadata(value: MediaMetadata): Self = this.set("mediaMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaMetadata: Self = this.set("mediaMetadata", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setProductUrl(value: String): Self = this.set("productUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductUrl: Self = this.set("productUrl", js.undefined)
  }
  
}

