package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedAlbumOptions extends js.Object {
  /**
    * True if the shared album allows collaborators (users who have joined
    * the album) to add media items to it. Defaults to false.
    */
  var isCollaborative: js.UndefOr[Boolean] = js.undefined
  /**
    * True if the shared album allows the owner and the collaborators (users
    * who have joined the album) to add comments to the album. Defaults to false.
    */
  var isCommentable: js.UndefOr[Boolean] = js.undefined
}

object SharedAlbumOptions {
  @scala.inline
  def apply(
    isCollaborative: js.UndefOr[Boolean] = js.undefined,
    isCommentable: js.UndefOr[Boolean] = js.undefined
  ): SharedAlbumOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCollaborative)) __obj.updateDynamic("isCollaborative")(isCollaborative.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCommentable)) __obj.updateDynamic("isCommentable")(isCommentable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAlbumOptions]
  }
}

