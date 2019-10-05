package typings.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceCandidate extends js.Object {
  var candidate: String
  var sdpMLineIndex: js.UndefOr[Double] = js.undefined
  var sdpMid: js.UndefOr[String] = js.undefined
}

object RTCIceCandidate {
  @scala.inline
  def apply(candidate: String, sdpMLineIndex: Int | Double = null, sdpMid: String = null): RTCIceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate)
    if (sdpMLineIndex != null) __obj.updateDynamic("sdpMLineIndex")(sdpMLineIndex.asInstanceOf[js.Any])
    if (sdpMid != null) __obj.updateDynamic("sdpMid")(sdpMid)
    __obj.asInstanceOf[RTCIceCandidate]
  }
}

