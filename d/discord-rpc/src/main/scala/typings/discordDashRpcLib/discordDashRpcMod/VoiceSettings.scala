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
  var mode: js.UndefOr[discordDashRpcLib.Anon_Shortcut] = js.undefined
  var mute: scala.Boolean
  var noiseSuppression: scala.Boolean
  var output: js.UndefOr[discordDashRpcLib.Anon_Device] = js.undefined
  var qos: scala.Boolean
  var silenceWarning: scala.Boolean
}

