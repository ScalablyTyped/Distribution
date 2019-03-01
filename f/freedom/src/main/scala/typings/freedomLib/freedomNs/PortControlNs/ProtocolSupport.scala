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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("natPmp")(natPmp)
    __obj.updateDynamic("pcp")(pcp)
    __obj.updateDynamic("upnp")(upnp)
    __obj.asInstanceOf[ProtocolSupport]
  }
}

