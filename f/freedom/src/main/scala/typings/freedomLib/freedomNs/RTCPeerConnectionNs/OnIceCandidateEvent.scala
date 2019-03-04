package typings
package freedomLib.freedomNs.RTCPeerConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnIceCandidateEvent extends js.Object {
  var candidate: RTCIceCandidate
}

object OnIceCandidateEvent {
  @scala.inline
  def apply(candidate: RTCIceCandidate): OnIceCandidateEvent = {
    val __obj = js.Dynamic.literal(candidate = candidate)
  
    __obj.asInstanceOf[OnIceCandidateEvent]
  }
}

