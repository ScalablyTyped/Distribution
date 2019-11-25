package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelLocalization extends js.Object {
  /** The localized strings for channel's description. */
  var description: js.UndefOr[String] = js.undefined
  /** The localized strings for channel's title. */
  var title: js.UndefOr[String] = js.undefined
}

object ChannelLocalization {
  @scala.inline
  def apply(description: String = null, title: String = null): ChannelLocalization = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelLocalization]
  }
}

