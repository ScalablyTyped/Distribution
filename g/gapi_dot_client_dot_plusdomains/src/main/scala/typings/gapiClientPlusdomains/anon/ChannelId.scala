package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelId extends js.Object {
  /** ID of the YouTube channel owned by the Actor. */
  var channelId: js.UndefOr[String] = js.undefined
}

object ChannelId {
  @scala.inline
  def apply(channelId: String = null): ChannelId = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelId]
  }
}

