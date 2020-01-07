package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SecurityPolicyRuleMatcherConfigDestinationPort extends js.Object {
  /**
    * The IP protocol to which this rule applies. The protocol type is required
    * when creating a firewall rule. This value can either be one of the
    * following well known protocol strings (tcp, udp, icmp, esp, ah, ipip,
    * sctp), or the IP protocol number.
    */
  var ipProtocol: js.UndefOr[String] = js.native
  /**
    * An optional list of ports to which this rule applies. This field is only
    * applicable for UDP or TCP protocol. Each entry must be either an integer
    * or a range. If not specified, this rule applies to connections through
    * any port.  Example inputs include: [&quot;22&quot;],
    * [&quot;80&quot;,&quot;443&quot;], and [&quot;12345-12349&quot;].  This
    * field may only be specified when versioned_expr is set to FIREWALL.
    */
  var ports: js.UndefOr[js.Array[String]] = js.native
}

object Schema$SecurityPolicyRuleMatcherConfigDestinationPort {
  @scala.inline
  def apply(ipProtocol: String = null, ports: js.Array[String] = null): Schema$SecurityPolicyRuleMatcherConfigDestinationPort = {
    val __obj = js.Dynamic.literal()
    if (ipProtocol != null) __obj.updateDynamic("ipProtocol")(ipProtocol.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SecurityPolicyRuleMatcherConfigDestinationPort]
  }
}

