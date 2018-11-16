package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IpConfiguration extends js.Object {
  /**
               * The list of external networks that are allowed to connect to the instance using the IP. In CIDR notation, also known as 'slash' notation (e.g.
               * 192.168.100.0/24).
               */
  var authorizedNetworks: js.UndefOr[js.Array[AclEntry]] = js.undefined
  /** Whether the instance should be assigned an IP address or not. */
  var ipv4Enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether SSL connections over IP should be enforced or not. */
  var requireSsl: js.UndefOr[scala.Boolean] = js.undefined
}

