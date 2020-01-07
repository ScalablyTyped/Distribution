package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinSharedAlbumRequest extends js.Object {
  /** Token to join the shared album on behalf of the user. */
  var shareToken: js.UndefOr[String] = js.undefined
}

object JoinSharedAlbumRequest {
  @scala.inline
  def apply(shareToken: String = null): JoinSharedAlbumRequest = {
    val __obj = js.Dynamic.literal()
    if (shareToken != null) __obj.updateDynamic("shareToken")(shareToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinSharedAlbumRequest]
  }
}

