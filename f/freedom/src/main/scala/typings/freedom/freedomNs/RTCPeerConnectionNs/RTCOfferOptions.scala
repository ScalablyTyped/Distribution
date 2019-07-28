package typings.freedom.freedomNs.RTCPeerConnectionNs

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
    offerToReceiveAudio: Int | Double = null,
    offerToReceiveVideo: Int | Double = null,
    voiceActivityDetection: js.UndefOr[Boolean] = js.undefined
  ): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iceRestart)) __obj.updateDynamic("iceRestart")(iceRestart)
    if (offerToReceiveAudio != null) __obj.updateDynamic("offerToReceiveAudio")(offerToReceiveAudio.asInstanceOf[js.Any])
    if (offerToReceiveVideo != null) __obj.updateDynamic("offerToReceiveVideo")(offerToReceiveVideo.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceActivityDetection)) __obj.updateDynamic("voiceActivityDetection")(voiceActivityDetection)
    __obj.asInstanceOf[RTCOfferOptions]
  }
}

