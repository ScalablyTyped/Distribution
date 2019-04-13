package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortBinding extends js.Object {
  var HostIp: js.UndefOr[java.lang.String] = js.undefined
  var HostPort: js.UndefOr[java.lang.String] = js.undefined
}

object PortBinding {
  @scala.inline
  def apply(HostIp: java.lang.String = null, HostPort: java.lang.String = null): PortBinding = {
    val __obj = js.Dynamic.literal()
    if (HostIp != null) __obj.updateDynamic("HostIp")(HostIp)
    if (HostPort != null) __obj.updateDynamic("HostPort")(HostPort)
    __obj.asInstanceOf[PortBinding]
  }
}

