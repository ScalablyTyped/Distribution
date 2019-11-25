package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortBinding extends js.Object {
  var HostIp: js.UndefOr[String] = js.undefined
  var HostPort: js.UndefOr[String] = js.undefined
}

object PortBinding {
  @scala.inline
  def apply(HostIp: String = null, HostPort: String = null): PortBinding = {
    val __obj = js.Dynamic.literal()
    if (HostIp != null) __obj.updateDynamic("HostIp")(HostIp.asInstanceOf[js.Any])
    if (HostPort != null) __obj.updateDynamic("HostPort")(HostPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortBinding]
  }
}

