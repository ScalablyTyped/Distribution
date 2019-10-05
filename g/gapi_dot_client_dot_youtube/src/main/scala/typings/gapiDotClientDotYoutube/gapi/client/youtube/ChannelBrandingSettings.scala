package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelBrandingSettings extends js.Object {
  /** Branding properties for the channel view. */
  var channel: js.UndefOr[ChannelSettings] = js.undefined
  /** Additional experimental branding properties. */
  var hints: js.UndefOr[js.Array[PropertyValue]] = js.undefined
  /** Branding properties for branding images. */
  var image: js.UndefOr[ImageSettings] = js.undefined
  /** Branding properties for the watch page. */
  var watch: js.UndefOr[WatchSettings] = js.undefined
}

object ChannelBrandingSettings {
  @scala.inline
  def apply(
    channel: ChannelSettings = null,
    hints: js.Array[PropertyValue] = null,
    image: ImageSettings = null,
    watch: WatchSettings = null
  ): ChannelBrandingSettings = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (hints != null) __obj.updateDynamic("hints")(hints)
    if (image != null) __obj.updateDynamic("image")(image)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[ChannelBrandingSettings]
  }
}

