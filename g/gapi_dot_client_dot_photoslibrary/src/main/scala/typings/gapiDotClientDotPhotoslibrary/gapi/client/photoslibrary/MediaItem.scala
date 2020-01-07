package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaItem extends js.Object {
  /**
    * A URL to the media item's bytes. This shouldn't be used as is. Parameters
    * should be appended to this URL before use. See the [developer
    * documentation](https://developers.google.com/photos/library/guides/access-media-items#base-urls)
    * for a complete list of supported parameters. For example, `'=w2048-h1024'`
    * will set the dimensions of a media item of type photo to have a width of
    * 2048 px and height of 1024 px.
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  /** Information about the user who created this media item. */
  var contributorInfo: js.UndefOr[ContributorInfo] = js.undefined
  /**
    * Description of the media item. This is shown to the user in the item's
    * info section in the Google Photos app.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Filename of the media item. This is shown to the user in the item's info
    * section in the Google Photos app.
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * Identifier for the media item. This is a persistent identifier that can be
    * used between sessions to identify this media item.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Metadata related to the media item, such as, height, width, or
    * creation time.
    */
  var mediaMetadata: js.UndefOr[MediaMetadata] = js.undefined
  /** MIME type of the media item. For example, `image/jpeg`. */
  var mimeType: js.UndefOr[String] = js.undefined
  /**
    * Google Photos URL for the media item. This link is available to
    * the user only if they're signed in.
    */
  var productUrl: js.UndefOr[String] = js.undefined
}

object MediaItem {
  @scala.inline
  def apply(
    baseUrl: String = null,
    contributorInfo: ContributorInfo = null,
    description: String = null,
    filename: String = null,
    id: String = null,
    mediaMetadata: MediaMetadata = null,
    mimeType: String = null,
    productUrl: String = null
  ): MediaItem = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (contributorInfo != null) __obj.updateDynamic("contributorInfo")(contributorInfo.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mediaMetadata != null) __obj.updateDynamic("mediaMetadata")(mediaMetadata.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (productUrl != null) __obj.updateDynamic("productUrl")(productUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaItem]
  }
}

