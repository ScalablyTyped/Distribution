package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Album extends js.Object {
  /**
    * [Output only] A URL to the cover photo's bytes. This shouldn't be used as
    * is. Parameters should be appended to this URL before use. See the
    * [developer
    * documentation](https://developers.google.com/photos/library/guides/access-media-items#base-urls)
    * for a complete list of supported parameters. For example,
    * `'=w2048-h1024'` sets the dimensions of the cover photo to have a width of
    * 2048 px and height of 1024 px.
    */
  var coverPhotoBaseUrl: js.UndefOr[String] = js.native
  /**
    * [Output only] Identifier for the media item associated with the cover
    * photo.
    */
  var coverPhotoMediaItemId: js.UndefOr[String] = js.native
  /**
    * [Ouput only] Identifier for the album. This is a persistent identifier that
    * can be used between sessions to identify this album.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output only] True if you can create media items in this album.
    * This field is based on the scopes granted and permissions of the album. If
    * the scopes are changed or permissions of the album are changed, this field
    * is updated.
    */
  var isWriteable: js.UndefOr[Boolean] = js.native
  /** [Output only] The number of media items in the album. */
  var mediaItemsCount: js.UndefOr[String] = js.native
  /**
    * [Output only] Google Photos URL for the album. The user needs to be signed
    * in to their Google Photos account to access this link.
    */
  var productUrl: js.UndefOr[String] = js.native
  /**
    * [Output only] Information related to shared albums.
    * This field is only populated if the album is a shared album, the
    * developer created the album and the user has granted the
    * `photoslibrary.sharing` scope.
    */
  var shareInfo: js.UndefOr[ShareInfo] = js.native
  /**
    * Name of the album displayed to the user in their Google Photos account.
    * This string shouldn't be more than 500 characters.
    */
  var title: js.UndefOr[String] = js.native
}

object Album {
  @scala.inline
  def apply(): Album = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Album]
  }
  @scala.inline
  implicit class AlbumOps[Self <: Album] (val x: Self) extends AnyVal {
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
    def setCoverPhotoBaseUrl(value: String): Self = this.set("coverPhotoBaseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverPhotoBaseUrl: Self = this.set("coverPhotoBaseUrl", js.undefined)
    @scala.inline
    def setCoverPhotoMediaItemId(value: String): Self = this.set("coverPhotoMediaItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverPhotoMediaItemId: Self = this.set("coverPhotoMediaItemId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsWriteable(value: Boolean): Self = this.set("isWriteable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsWriteable: Self = this.set("isWriteable", js.undefined)
    @scala.inline
    def setMediaItemsCount(value: String): Self = this.set("mediaItemsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaItemsCount: Self = this.set("mediaItemsCount", js.undefined)
    @scala.inline
    def setProductUrl(value: String): Self = this.set("productUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductUrl: Self = this.set("productUrl", js.undefined)
    @scala.inline
    def setShareInfo(value: ShareInfo): Self = this.set("shareInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareInfo: Self = this.set("shareInfo", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

