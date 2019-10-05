package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsPlaylistItem extends js.Object {
  /** The value that YouTube uses to uniquely identify the playlist. */
  var playlistId: js.UndefOr[String] = js.undefined
  /** ID of the item within the playlist. */
  var playlistItemId: js.UndefOr[String] = js.undefined
  /** The resourceId object contains information about the resource that was added to the playlist. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsPlaylistItem {
  @scala.inline
  def apply(playlistId: String = null, playlistItemId: String = null, resourceId: ResourceId = null): ActivityContentDetailsPlaylistItem = {
    val __obj = js.Dynamic.literal()
    if (playlistId != null) __obj.updateDynamic("playlistId")(playlistId)
    if (playlistItemId != null) __obj.updateDynamic("playlistItemId")(playlistItemId)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    __obj.asInstanceOf[ActivityContentDetailsPlaylistItem]
  }
}

