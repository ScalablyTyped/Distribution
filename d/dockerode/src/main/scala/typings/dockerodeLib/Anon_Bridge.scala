package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bridge extends js.Object {
  var Bridge: java.lang.String
  var EndpointID: java.lang.String
  var Gateway: java.lang.String
  var GlobalIPv6Address: java.lang.String
  var GlobalIPv6PrefixLen: scala.Double
  var HairpinMode: scala.Boolean
  var IPAddress: java.lang.String
  var IPPrefixLen: scala.Double
  var IPv6Gateway: java.lang.String
  var LinkLocalIPv6Address: java.lang.String
  var LinkLocalIPv6PrefixLen: scala.Double
  var MacAddress: java.lang.String
  var Networks: org.scalablytyped.runtime.StringDictionary[Anon_Aliases]
  var Node: js.UndefOr[Anon_Addr] = js.undefined
  var Ports: org.scalablytyped.runtime.StringDictionary[js.Array[Anon_HostIp]]
  var SandboxID: java.lang.String
  var SandboxKey: java.lang.String
  var SecondaryIPAddresses: js.UndefOr[js.Any] = js.undefined
  var SecondaryIPv6Addresses: js.UndefOr[js.Any] = js.undefined
}

object Anon_Bridge {
  @scala.inline
  def apply(
    Bridge: java.lang.String,
    EndpointID: java.lang.String,
    Gateway: java.lang.String,
    GlobalIPv6Address: java.lang.String,
    GlobalIPv6PrefixLen: scala.Double,
    HairpinMode: scala.Boolean,
    IPAddress: java.lang.String,
    IPPrefixLen: scala.Double,
    IPv6Gateway: java.lang.String,
    LinkLocalIPv6Address: java.lang.String,
    LinkLocalIPv6PrefixLen: scala.Double,
    MacAddress: java.lang.String,
    Networks: org.scalablytyped.runtime.StringDictionary[Anon_Aliases],
    Ports: org.scalablytyped.runtime.StringDictionary[js.Array[Anon_HostIp]],
    SandboxID: java.lang.String,
    SandboxKey: java.lang.String,
    Node: Anon_Addr = null,
    SecondaryIPAddresses: js.Any = null,
    SecondaryIPv6Addresses: js.Any = null
  ): Anon_Bridge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bridge")(Bridge)
    __obj.updateDynamic("EndpointID")(EndpointID)
    __obj.updateDynamic("Gateway")(Gateway)
    __obj.updateDynamic("GlobalIPv6Address")(GlobalIPv6Address)
    __obj.updateDynamic("GlobalIPv6PrefixLen")(GlobalIPv6PrefixLen)
    __obj.updateDynamic("HairpinMode")(HairpinMode)
    __obj.updateDynamic("IPAddress")(IPAddress)
    __obj.updateDynamic("IPPrefixLen")(IPPrefixLen)
    __obj.updateDynamic("IPv6Gateway")(IPv6Gateway)
    __obj.updateDynamic("LinkLocalIPv6Address")(LinkLocalIPv6Address)
    __obj.updateDynamic("LinkLocalIPv6PrefixLen")(LinkLocalIPv6PrefixLen)
    __obj.updateDynamic("MacAddress")(MacAddress)
    __obj.updateDynamic("Networks")(Networks)
    __obj.updateDynamic("Ports")(Ports)
    __obj.updateDynamic("SandboxID")(SandboxID)
    __obj.updateDynamic("SandboxKey")(SandboxKey)
    if (Node != null) __obj.updateDynamic("Node")(Node)
    if (SecondaryIPAddresses != null) __obj.updateDynamic("SecondaryIPAddresses")(SecondaryIPAddresses)
    if (SecondaryIPv6Addresses != null) __obj.updateDynamic("SecondaryIPv6Addresses")(SecondaryIPv6Addresses)
    __obj.asInstanceOf[Anon_Bridge]
  }
}

