package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:enable:interface-name */
trait EndpointSettings extends js.Object {
  var Aliases: js.UndefOr[js.Array[String]] = js.undefined
  var DriverOpts: js.UndefOr[StringDictionary[String]] = js.undefined
  var EndpointID: js.UndefOr[String] = js.undefined
  var Gateway: js.UndefOr[String] = js.undefined
  var GlobalIPV6PrefixLen: js.UndefOr[Double] = js.undefined
  var GlobalIPv6Address: js.UndefOr[String] = js.undefined
  var IPAMConfig: js.UndefOr[typings.dockerode.mod.IPAMConfig] = js.undefined
  var IPAddress: js.UndefOr[String] = js.undefined
  var IPPrefixLen: js.UndefOr[Double] = js.undefined
  var IPv6Gateway: js.UndefOr[String] = js.undefined
  var Links: js.UndefOr[js.Array[String]] = js.undefined
  var MacAddress: js.UndefOr[String] = js.undefined
  var NetworkID: js.UndefOr[String] = js.undefined
}

object EndpointSettings {
  @scala.inline
  def apply(
    Aliases: js.Array[String] = null,
    DriverOpts: StringDictionary[String] = null,
    EndpointID: String = null,
    Gateway: String = null,
    GlobalIPV6PrefixLen: js.UndefOr[Double] = js.undefined,
    GlobalIPv6Address: String = null,
    IPAMConfig: IPAMConfig = null,
    IPAddress: String = null,
    IPPrefixLen: js.UndefOr[Double] = js.undefined,
    IPv6Gateway: String = null,
    Links: js.Array[String] = null,
    MacAddress: String = null,
    NetworkID: String = null
  ): EndpointSettings = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases.asInstanceOf[js.Any])
    if (DriverOpts != null) __obj.updateDynamic("DriverOpts")(DriverOpts.asInstanceOf[js.Any])
    if (EndpointID != null) __obj.updateDynamic("EndpointID")(EndpointID.asInstanceOf[js.Any])
    if (Gateway != null) __obj.updateDynamic("Gateway")(Gateway.asInstanceOf[js.Any])
    if (!js.isUndefined(GlobalIPV6PrefixLen)) __obj.updateDynamic("GlobalIPV6PrefixLen")(GlobalIPV6PrefixLen.get.asInstanceOf[js.Any])
    if (GlobalIPv6Address != null) __obj.updateDynamic("GlobalIPv6Address")(GlobalIPv6Address.asInstanceOf[js.Any])
    if (IPAMConfig != null) __obj.updateDynamic("IPAMConfig")(IPAMConfig.asInstanceOf[js.Any])
    if (IPAddress != null) __obj.updateDynamic("IPAddress")(IPAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(IPPrefixLen)) __obj.updateDynamic("IPPrefixLen")(IPPrefixLen.get.asInstanceOf[js.Any])
    if (IPv6Gateway != null) __obj.updateDynamic("IPv6Gateway")(IPv6Gateway.asInstanceOf[js.Any])
    if (Links != null) __obj.updateDynamic("Links")(Links.asInstanceOf[js.Any])
    if (MacAddress != null) __obj.updateDynamic("MacAddress")(MacAddress.asInstanceOf[js.Any])
    if (NetworkID != null) __obj.updateDynamic("NetworkID")(NetworkID.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointSettings]
  }
}

