package typings
package freedomLib.freedomNs.RTCPeerConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCConfiguration extends js.Object {
  var iceServers: js.Array[RTCIceServer]
  var iceTransports: js.UndefOr[java.lang.String] = js.undefined
  var peerIdentity: js.UndefOr[java.lang.String] = js.undefined
}

object RTCConfiguration {
  @scala.inline
  def apply(
    iceServers: js.Array[RTCIceServer],
    iceTransports: java.lang.String = null,
    peerIdentity: java.lang.String = null
  ): RTCConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iceServers")(iceServers)
    if (iceTransports != null) __obj.updateDynamic("iceTransports")(iceTransports)
    if (peerIdentity != null) __obj.updateDynamic("peerIdentity")(peerIdentity)
    __obj.asInstanceOf[RTCConfiguration]
  }
}

