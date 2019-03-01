package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable:interface-name */
trait IPAMConfig extends js.Object {
  var IPv4Address: js.UndefOr[java.lang.String] = js.undefined
  var IPv6Address: js.UndefOr[java.lang.String] = js.undefined
  var LinkLocalIPs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object IPAMConfig {
  @scala.inline
  def apply(
    IPv4Address: java.lang.String = null,
    IPv6Address: java.lang.String = null,
    LinkLocalIPs: js.Array[java.lang.String] = null
  ): IPAMConfig = {
    val __obj = js.Dynamic.literal()
    if (IPv4Address != null) __obj.updateDynamic("IPv4Address")(IPv4Address)
    if (IPv6Address != null) __obj.updateDynamic("IPv6Address")(IPv6Address)
    if (LinkLocalIPs != null) __obj.updateDynamic("LinkLocalIPs")(LinkLocalIPs)
    __obj.asInstanceOf[IPAMConfig]
  }
}

