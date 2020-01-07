package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.googleapis.Anon_Favorites
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the content of a channel.
  */
@js.native
trait Schema$ChannelContentDetails extends js.Object {
  var relatedPlaylists: js.UndefOr[Anon_Favorites] = js.native
}

object Schema$ChannelContentDetails {
  @scala.inline
  def apply(relatedPlaylists: Anon_Favorites = null): Schema$ChannelContentDetails = {
    val __obj = js.Dynamic.literal()
    if (relatedPlaylists != null) __obj.updateDynamic("relatedPlaylists")(relatedPlaylists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChannelContentDetails]
  }
}

