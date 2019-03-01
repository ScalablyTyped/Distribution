package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelId extends js.Object {
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var sticky: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ChannelId {
  @scala.inline
  def apply(
    channelId: java.lang.String = null,
    color: java.lang.String = null,
    icon: java.lang.String = null,
    sticky: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ChannelId = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (color != null) __obj.updateDynamic("color")(color)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky)
    __obj.asInstanceOf[Anon_ChannelId]
  }
}

