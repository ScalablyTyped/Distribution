package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

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

