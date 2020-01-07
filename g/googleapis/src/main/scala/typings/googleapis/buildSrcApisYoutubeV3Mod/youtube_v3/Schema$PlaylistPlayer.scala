package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PlaylistPlayer extends js.Object {
  /**
    * An &lt;iframe&gt; tag that embeds a player that will play the playlist.
    */
  var embedHtml: js.UndefOr[String] = js.native
}

object Schema$PlaylistPlayer {
  @scala.inline
  def apply(embedHtml: String = null): Schema$PlaylistPlayer = {
    val __obj = js.Dynamic.literal()
    if (embedHtml != null) __obj.updateDynamic("embedHtml")(embedHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlaylistPlayer]
  }
}

