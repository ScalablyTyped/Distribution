package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaveSharedAlbumRequest extends js.Object {
  /** Token to leave the shared album on behalf of the user. */
  var shareToken: js.UndefOr[String] = js.undefined
}

object LeaveSharedAlbumRequest {
  @scala.inline
  def apply(shareToken: String = null): LeaveSharedAlbumRequest = {
    val __obj = js.Dynamic.literal()
    if (shareToken != null) __obj.updateDynamic("shareToken")(shareToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaveSharedAlbumRequest]
  }
}

