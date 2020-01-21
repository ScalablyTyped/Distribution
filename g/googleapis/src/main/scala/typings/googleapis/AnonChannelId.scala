package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChannelId extends js.Object {
  var channelId: js.UndefOr[String] = js.native
}

object AnonChannelId {
  @scala.inline
  def apply(channelId: String = null): AnonChannelId = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannelId]
  }
}

