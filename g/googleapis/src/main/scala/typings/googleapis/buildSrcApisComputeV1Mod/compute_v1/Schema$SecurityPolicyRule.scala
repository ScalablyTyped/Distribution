package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a rule that describes one or more match conditions along with
  * the action to be taken when traffic matches this condition (allow or deny).
  */
@js.native
trait Schema$SecurityPolicyRule extends js.Object {
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
    * [Output only] Type of the resource. Always compute#securityPolicyRule for
    * security policy rules
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A match condition that incoming traffic is evaluated against. If it
    * evaluates to true, the corresponding ?action? is enforced.
    */
  var `match`: js.UndefOr[Schema$SecurityPolicyRuleMatcher] = js.native
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
}

object Schema$SecurityPolicyRule {
  @scala.inline
  def apply(
    action: String = null,
    description: String = null,
    kind: String = null,
    `match`: Schema$SecurityPolicyRuleMatcher = null,
    preview: js.UndefOr[Boolean] = js.undefined,
    priority: Int | Double = null
  ): Schema$SecurityPolicyRule = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SecurityPolicyRule]
  }
}

