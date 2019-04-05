package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchSettings extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var featuredPlaylistId: js.UndefOr[java.lang.String] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object WatchSettings {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    featuredPlaylistId: java.lang.String = null,
    textColor: java.lang.String = null
  ): WatchSettings = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (featuredPlaylistId != null) __obj.updateDynamic("featuredPlaylistId")(featuredPlaylistId)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[WatchSettings]
  }
}

