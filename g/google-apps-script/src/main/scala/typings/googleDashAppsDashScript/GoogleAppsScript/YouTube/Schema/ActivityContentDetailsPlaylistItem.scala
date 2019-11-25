package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsPlaylistItem extends js.Object {
  var playlistId: js.UndefOr[String] = js.undefined
  var playlistItemId: js.UndefOr[String] = js.undefined
  var resourceId: js.UndefOr[ResourceId] = js.undefined
}

object ActivityContentDetailsPlaylistItem {
  @scala.inline
  def apply(playlistId: String = null, playlistItemId: String = null, resourceId: ResourceId = null): ActivityContentDetailsPlaylistItem = {
    val __obj = js.Dynamic.literal()
    if (playlistId != null) __obj.updateDynamic("playlistId")(playlistId.asInstanceOf[js.Any])
    if (playlistItemId != null) __obj.updateDynamic("playlistItemId")(playlistItemId.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityContentDetailsPlaylistItem]
  }
}

