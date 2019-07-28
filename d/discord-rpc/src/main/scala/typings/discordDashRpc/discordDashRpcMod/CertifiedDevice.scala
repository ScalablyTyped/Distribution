package typings.discordDashRpc.discordDashRpcMod

import typings.discordDashRpc.Anon_Name
import typings.discordDashRpc.discordDashRpcStrings.audioinput
import typings.discordDashRpc.discordDashRpcStrings.audiooutput
import typings.discordDashRpc.discordDashRpcStrings.videoinput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertifiedDevice extends js.Object {
  var automaticGainControl: js.UndefOr[Boolean] = js.undefined
  var echoCancellation: js.UndefOr[Boolean] = js.undefined
  var hardwareMute: js.UndefOr[Boolean] = js.undefined
  var model: Anon_Name
  var noiseSuppression: js.UndefOr[Boolean] = js.undefined
  var related: js.Array[String]
  var `type`: audioinput | audiooutput | videoinput
  var uuid: String
  var vendor: Anon_Name
}

object CertifiedDevice {
  @scala.inline
  def apply(
    model: Anon_Name,
    related: js.Array[String],
    `type`: audioinput | audiooutput | videoinput,
    uuid: String,
    vendor: Anon_Name,
    automaticGainControl: js.UndefOr[Boolean] = js.undefined,
    echoCancellation: js.UndefOr[Boolean] = js.undefined,
    hardwareMute: js.UndefOr[Boolean] = js.undefined,
    noiseSuppression: js.UndefOr[Boolean] = js.undefined
  ): CertifiedDevice = {
    val __obj = js.Dynamic.literal(model = model, related = related, uuid = uuid, vendor = vendor)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticGainControl)) __obj.updateDynamic("automaticGainControl")(automaticGainControl)
    if (!js.isUndefined(echoCancellation)) __obj.updateDynamic("echoCancellation")(echoCancellation)
    if (!js.isUndefined(hardwareMute)) __obj.updateDynamic("hardwareMute")(hardwareMute)
    if (!js.isUndefined(noiseSuppression)) __obj.updateDynamic("noiseSuppression")(noiseSuppression)
    __obj.asInstanceOf[CertifiedDevice]
  }
}

