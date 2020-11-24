package typings.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnIceCandidateEvent extends js.Object {
  
  var candidate: RTCIceCandidate = js.native
}
object OnIceCandidateEvent {
  
  @scala.inline
  def apply(candidate: RTCIceCandidate): OnIceCandidateEvent = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnIceCandidateEvent]
  }
  
  @scala.inline
  implicit class OnIceCandidateEventOps[Self <: OnIceCandidateEvent] (val x: Self) extends AnyVal {
    
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
    def setCandidate(value: RTCIceCandidate): Self = this.set("candidate", value.asInstanceOf[js.Any])
  }
}
