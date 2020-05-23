package typings.discordRpc.mod

import typings.discordRpc.anon.Name
import typings.discordRpc.discordRpcStrings.audioinput
import typings.discordRpc.discordRpcStrings.audiooutput
import typings.discordRpc.discordRpcStrings.videoinput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertifiedDevice extends js.Object {
  var automaticGainControl: js.UndefOr[Boolean] = js.undefined
  var echoCancellation: js.UndefOr[Boolean] = js.undefined
  var hardwareMute: js.UndefOr[Boolean] = js.undefined
  var model: Name
  var noiseSuppression: js.UndefOr[Boolean] = js.undefined
  var related: js.Array[String]
  var `type`: audioinput | audiooutput | videoinput
  var uuid: String
  var vendor: Name
}

object CertifiedDevice {
  @scala.inline
  def apply(
    model: Name,
    related: js.Array[String],
    `type`: audioinput | audiooutput | videoinput,
    uuid: String,
    vendor: Name,
    automaticGainControl: js.UndefOr[Boolean] = js.undefined,
    echoCancellation: js.UndefOr[Boolean] = js.undefined,
    hardwareMute: js.UndefOr[Boolean] = js.undefined,
    noiseSuppression: js.UndefOr[Boolean] = js.undefined
  ): CertifiedDevice = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticGainControl)) __obj.updateDynamic("automaticGainControl")(automaticGainControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(echoCancellation)) __obj.updateDynamic("echoCancellation")(echoCancellation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareMute)) __obj.updateDynamic("hardwareMute")(hardwareMute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noiseSuppression)) __obj.updateDynamic("noiseSuppression")(noiseSuppression.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertifiedDevice]
  }
}

