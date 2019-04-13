package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInfo extends js.Object {
  var Aliases: js.UndefOr[js.Any] = js.undefined
  var EndpointID: java.lang.String
  var Gateway: java.lang.String
  var GlobalIPv6Address: java.lang.String
  var GlobalIPv6PrefixLen: scala.Double
  var IPAMConfig: js.UndefOr[js.Any] = js.undefined
  var IPAddress: java.lang.String
  var IPPrefixLen: scala.Double
  var IPv6Gateway: java.lang.String
  var Links: js.UndefOr[js.Any] = js.undefined
  var MacAddress: java.lang.String
  var NetworkID: java.lang.String
}

object NetworkInfo {
  @scala.inline
  def apply(
    EndpointID: java.lang.String,
    Gateway: java.lang.String,
    GlobalIPv6Address: java.lang.String,
    GlobalIPv6PrefixLen: scala.Double,
    IPAddress: java.lang.String,
    IPPrefixLen: scala.Double,
    IPv6Gateway: java.lang.String,
    MacAddress: java.lang.String,
    NetworkID: java.lang.String,
    Aliases: js.Any = null,
    IPAMConfig: js.Any = null,
    Links: js.Any = null
  ): NetworkInfo = {
    val __obj = js.Dynamic.literal(EndpointID = EndpointID, Gateway = Gateway, GlobalIPv6Address = GlobalIPv6Address, GlobalIPv6PrefixLen = GlobalIPv6PrefixLen, IPAddress = IPAddress, IPPrefixLen = IPPrefixLen, IPv6Gateway = IPv6Gateway, MacAddress = MacAddress, NetworkID = NetworkID)
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases)
    if (IPAMConfig != null) __obj.updateDynamic("IPAMConfig")(IPAMConfig)
    if (Links != null) __obj.updateDynamic("Links")(Links)
    __obj.asInstanceOf[NetworkInfo]
  }
}

