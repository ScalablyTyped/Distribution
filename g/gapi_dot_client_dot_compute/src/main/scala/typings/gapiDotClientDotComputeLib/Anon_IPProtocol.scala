package typings
package gapiDotClientDotComputeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_IPProtocol extends js.Object {
  /**
                   * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following
                   * well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
                   */
  var IPProtocol: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a
                   * range. If not specified, this rule applies to connections through any port.
                   *
                   * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
                   */
  var ports: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

