package typings.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceCandidate extends js.Object {
  
  var candidate: String = js.native
  
  var sdpMLineIndex: js.UndefOr[Double] = js.native
  
  var sdpMid: js.UndefOr[String] = js.native
}
object RTCIceCandidate {
  
  @scala.inline
  def apply(candidate: String): RTCIceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidate]
  }
  
  @scala.inline
  implicit class RTCIceCandidateOps[Self <: RTCIceCandidate] (val x: Self) extends AnyVal {
    
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
    def setCandidate(value: String): Self = this.set("candidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpMLineIndex(value: Double): Self = this.set("sdpMLineIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdpMLineIndex: Self = this.set("sdpMLineIndex", js.undefined)
    
    @scala.inline
    def setSdpMid(value: String): Self = this.set("sdpMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdpMid: Self = this.set("sdpMid", js.undefined)
  }
}
