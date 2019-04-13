package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:enable:interface-name */
trait EndpointSettings extends js.Object {
  var Aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var DriverOpts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var EndpointID: js.UndefOr[java.lang.String] = js.undefined
  var Gateway: js.UndefOr[java.lang.String] = js.undefined
  var GlobalIPV6PrefixLen: js.UndefOr[scala.Double] = js.undefined
  var GlobalIPv6Address: js.UndefOr[java.lang.String] = js.undefined
  var IPAMConfig: js.UndefOr[IPAMConfig] = js.undefined
  var IPAddress: js.UndefOr[java.lang.String] = js.undefined
  var IPPrefixLen: js.UndefOr[scala.Double] = js.undefined
  var IPv6Gateway: js.UndefOr[java.lang.String] = js.undefined
  var Links: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var MacAddress: js.UndefOr[java.lang.String] = js.undefined
  var NetworkID: js.UndefOr[java.lang.String] = js.undefined
}

object EndpointSettings {
  @scala.inline
  def apply(
    Aliases: js.Array[java.lang.String] = null,
    DriverOpts: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    EndpointID: java.lang.String = null,
    Gateway: java.lang.String = null,
    GlobalIPV6PrefixLen: scala.Int | scala.Double = null,
    GlobalIPv6Address: java.lang.String = null,
    IPAMConfig: IPAMConfig = null,
    IPAddress: java.lang.String = null,
    IPPrefixLen: scala.Int | scala.Double = null,
    IPv6Gateway: java.lang.String = null,
    Links: js.Array[java.lang.String] = null,
    MacAddress: java.lang.String = null,
    NetworkID: java.lang.String = null
  ): EndpointSettings = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases)
    if (DriverOpts != null) __obj.updateDynamic("DriverOpts")(DriverOpts)
    if (EndpointID != null) __obj.updateDynamic("EndpointID")(EndpointID)
    if (Gateway != null) __obj.updateDynamic("Gateway")(Gateway)
    if (GlobalIPV6PrefixLen != null) __obj.updateDynamic("GlobalIPV6PrefixLen")(GlobalIPV6PrefixLen.asInstanceOf[js.Any])
    if (GlobalIPv6Address != null) __obj.updateDynamic("GlobalIPv6Address")(GlobalIPv6Address)
    if (IPAMConfig != null) __obj.updateDynamic("IPAMConfig")(IPAMConfig)
    if (IPAddress != null) __obj.updateDynamic("IPAddress")(IPAddress)
    if (IPPrefixLen != null) __obj.updateDynamic("IPPrefixLen")(IPPrefixLen.asInstanceOf[js.Any])
    if (IPv6Gateway != null) __obj.updateDynamic("IPv6Gateway")(IPv6Gateway)
    if (Links != null) __obj.updateDynamic("Links")(Links)
    if (MacAddress != null) __obj.updateDynamic("MacAddress")(MacAddress)
    if (NetworkID != null) __obj.updateDynamic("NetworkID")(NetworkID)
    __obj.asInstanceOf[EndpointSettings]
  }
}

