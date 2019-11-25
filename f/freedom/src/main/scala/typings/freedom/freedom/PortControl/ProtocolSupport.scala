package typings.freedom.freedom.PortControl

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
    val __obj = js.Dynamic.literal(natPmp = natPmp.asInstanceOf[js.Any], pcp = pcp.asInstanceOf[js.Any], upnp = upnp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProtocolSupport]
  }
}

