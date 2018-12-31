package typings
package discordDashRpcLib.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertifiedDevice extends js.Object {
  var automaticGainControl: js.UndefOr[scala.Boolean] = js.undefined
  var echoCancellation: js.UndefOr[scala.Boolean] = js.undefined
  var hardwareMute: js.UndefOr[scala.Boolean] = js.undefined
  var model: discordDashRpcLib.Anon_Url
  var noiseSuppression: js.UndefOr[scala.Boolean] = js.undefined
  var related: js.Array[java.lang.String]
  var `type`: discordDashRpcLib.discordDashRpcLibStrings.audioinput | discordDashRpcLib.discordDashRpcLibStrings.audiooutput | discordDashRpcLib.discordDashRpcLibStrings.videoinput
  var uuid: java.lang.String
  var vendor: discordDashRpcLib.Anon_Url
}

