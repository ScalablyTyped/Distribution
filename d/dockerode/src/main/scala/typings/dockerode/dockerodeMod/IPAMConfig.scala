package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable:interface-name */
trait IPAMConfig extends js.Object {
  var IPv4Address: js.UndefOr[String] = js.undefined
  var IPv6Address: js.UndefOr[String] = js.undefined
  var LinkLocalIPs: js.UndefOr[js.Array[String]] = js.undefined
}

object IPAMConfig {
  @scala.inline
  def apply(IPv4Address: String = null, IPv6Address: String = null, LinkLocalIPs: js.Array[String] = null): IPAMConfig = {
    val __obj = js.Dynamic.literal()
    if (IPv4Address != null) __obj.updateDynamic("IPv4Address")(IPv4Address.asInstanceOf[js.Any])
    if (IPv6Address != null) __obj.updateDynamic("IPv6Address")(IPv6Address.asInstanceOf[js.Any])
    if (LinkLocalIPs != null) __obj.updateDynamic("LinkLocalIPs")(LinkLocalIPs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPAMConfig]
  }
}

