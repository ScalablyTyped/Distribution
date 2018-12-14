package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_IPAddressHairpinMode extends js.Object {
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
  var Networks: org.scalablytyped.runtime.StringDictionary[Anon_IPAddress]
  var Node: js.UndefOr[Anon_ID] = js.undefined
  var Ports: org.scalablytyped.runtime.StringDictionary[js.Array[Anon_HostIp]]
  var SandboxID: java.lang.String
  var SandboxKey: java.lang.String
  var SecondaryIPAddresses: js.UndefOr[js.Any] = js.undefined
  var SecondaryIPv6Addresses: js.UndefOr[js.Any] = js.undefined
}

