package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PlaylistContentDetails extends js.Object {
  /**
    * The number of videos in the playlist.
    */
  var itemCount: js.UndefOr[Double] = js.native
}

object Schema$PlaylistContentDetails {
  @scala.inline
  def apply(itemCount: Int | Double = null): Schema$PlaylistContentDetails = {
    val __obj = js.Dynamic.literal()
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlaylistContentDetails]
  }
}

