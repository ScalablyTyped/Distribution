package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSecurityPolicyRuleMatcherConfig extends js.Object {
  /**
    * CIDR IP address range.  This field may only be specified when
    * versioned_expr is set to FIREWALL.
    */
  var destIpRanges: js.UndefOr[js.Array[String]] = js.native
  /**
    * Pairs of IP protocols and ports that the rule should match.  This field
    * may only be specified when versioned_expr is set to FIREWALL.
    */
  var destPorts: js.UndefOr[js.Array[SchemaSecurityPolicyRuleMatcherConfigDestinationPort]] = js.native
  /**
    * CIDR IP address range.
    */
  var srcIpRanges: js.UndefOr[js.Array[String]] = js.native
}

object SchemaSecurityPolicyRuleMatcherConfig {
  @scala.inline
  def apply(
    destIpRanges: js.Array[String] = null,
    destPorts: js.Array[SchemaSecurityPolicyRuleMatcherConfigDestinationPort] = null,
    srcIpRanges: js.Array[String] = null
  ): SchemaSecurityPolicyRuleMatcherConfig = {
    val __obj = js.Dynamic.literal()
    if (destIpRanges != null) __obj.updateDynamic("destIpRanges")(destIpRanges.asInstanceOf[js.Any])
    if (destPorts != null) __obj.updateDynamic("destPorts")(destPorts.asInstanceOf[js.Any])
    if (srcIpRanges != null) __obj.updateDynamic("srcIpRanges")(srcIpRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSecurityPolicyRuleMatcherConfig]
  }
}

