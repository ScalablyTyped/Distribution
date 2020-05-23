package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostIp extends js.Object {
  var HostIp: String
  var HostPort: String
}

object HostIp {
  @scala.inline
  def apply(HostIp: String, HostPort: String): HostIp = {
    val __obj = js.Dynamic.literal(HostIp = HostIp.asInstanceOf[js.Any], HostPort = HostPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostIp]
  }
}

