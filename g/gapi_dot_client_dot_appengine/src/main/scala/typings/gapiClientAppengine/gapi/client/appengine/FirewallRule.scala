package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirewallRule extends js.Object {
  /** The action to take on matched requests. */
  var action: js.UndefOr[String] = js.undefined
  /** An optional string description of this rule. This field has a maximum length of 100 characters. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules with the lowest priority are evaluated first.A default
    * rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be modified by the
    * user.
    */
  var priority: js.UndefOr[Double] = js.undefined
  /**
    * IP address or range, defined using CIDR notation, of requests that this rule applies to. You can use the wildcard character "&#42;" to match all IPs
    * equivalent to "0/0" and "::/0" together. Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32  or
    * 2001:0db8:0000:0042:0000:8a2e:0370:7334.<p>Truncation will be silently performed on addresses which are not properly truncated. For example, 1.2.3.4/24
    * is accepted as the same address as 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as 2001:db8::/32.
    */
  var sourceRange: js.UndefOr[String] = js.undefined
}

object FirewallRule {
  @scala.inline
  def apply(
    action: String = null,
    description: String = null,
    priority: js.UndefOr[Double] = js.undefined,
    sourceRange: String = null
  ): FirewallRule = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (sourceRange != null) __obj.updateDynamic("sourceRange")(sourceRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallRule]
  }
}

