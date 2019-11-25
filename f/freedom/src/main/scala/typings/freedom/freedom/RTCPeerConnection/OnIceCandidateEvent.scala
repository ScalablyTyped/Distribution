package typings.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnIceCandidateEvent extends js.Object {
  var candidate: RTCIceCandidate
}

object OnIceCandidateEvent {
  @scala.inline
  def apply(candidate: RTCIceCandidate): OnIceCandidateEvent = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnIceCandidateEvent]
  }
}

