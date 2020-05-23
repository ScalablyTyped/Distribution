package typings.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCOfferOptions extends js.Object {
  var iceRestart: js.UndefOr[Boolean] = js.undefined
  var offerToReceiveAudio: js.UndefOr[Double] = js.undefined
  var offerToReceiveVideo: js.UndefOr[Double] = js.undefined
  var voiceActivityDetection: js.UndefOr[Boolean] = js.undefined
}

object RTCOfferOptions {
  @scala.inline
  def apply(
    iceRestart: js.UndefOr[Boolean] = js.undefined,
    offerToReceiveAudio: js.UndefOr[Double] = js.undefined,
    offerToReceiveVideo: js.UndefOr[Double] = js.undefined,
    voiceActivityDetection: js.UndefOr[Boolean] = js.undefined
  ): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iceRestart)) __obj.updateDynamic("iceRestart")(iceRestart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offerToReceiveAudio)) __obj.updateDynamic("offerToReceiveAudio")(offerToReceiveAudio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offerToReceiveVideo)) __obj.updateDynamic("offerToReceiveVideo")(offerToReceiveVideo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceActivityDetection)) __obj.updateDynamic("voiceActivityDetection")(voiceActivityDetection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOfferOptions]
  }
}

