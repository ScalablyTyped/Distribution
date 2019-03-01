package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvideoBranding extends js.Object {
  var imageBytes: js.UndefOr[java.lang.String] = js.undefined
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[InvideoPosition] = js.undefined
  var targetChannelId: js.UndefOr[java.lang.String] = js.undefined
  var timing: js.UndefOr[InvideoTiming] = js.undefined
}

object InvideoBranding {
  @scala.inline
  def apply(
    imageBytes: java.lang.String = null,
    imageUrl: java.lang.String = null,
    position: InvideoPosition = null,
    targetChannelId: java.lang.String = null,
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

