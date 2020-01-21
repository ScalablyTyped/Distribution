package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareInfo extends js.Object {
  /**
    * True if the user has joined the album. This is always true for the owner
    * of the shared album.
    */
  var isJoined: js.UndefOr[Boolean] = js.undefined
  /** True if the user owns the album. */
  var isOwned: js.UndefOr[Boolean] = js.undefined
  /**
    * A token that can be used by other users to join this shared album via the
    * API.
    */
  var shareToken: js.UndefOr[String] = js.undefined
  /**
    * A link to the album that's now shared on the Google Photos website and app.
    * Anyone with the link can access this shared album and see all of the items
    * present in the album.
    */
  var shareableUrl: js.UndefOr[String] = js.undefined
  /** Options that control the sharing of an album. */
  var sharedAlbumOptions: js.UndefOr[SharedAlbumOptions] = js.undefined
}

object ShareInfo {
  @scala.inline
  def apply(
    isJoined: js.UndefOr[Boolean] = js.undefined,
    isOwned: js.UndefOr[Boolean] = js.undefined,
    shareToken: String = null,
    shareableUrl: String = null,
    sharedAlbumOptions: SharedAlbumOptions = null
  ): ShareInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isJoined)) __obj.updateDynamic("isJoined")(isJoined.asInstanceOf[js.Any])
    if (!js.isUndefined(isOwned)) __obj.updateDynamic("isOwned")(isOwned.asInstanceOf[js.Any])
    if (shareToken != null) __obj.updateDynamic("shareToken")(shareToken.asInstanceOf[js.Any])
    if (shareableUrl != null) __obj.updateDynamic("shareableUrl")(shareableUrl.asInstanceOf[js.Any])
    if (sharedAlbumOptions != null) __obj.updateDynamic("sharedAlbumOptions")(sharedAlbumOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareInfo]
  }
}

