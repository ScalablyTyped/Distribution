package typings.discordDashRpc.discordDashRpcMod

import typings.discordDashRpc.Anon_AutoThreshold
import typings.discordDashRpc.Anon_Device
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceSettings extends js.Object {
  var automaticGainControl: Boolean
  var deaf: Boolean
  var echoCancellation: Boolean
  var input: js.UndefOr[Anon_Device] = js.undefined
  var mode: js.UndefOr[Anon_AutoThreshold] = js.undefined
  var mute: Boolean
  var noiseSuppression: Boolean
  var output: js.UndefOr[Anon_Device] = js.undefined
  var qos: Boolean
  var silenceWarning: Boolean
}

object VoiceSettings {
  @scala.inline
  def apply(
    automaticGainControl: Boolean,
    deaf: Boolean,
    echoCancellation: Boolean,
    mute: Boolean,
    noiseSuppression: Boolean,
    qos: Boolean,
    silenceWarning: Boolean,
    input: Anon_Device = null,
    mode: Anon_AutoThreshold = null,
    output: Anon_Device = null
  ): VoiceSettings = {
    val __obj = js.Dynamic.literal(automaticGainControl = automaticGainControl.asInstanceOf[js.Any], deaf = deaf.asInstanceOf[js.Any], echoCancellation = echoCancellation.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], noiseSuppression = noiseSuppression.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], silenceWarning = silenceWarning.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceSettings]
  }
}

