package typings.dockerode

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bridge extends js.Object {
  var Bridge: String
  var EndpointID: String
  var Gateway: String
  var GlobalIPv6Address: String
  var GlobalIPv6PrefixLen: Double
  var HairpinMode: Boolean
  var IPAddress: String
  var IPPrefixLen: Double
  var IPv6Gateway: String
  var LinkLocalIPv6Address: String
  var LinkLocalIPv6PrefixLen: Double
  var MacAddress: String
  var Networks: StringDictionary[Anon_Aliases]
  var Node: js.UndefOr[Anon_Addr] = js.undefined
  var Ports: StringDictionary[js.Array[Anon_HostIp]]
  var SandboxID: String
  var SandboxKey: String
  var SecondaryIPAddresses: js.UndefOr[js.Any] = js.undefined
  var SecondaryIPv6Addresses: js.UndefOr[js.Any] = js.undefined
}

object Anon_Bridge {
  @scala.inline
  def apply(
    Bridge: String,
    EndpointID: String,
    Gateway: String,
    GlobalIPv6Address: String,
    GlobalIPv6PrefixLen: Double,
    HairpinMode: Boolean,
    IPAddress: String,
    IPPrefixLen: Double,
    IPv6Gateway: String,
    LinkLocalIPv6Address: String,
    LinkLocalIPv6PrefixLen: Double,
    MacAddress: String,
    Networks: StringDictionary[Anon_Aliases],
    Ports: StringDictionary[js.Array[Anon_HostIp]],
    SandboxID: String,
    SandboxKey: String,
    Node: Anon_Addr = null,
    SecondaryIPAddresses: js.Any = null,
    SecondaryIPv6Addresses: js.Any = null
  ): Anon_Bridge = {
    val __obj = js.Dynamic.literal(Bridge = Bridge, EndpointID = EndpointID, Gateway = Gateway, GlobalIPv6Address = GlobalIPv6Address, GlobalIPv6PrefixLen = GlobalIPv6PrefixLen, HairpinMode = HairpinMode, IPAddress = IPAddress, IPPrefixLen = IPPrefixLen, IPv6Gateway = IPv6Gateway, LinkLocalIPv6Address = LinkLocalIPv6Address, LinkLocalIPv6PrefixLen = LinkLocalIPv6PrefixLen, MacAddress = MacAddress, Networks = Networks, Ports = Ports, SandboxID = SandboxID, SandboxKey = SandboxKey)
    if (Node != null) __obj.updateDynamic("Node")(Node)
    if (SecondaryIPAddresses != null) __obj.updateDynamic("SecondaryIPAddresses")(SecondaryIPAddresses)
    if (SecondaryIPv6Addresses != null) __obj.updateDynamic("SecondaryIPv6Addresses")(SecondaryIPv6Addresses)
    __obj.asInstanceOf[Anon_Bridge]
  }
}

