package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aliases extends js.Object {
  var Aliases: js.UndefOr[js.Any] = js.undefined
  var EndpointID: String
  var Gateway: String
  var GlobalIPv6Address: String
  var GlobalIPv6PrefixLen: Double
  var IPAMConfig: js.UndefOr[js.Any] = js.undefined
  var IPAddress: String
  var IPPrefixLen: Double
  var IPv6Gateway: String
  var Links: js.UndefOr[js.Any] = js.undefined
  var MacAddress: String
  var NetworkID: String
}

object Anon_Aliases {
  @scala.inline
  def apply(
    EndpointID: String,
    Gateway: String,
    GlobalIPv6Address: String,
    GlobalIPv6PrefixLen: Double,
    IPAddress: String,
    IPPrefixLen: Double,
    IPv6Gateway: String,
    MacAddress: String,
    NetworkID: String,
    Aliases: js.Any = null,
    IPAMConfig: js.Any = null,
    Links: js.Any = null
  ): Anon_Aliases = {
    val __obj = js.Dynamic.literal(EndpointID = EndpointID, Gateway = Gateway, GlobalIPv6Address = GlobalIPv6Address, GlobalIPv6PrefixLen = GlobalIPv6PrefixLen, IPAddress = IPAddress, IPPrefixLen = IPPrefixLen, IPv6Gateway = IPv6Gateway, MacAddress = MacAddress, NetworkID = NetworkID)
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases)
    if (IPAMConfig != null) __obj.updateDynamic("IPAMConfig")(IPAMConfig)
    if (Links != null) __obj.updateDynamic("Links")(Links)
    __obj.asInstanceOf[Anon_Aliases]
  }
}

