package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSharedAlbumsResponse extends js.Object {
  /**
    * Output only. Token to use to get the next set of shared albums. Populated
    * if there are more shared albums to retrieve for this request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Output only. List of shared albums. */
  var sharedAlbums: js.UndefOr[js.Array[Album]] = js.undefined
}

object ListSharedAlbumsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, sharedAlbums: js.Array[Album] = null): ListSharedAlbumsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sharedAlbums != null) __obj.updateDynamic("sharedAlbums")(sharedAlbums.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSharedAlbumsResponse]
  }
}

