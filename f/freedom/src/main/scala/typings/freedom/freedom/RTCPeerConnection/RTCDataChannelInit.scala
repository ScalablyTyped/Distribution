package typings.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDataChannelInit extends js.Object {
  var id: js.UndefOr[Double] = js.native
  var maxPacketLifeTime: js.UndefOr[Double] = js.native
  var maxRetransmits: js.UndefOr[Double] = js.native
  var negotiated: js.UndefOr[Boolean] = js.native
  var ordered: js.UndefOr[Boolean] = js.native
  var protocol: js.UndefOr[String] = js.native
}

object RTCDataChannelInit {
  @scala.inline
  def apply(): RTCDataChannelInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCDataChannelInit]
  }
  @scala.inline
  implicit class RTCDataChannelInitOps[Self <: RTCDataChannelInit] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMaxPacketLifeTime(value: Double): Self = this.set("maxPacketLifeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPacketLifeTime: Self = this.set("maxPacketLifeTime", js.undefined)
    @scala.inline
    def setMaxRetransmits(value: Double): Self = this.set("maxRetransmits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetransmits: Self = this.set("maxRetransmits", js.undefined)
    @scala.inline
    def setNegotiated(value: Boolean): Self = this.set("negotiated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegotiated: Self = this.set("negotiated", js.undefined)
    @scala.inline
    def setOrdered(value: Boolean): Self = this.set("ordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdered: Self = this.set("ordered", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
  
}

