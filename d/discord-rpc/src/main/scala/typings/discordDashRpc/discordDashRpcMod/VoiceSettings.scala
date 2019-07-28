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
    val __obj = js.Dynamic.literal(automaticGainControl = automaticGainControl, deaf = deaf, echoCancellation = echoCancellation, mute = mute, noiseSuppression = noiseSuppression, qos = qos, silenceWarning = silenceWarning)
    if (input != null) __obj.updateDynamic("input")(input)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[VoiceSettings]
  }
}

