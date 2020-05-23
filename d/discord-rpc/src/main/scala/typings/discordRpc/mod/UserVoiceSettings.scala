package typings.discordRpc.mod

import typings.discordRpc.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserVoiceSettings extends js.Object {
  var id: String
  var mute: js.UndefOr[Boolean] = js.undefined
  var pan: js.UndefOr[Left] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object UserVoiceSettings {
  @scala.inline
  def apply(
    id: String,
    mute: js.UndefOr[Boolean] = js.undefined,
    pan: Left = null,
    volume: js.UndefOr[Double] = js.undefined
  ): UserVoiceSettings = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.get.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserVoiceSettings]
  }
}

