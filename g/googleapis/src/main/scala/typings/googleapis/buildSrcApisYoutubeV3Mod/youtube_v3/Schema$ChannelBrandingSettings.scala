package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Branding properties of a YouTube channel.
  */
@js.native
trait Schema$ChannelBrandingSettings extends js.Object {
  /**
    * Branding properties for the channel view.
    */
  var channel: js.UndefOr[Schema$ChannelSettings] = js.native
  /**
    * Additional experimental branding properties.
    */
  var hints: js.UndefOr[js.Array[Schema$PropertyValue]] = js.native
  /**
    * Branding properties for branding images.
    */
  var image: js.UndefOr[Schema$ImageSettings] = js.native
  /**
    * Branding properties for the watch page.
    */
  var watch: js.UndefOr[Schema$WatchSettings] = js.native
}

object Schema$ChannelBrandingSettings {
  @scala.inline
  def apply(
    channel: Schema$ChannelSettings = null,
    hints: js.Array[Schema$PropertyValue] = null,
    image: Schema$ImageSettings = null,
    watch: Schema$WatchSettings = null
  ): Schema$ChannelBrandingSettings = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChannelBrandingSettings]
  }
}

