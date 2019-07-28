package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvideoBranding extends js.Object {
  var imageBytes: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[InvideoPosition] = js.undefined
  var targetChannelId: js.UndefOr[String] = js.undefined
  var timing: js.UndefOr[InvideoTiming] = js.undefined
}

object InvideoBranding {
  @scala.inline
  def apply(
    imageBytes: String = null,
    imageUrl: String = null,
    position: InvideoPosition = null,
    targetChannelId: String = null,
    timing: InvideoTiming = null
  ): InvideoBranding = {
    val __obj = js.Dynamic.literal()
    if (imageBytes != null) __obj.updateDynamic("imageBytes")(imageBytes)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (position != null) __obj.updateDynamic("position")(position)
    if (targetChannelId != null) __obj.updateDynamic("targetChannelId")(targetChannelId)
    if (timing != null) __obj.updateDynamic("timing")(timing)
    __obj.asInstanceOf[InvideoBranding]
  }
}

