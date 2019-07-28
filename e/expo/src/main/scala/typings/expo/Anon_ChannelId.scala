package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelId extends js.Object {
  var channelId: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var sticky: js.UndefOr[Boolean] = js.undefined
}

object Anon_ChannelId {
  @scala.inline
  def apply(
    channelId: String = null,
    color: String = null,
    icon: String = null,
    sticky: js.UndefOr[Boolean] = js.undefined
  ): Anon_ChannelId = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (color != null) __obj.updateDynamic("color")(color)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky)
    __obj.asInstanceOf[Anon_ChannelId]
  }
}

