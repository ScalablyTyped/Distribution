package typings.gapiDotClientDotPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelId extends js.Object {
  /** ID of the YouTube channel owned by the Actor. */
  var channelId: js.UndefOr[String] = js.undefined
}

object Anon_ChannelId {
  @scala.inline
  def apply(channelId: String = null): Anon_ChannelId = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChannelId]
  }
}

