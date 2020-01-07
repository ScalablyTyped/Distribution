package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareAlbumResponse extends js.Object {
  /** Output only. Information about the shared album. */
  var shareInfo: js.UndefOr[ShareInfo] = js.undefined
}

object ShareAlbumResponse {
  @scala.inline
  def apply(shareInfo: ShareInfo = null): ShareAlbumResponse = {
    val __obj = js.Dynamic.literal()
    if (shareInfo != null) __obj.updateDynamic("shareInfo")(shareInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareAlbumResponse]
  }
}

