package typings.gapiClientYoutube.gapi.client.youtube

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
    if (imageBytes != null) __obj.updateDynamic("imageBytes")(imageBytes.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (targetChannelId != null) __obj.updateDynamic("targetChannelId")(targetChannelId.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvideoBranding]
  }
}

