package typings.discordDashRpc.discordDashRpcMod

import typings.discordDashRpc.Anon_Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserVoiceSettings extends js.Object {
  var id: String
  var mute: js.UndefOr[Boolean] = js.undefined
  var pan: js.UndefOr[Anon_Left] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object UserVoiceSettings {
  @scala.inline
  def apply(
    id: String,
    mute: js.UndefOr[Boolean] = js.undefined,
    pan: Anon_Left = null,
    volume: Int | Double = null
  ): UserVoiceSettings = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserVoiceSettings]
  }
}

