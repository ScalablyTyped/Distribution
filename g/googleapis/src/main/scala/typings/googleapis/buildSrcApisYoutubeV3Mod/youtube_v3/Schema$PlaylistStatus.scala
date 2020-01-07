package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PlaylistStatus extends js.Object {
  /**
    * The playlist&#39;s privacy status.
    */
  var privacyStatus: js.UndefOr[String] = js.native
}

object Schema$PlaylistStatus {
  @scala.inline
  def apply(privacyStatus: String = null): Schema$PlaylistStatus = {
    val __obj = js.Dynamic.literal()
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlaylistStatus]
  }
}

