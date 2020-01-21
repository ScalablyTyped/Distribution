package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareAlbumRequest extends js.Object {
  /** Options to be set when converting the album to a shared album. */
  var sharedAlbumOptions: js.UndefOr[SharedAlbumOptions] = js.undefined
}

object ShareAlbumRequest {
  @scala.inline
  def apply(sharedAlbumOptions: SharedAlbumOptions = null): ShareAlbumRequest = {
    val __obj = js.Dynamic.literal()
    if (sharedAlbumOptions != null) __obj.updateDynamic("sharedAlbumOptions")(sharedAlbumOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareAlbumRequest]
  }
}

