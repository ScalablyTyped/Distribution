package typings.freedom.freedomNs.PortControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// An object returned by probeProtocolSupport()
trait ProtocolSupport extends js.Object {
  var natPmp: Boolean
  var pcp: Boolean
  var upnp: Boolean
}

object ProtocolSupport {
  @scala.inline
  def apply(natPmp: Boolean, pcp: Boolean, upnp: Boolean): ProtocolSupport = {
    val __obj = js.Dynamic.literal(natPmp = natPmp, pcp = pcp, upnp = upnp)
  
    __obj.asInstanceOf[ProtocolSupport]
  }
}

