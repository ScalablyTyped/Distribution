package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostIp extends js.Object {
  var HostIp: String
  var HostPort: String
}

object AnonHostIp {
  @scala.inline
  def apply(HostIp: String, HostPort: String): AnonHostIp = {
    val __obj = js.Dynamic.literal(HostIp = HostIp.asInstanceOf[js.Any], HostPort = HostPort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHostIp]
  }
}

