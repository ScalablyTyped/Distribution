package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var coverPhotoBaseUrl: js.UndefOr[String] = js.undefined
  /**
    * [Output only] Identifier for the media item associated with the cover
    * photo.
    */
  var coverPhotoMediaItemId: js.UndefOr[String] = js.undefined
  /**
    * [Ouput only] Identifier for the album. This is a persistent identifier that
    * can be used between sessions to identify this album.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * [Output only] True if you can create media items in this album.
    * This field is based on the scopes granted and permissions of the album. If
    * the scopes are changed or permissions of the album are changed, this field
    * is updated.
    */
  var isWriteable: js.UndefOr[Boolean] = js.undefined
  /** [Output only] The number of media items in the album. */
  var mediaItemsCount: js.UndefOr[String] = js.undefined
  /**
    * [Output only] Google Photos URL for the album. The user needs to be signed
    * in to their Google Photos account to access this link.
    */
  var productUrl: js.UndefOr[String] = js.undefined
  /**
    * [Output only] Information related to shared albums.
    * This field is only populated if the album is a shared album, the
    * developer created the album and the user has granted the
    * `photoslibrary.sharing` scope.
    */
  var shareInfo: js.UndefOr[ShareInfo] = js.undefined
  /**
    * Name of the album displayed to the user in their Google Photos account.
    * This string shouldn't be more than 500 characters.
    */
  var title: js.UndefOr[String] = js.undefined
}

object Album {
  @scala.inline
  def apply(
    coverPhotoBaseUrl: String = null,
    coverPhotoMediaItemId: String = null,
    id: String = null,
    isWriteable: js.UndefOr[Boolean] = js.undefined,
    mediaItemsCount: String = null,
    productUrl: String = null,
    shareInfo: ShareInfo = null,
    title: String = null
  ): Album = {
    val __obj = js.Dynamic.literal()
    if (coverPhotoBaseUrl != null) __obj.updateDynamic("coverPhotoBaseUrl")(coverPhotoBaseUrl.asInstanceOf[js.Any])
    if (coverPhotoMediaItemId != null) __obj.updateDynamic("coverPhotoMediaItemId")(coverPhotoMediaItemId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isWriteable)) __obj.updateDynamic("isWriteable")(isWriteable.get.asInstanceOf[js.Any])
    if (mediaItemsCount != null) __obj.updateDynamic("mediaItemsCount")(mediaItemsCount.asInstanceOf[js.Any])
    if (productUrl != null) __obj.updateDynamic("productUrl")(productUrl.asInstanceOf[js.Any])
    if (shareInfo != null) __obj.updateDynamic("shareInfo")(shareInfo.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
}

