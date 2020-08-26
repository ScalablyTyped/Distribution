package typings.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCConfiguration extends js.Object {
  var iceServers: js.Array[RTCIceServer] = js.native
  var iceTransports: js.UndefOr[String] = js.native
  var peerIdentity: js.UndefOr[String] = js.native
}

object RTCConfiguration {
  @scala.inline
  def apply(iceServers: js.Array[RTCIceServer]): RTCConfiguration = {
    val __obj = js.Dynamic.literal(iceServers = iceServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCConfiguration]
  }
  @scala.inline
  implicit class RTCConfigurationOps[Self <: RTCConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIceServersVarargs(value: RTCIceServer*): Self = this.set("iceServers", js.Array(value :_*))
    @scala.inline
    def setIceServers(value: js.Array[RTCIceServer]): Self = this.set("iceServers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIceTransports(value: String): Self = this.set("iceTransports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceTransports: Self = this.set("iceTransports", js.undefined)
    @scala.inline
    def setPeerIdentity(value: String): Self = this.set("peerIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerIdentity: Self = this.set("peerIdentity", js.undefined)
  }
  
}

