package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinSharedAlbumResponse extends js.Object {
  /** Shared album that the user has joined. */
  var album: js.UndefOr[Album] = js.undefined
}

object JoinSharedAlbumResponse {
  @scala.inline
  def apply(album: Album = null): JoinSharedAlbumResponse = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinSharedAlbumResponse]
  }
}

