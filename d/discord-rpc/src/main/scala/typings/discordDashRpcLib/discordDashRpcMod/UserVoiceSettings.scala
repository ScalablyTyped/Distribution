package typings
package discordDashRpcLib.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserVoiceSettings extends js.Object {
  var id: java.lang.String
  var mute: js.UndefOr[scala.Boolean] = js.undefined
  var pan: js.UndefOr[discordDashRpcLib.Anon_Left] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
}

object UserVoiceSettings {
  @scala.inline
  def apply(
    id: java.lang.String,
    mute: js.UndefOr[scala.Boolean] = js.undefined,
    pan: discordDashRpcLib.Anon_Left = null,
    volume: scala.Int | scala.Double = null
  ): UserVoiceSettings = {
    val __obj = js.Dynamic.literal(id = id)
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute)
    if (pan != null) __obj.updateDynamic("pan")(pan)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserVoiceSettings]
  }
}

