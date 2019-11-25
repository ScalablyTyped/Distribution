package typings.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCConfiguration extends js.Object {
  var iceServers: js.Array[RTCIceServer]
  var iceTransports: js.UndefOr[String] = js.undefined
  var peerIdentity: js.UndefOr[String] = js.undefined
}

object RTCConfiguration {
  @scala.inline
  def apply(iceServers: js.Array[RTCIceServer], iceTransports: String = null, peerIdentity: String = null): RTCConfiguration = {
    val __obj = js.Dynamic.literal(iceServers = iceServers.asInstanceOf[js.Any])
    if (iceTransports != null) __obj.updateDynamic("iceTransports")(iceTransports.asInstanceOf[js.Any])
    if (peerIdentity != null) __obj.updateDynamic("peerIdentity")(peerIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCConfiguration]
  }
}

