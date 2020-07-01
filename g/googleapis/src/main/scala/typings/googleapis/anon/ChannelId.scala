package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelId extends js.Object {
  var channelId: js.UndefOr[String] = js.native
}

object ChannelId {
  @scala.inline
  def apply(channelId: String = null): ChannelId = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelId]
  }
}

