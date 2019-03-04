package typings
package freedomLib.freedomNs.PortControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// An object returned by probeProtocolSupport()
trait ProtocolSupport extends js.Object {
  var natPmp: scala.Boolean
  var pcp: scala.Boolean
  var upnp: scala.Boolean
}

object ProtocolSupport {
  @scala.inline
  def apply(natPmp: scala.Boolean, pcp: scala.Boolean, upnp: scala.Boolean): ProtocolSupport = {
    val __obj = js.Dynamic.literal(natPmp = natPmp, pcp = pcp, upnp = upnp)
  
    __obj.asInstanceOf[ProtocolSupport]
  }
}

