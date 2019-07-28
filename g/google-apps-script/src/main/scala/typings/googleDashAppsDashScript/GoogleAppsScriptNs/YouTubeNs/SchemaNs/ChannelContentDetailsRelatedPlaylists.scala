package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelContentDetailsRelatedPlaylists extends js.Object {
  var favorites: js.UndefOr[String] = js.undefined
  var likes: js.UndefOr[String] = js.undefined
  var uploads: js.UndefOr[String] = js.undefined
  var watchHistory: js.UndefOr[String] = js.undefined
  var watchLater: js.UndefOr[String] = js.undefined
}

object ChannelContentDetailsRelatedPlaylists {
  @scala.inline
  def apply(
    favorites: String = null,
    likes: String = null,
    uploads: String = null,
    watchHistory: String = null,
    watchLater: String = null
  ): ChannelContentDetailsRelatedPlaylists = {
    val __obj = js.Dynamic.literal()
    if (favorites != null) __obj.updateDynamic("favorites")(favorites)
    if (likes != null) __obj.updateDynamic("likes")(likes)
    if (uploads != null) __obj.updateDynamic("uploads")(uploads)
    if (watchHistory != null) __obj.updateDynamic("watchHistory")(watchHistory)
    if (watchLater != null) __obj.updateDynamic("watchLater")(watchLater)
    __obj.asInstanceOf[ChannelContentDetailsRelatedPlaylists]
  }
}

