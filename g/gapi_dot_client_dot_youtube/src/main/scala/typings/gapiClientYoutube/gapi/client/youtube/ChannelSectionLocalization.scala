package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionLocalization extends js.Object {
  /** The localized strings for channel section's title. */
  var title: js.UndefOr[String] = js.undefined
}

object ChannelSectionLocalization {
  @scala.inline
  def apply(title: String = null): ChannelSectionLocalization = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSectionLocalization]
  }
}

