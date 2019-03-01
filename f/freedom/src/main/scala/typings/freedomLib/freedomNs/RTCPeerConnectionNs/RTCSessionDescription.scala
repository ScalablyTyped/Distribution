package typings
package freedomLib.freedomNs.RTCPeerConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCSessionDescription extends js.Object {
  var sdp: java.lang.String
  var `type`: java.lang.String
}

object RTCSessionDescription {
  @scala.inline
  def apply(sdp: java.lang.String, `type`: java.lang.String): RTCSessionDescription = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("sdp")(sdp)
    __obj.asInstanceOf[RTCSessionDescription]
  }
}

