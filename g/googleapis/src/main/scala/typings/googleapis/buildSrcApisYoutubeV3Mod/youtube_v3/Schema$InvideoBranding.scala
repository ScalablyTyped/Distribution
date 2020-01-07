package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InvideoBranding extends js.Object {
  var imageBytes: js.UndefOr[String] = js.native
  var imageUrl: js.UndefOr[String] = js.native
  var position: js.UndefOr[Schema$InvideoPosition] = js.native
  var targetChannelId: js.UndefOr[String] = js.native
  var timing: js.UndefOr[Schema$InvideoTiming] = js.native
}

object Schema$InvideoBranding {
  @scala.inline
  def apply(
    imageBytes: String = null,
    imageUrl: String = null,
    position: Schema$InvideoPosition = null,
    targetChannelId: String = null,
    timing: Schema$InvideoTiming = null
  ): Schema$InvideoBranding = {
    val __obj = js.Dynamic.literal()
    if (imageBytes != null) __obj.updateDynamic("imageBytes")(imageBytes.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (targetChannelId != null) __obj.updateDynamic("targetChannelId")(targetChannelId.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InvideoBranding]
  }
}

