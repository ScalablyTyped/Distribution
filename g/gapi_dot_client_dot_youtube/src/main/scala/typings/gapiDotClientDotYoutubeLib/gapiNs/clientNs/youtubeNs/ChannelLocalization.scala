package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelLocalization extends js.Object {
  /** The localized strings for channel's description. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The localized strings for channel's title. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelLocalization {
  @scala.inline
  def apply(description: java.lang.String = null, title: java.lang.String = null): ChannelLocalization = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ChannelLocalization]
  }
}

