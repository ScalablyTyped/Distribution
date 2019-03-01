package typings
package discordDashRpcLib.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceSettings extends js.Object {
  var automaticGainControl: scala.Boolean
  var deaf: scala.Boolean
  var echoCancellation: scala.Boolean
  var input: js.UndefOr[discordDashRpcLib.Anon_Device] = js.undefined
  var mode: js.UndefOr[discordDashRpcLib.Anon_AutoThreshold] = js.undefined
  var mute: scala.Boolean
  var noiseSuppression: scala.Boolean
  var output: js.UndefOr[discordDashRpcLib.Anon_Device] = js.undefined
  var qos: scala.Boolean
  var silenceWarning: scala.Boolean
}

object VoiceSettings {
  @scala.inline
  def apply(
    automaticGainControl: scala.Boolean,
    deaf: scala.Boolean,
    echoCancellation: scala.Boolean,
    mute: scala.Boolean,
    noiseSuppression: scala.Boolean,
    qos: scala.Boolean,
    silenceWarning: scala.Boolean,
    input: discordDashRpcLib.Anon_Device = null,
    mode: discordDashRpcLib.Anon_AutoThreshold = null,
    output: discordDashRpcLib.Anon_Device = null
  ): VoiceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("automaticGainControl")(automaticGainControl)
    __obj.updateDynamic("deaf")(deaf)
    __obj.updateDynamic("echoCancellation")(echoCancellation)
    __obj.updateDynamic("mute")(mute)
    __obj.updateDynamic("noiseSuppression")(noiseSuppression)
    __obj.updateDynamic("qos")(qos)
    __obj.updateDynamic("silenceWarning")(silenceWarning)
    if (input != null) __obj.updateDynamic("input")(input)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[VoiceSettings]
  }
}

