package typings.gapiClientCompute.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPProtocol extends js.Object {
  /**
    * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following
    * well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
    */
  var IPProtocol: js.UndefOr[String] = js.undefined
  /**
    * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a
    * range. If not specified, this rule applies to connections through any port.
    *
    * Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
    */
  var ports: js.UndefOr[js.Array[String]] = js.undefined
}

object IPProtocol {
  @scala.inline
  def apply(IPProtocol: String = null, ports: js.Array[String] = null): IPProtocol = {
    val __obj = js.Dynamic.literal()
    if (IPProtocol != null) __obj.updateDynamic("IPProtocol")(IPProtocol.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPProtocol]
  }
}

