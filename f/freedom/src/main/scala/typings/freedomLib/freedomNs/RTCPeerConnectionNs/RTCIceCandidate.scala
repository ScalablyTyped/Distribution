package typings
package freedomLib.freedomNs.RTCPeerConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceCandidate extends js.Object {
  var candidate: java.lang.String
  var sdpMLineIndex: js.UndefOr[scala.Double] = js.undefined
  var sdpMid: js.UndefOr[java.lang.String] = js.undefined
}

object RTCIceCandidate {
  @scala.inline
  def apply(
    candidate: java.lang.String,
    sdpMLineIndex: scala.Int | scala.Double = null,
    sdpMid: java.lang.String = null
  ): RTCIceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate)
    if (sdpMLineIndex != null) __obj.updateDynamic("sdpMLineIndex")(sdpMLineIndex.asInstanceOf[js.Any])
    if (sdpMid != null) __obj.updateDynamic("sdpMid")(sdpMid)
    __obj.asInstanceOf[RTCIceCandidate]
  }
}

