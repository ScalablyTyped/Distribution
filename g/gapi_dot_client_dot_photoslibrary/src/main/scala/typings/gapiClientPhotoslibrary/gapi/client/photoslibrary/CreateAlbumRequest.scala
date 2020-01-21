package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAlbumRequest extends js.Object {
  /** The album to be created. */
  var album: js.UndefOr[Album] = js.undefined
}

object CreateAlbumRequest {
  @scala.inline
  def apply(album: Album = null): CreateAlbumRequest = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAlbumRequest]
  }
}

