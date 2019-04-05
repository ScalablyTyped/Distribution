package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelContentDetailsRelatedPlaylists extends js.Object {
  var favorites: js.UndefOr[java.lang.String] = js.undefined
  var likes: js.UndefOr[java.lang.String] = js.undefined
  var uploads: js.UndefOr[java.lang.String] = js.undefined
  var watchHistory: js.UndefOr[java.lang.String] = js.undefined
  var watchLater: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelContentDetailsRelatedPlaylists {
  @scala.inline
  def apply(
    favorites: java.lang.String = null,
    likes: java.lang.String = null,
    uploads: java.lang.String = null,
    watchHistory: java.lang.String = null,
    watchLater: java.lang.String = null
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

