package typings
package discordDashRpcLib.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertifiedDevice extends js.Object {
  var automaticGainControl: js.UndefOr[scala.Boolean] = js.undefined
  var echoCancellation: js.UndefOr[scala.Boolean] = js.undefined
  var hardwareMute: js.UndefOr[scala.Boolean] = js.undefined
  var model: discordDashRpcLib.Anon_Name
  var noiseSuppression: js.UndefOr[scala.Boolean] = js.undefined
  var related: js.Array[java.lang.String]
  var `type`: discordDashRpcLib.discordDashRpcLibStrings.audioinput | discordDashRpcLib.discordDashRpcLibStrings.audiooutput | discordDashRpcLib.discordDashRpcLibStrings.videoinput
  var uuid: java.lang.String
  var vendor: discordDashRpcLib.Anon_Name
}

object CertifiedDevice {
  @scala.inline
  def apply(
    model: discordDashRpcLib.Anon_Name,
    related: js.Array[java.lang.String],
    `type`: discordDashRpcLib.discordDashRpcLibStrings.audioinput | discordDashRpcLib.discordDashRpcLibStrings.audiooutput | discordDashRpcLib.discordDashRpcLibStrings.videoinput,
    uuid: java.lang.String,
    vendor: discordDashRpcLib.Anon_Name,
    automaticGainControl: js.UndefOr[scala.Boolean] = js.undefined,
    echoCancellation: js.UndefOr[scala.Boolean] = js.undefined,
    hardwareMute: js.UndefOr[scala.Boolean] = js.undefined,
    noiseSuppression: js.UndefOr[scala.Boolean] = js.undefined
  ): CertifiedDevice = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("related")(related)
    __obj.updateDynamic("uuid")(uuid)
    __obj.updateDynamic("vendor")(vendor)
    if (!js.isUndefined(automaticGainControl)) __obj.updateDynamic("automaticGainControl")(automaticGainControl)
    if (!js.isUndefined(echoCancellation)) __obj.updateDynamic("echoCancellation")(echoCancellation)
    if (!js.isUndefined(hardwareMute)) __obj.updateDynamic("hardwareMute")(hardwareMute)
    if (!js.isUndefined(noiseSuppression)) __obj.updateDynamic("noiseSuppression")(noiseSuppression)
    __obj.asInstanceOf[CertifiedDevice]
  }
}

