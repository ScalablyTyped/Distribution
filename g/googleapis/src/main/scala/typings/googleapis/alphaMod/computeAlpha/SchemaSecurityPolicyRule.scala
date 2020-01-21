package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a rule that describes one or more match conditions along with
  * the action to be taken when traffic matches this condition (allow or deny).
  */
@js.native
trait SchemaSecurityPolicyRule extends js.Object {
  /**
    * The Action to preform when the client connection triggers the rule. Can
    * currently be either &quot;allow&quot; or &quot;deny()&quot; where valid
    * values for status are 403, 404, and 502.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The direction in which this rule applies. This field may only be
    * specified when versioned_expr is set to FIREWALL.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * Denotes whether to enable logging for a particular rule. If logging is
    * enabled, logs will be exported to the configured export destination in
    * Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you
    * cannot enable logging on &quot;goto_next&quot; rules.  This field may
    * only be specified when the versioned_expr is set to FIREWALL.
    */
  var enableLogging: js.UndefOr[Boolean] = js.native
  /**
    * [Output only] Type of the resource. Always compute#securityPolicyRule for
    * security policy rules
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A match condition that incoming traffic is evaluated against. If it
    * evaluates to true, the corresponding ?action? is enforced.
    */
  var `match`: js.UndefOr[SchemaSecurityPolicyRuleMatcher] = js.native
  /**
    * If set to true, the specified action is not enforced.
    */
  var preview: js.UndefOr[Boolean] = js.native
  /**
    * An integer indicating the priority of a rule in the list. The priority
    * must be a positive value between 0 and 2147483647. Rules are evaluated
    * from highest to lowest priority where 0 is the highest priority and
    * 2147483647 is the lowest prority.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * Must be specified if the action is &quot;rate_based_blacklist&quot; or
    * &quot;throttle&quot;. Cannot be specified for any other actions.
    */
  var rateLimitOptions: js.UndefOr[SchemaSecurityPolicyRuleRateLimitOptions] = js.native
  /**
    * [Output Only] Calculation of the complexity of a single firewall security
    * policy rule.
    */
  var ruleTupleCount: js.UndefOr[Double] = js.native
  /**
    * A list of network resource URLs to which this rule applies. This field
    * allows you to control which network?s VMs get this rule. If this field is
    * left blank, all VMs within the organization will receive the rule.  This
    * field may only be specified when versioned_expr is set to FIREWALL.
    */
  var targetResources: js.UndefOr[js.Array[String]] = js.native
}

object SchemaSecurityPolicyRule {
  @scala.inline
  def apply(
    action: String = null,
    description: String = null,
    direction: String = null,
    enableLogging: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    `match`: SchemaSecurityPolicyRuleMatcher = null,
    preview: js.UndefOr[Boolean] = js.undefined,
    priority: Int | Double = null,
    rateLimitOptions: SchemaSecurityPolicyRuleRateLimitOptions = null,
    ruleTupleCount: Int | Double = null,
    targetResources: js.Array[String] = null
  ): SchemaSecurityPolicyRule = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLogging)) __obj.updateDynamic("enableLogging")(enableLogging.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (rateLimitOptions != null) __obj.updateDynamic("rateLimitOptions")(rateLimitOptions.asInstanceOf[js.Any])
    if (ruleTupleCount != null) __obj.updateDynamic("ruleTupleCount")(ruleTupleCount.asInstanceOf[js.Any])
    if (targetResources != null) __obj.updateDynamic("targetResources")(targetResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSecurityPolicyRule]
  }
}

