package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInfo extends js.Object {
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

object NetworkInfo {
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
  ): NetworkInfo = {
    val __obj = js.Dynamic.literal(EndpointID = EndpointID.asInstanceOf[js.Any], Gateway = Gateway.asInstanceOf[js.Any], GlobalIPv6Address = GlobalIPv6Address.asInstanceOf[js.Any], GlobalIPv6PrefixLen = GlobalIPv6PrefixLen.asInstanceOf[js.Any], IPAddress = IPAddress.asInstanceOf[js.Any], IPPrefixLen = IPPrefixLen.asInstanceOf[js.Any], IPv6Gateway = IPv6Gateway.asInstanceOf[js.Any], MacAddress = MacAddress.asInstanceOf[js.Any], NetworkID = NetworkID.asInstanceOf[js.Any])
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases.asInstanceOf[js.Any])
    if (IPAMConfig != null) __obj.updateDynamic("IPAMConfig")(IPAMConfig.asInstanceOf[js.Any])
    if (Links != null) __obj.updateDynamic("Links")(Links.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
}

