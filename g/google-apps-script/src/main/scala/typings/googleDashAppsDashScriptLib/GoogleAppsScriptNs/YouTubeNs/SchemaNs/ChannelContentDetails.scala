package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelContentDetails extends js.Object {
  var relatedPlaylists: js.UndefOr[ChannelContentDetailsRelatedPlaylists] = js.undefined
}

object ChannelContentDetails {
  @scala.inline
  def apply(relatedPlaylists: ChannelContentDetailsRelatedPlaylists = null): ChannelContentDetails = {
    val __obj = js.Dynamic.literal()
    if (relatedPlaylists != null) __obj.updateDynamic("relatedPlaylists")(relatedPlaylists)
    __obj.asInstanceOf[ChannelContentDetails]
  }
}

